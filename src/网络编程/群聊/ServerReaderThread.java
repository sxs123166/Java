package 网络编程.群聊;

import java.io.*;
import java.net.Socket;

public class ServerReaderThread extends Thread{
    private Socket socket;
    public ServerReaderThread(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            while (true){
                try {
                    String msg = dis.readUTF();
                    System.out.println(msg);
                    // 把这个消息分发给全部客户端进行接收
                    sendMsgToAll(msg);
                } catch (IOException e) {
                    System.out.println("有人下线了");
                    Server.onLineSockets.remove(socket);
                    dis.close();
                    socket.close();
                    break;
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sendMsgToAll(String msg) throws IOException {
        // 发送给全部在线的socket管道进行接收
        for (Socket onLineSocket : Server.onLineSockets) {
            OutputStream os = onLineSocket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF(msg);
            dos.flush();
        }
    }
}
