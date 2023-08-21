package 网络编程.TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
//    public static void main(String[] args) throws IOException {
//        // 1.创建ServerSocket对象，同时为服务端注册端口
//        ServerSocket serverSocket = new ServerSocket(8888);
//
//        // 2.使用serverSocket对象，调用一个accept方法，等待客户端的连接请求
//        Socket socket = serverSocket.accept();
//
//        // 3.从socket通信管道中得到一个字节输入流
//        InputStream is = socket.getInputStream();
//
//        // 4.把原始的字节输入流包装成数据输入流
//        DataInputStream dis = new DataInputStream(is);
//
//        // 5. 使用数据输入流读取客户端发送过来的消息
//        while (true) {
//            try {
//                String rs = dis.readUTF();
//                System.out.println(rs);
//            } catch (IOException e) {
//                System.out.println(socket.getRemoteSocketAddress() + "离线了");
//                dis.close();
//                socket.close();
//                break;
//            }
//        }
//
//        // 获取客户端的IP地址
////        System.out.println(socket.getRemoteSocketAddress());
//
//
//    }
   public static void main(String[] args) throws IOException {
       System.out.println("----服务端启动----");
       // 1.创建ServerSocket对象，同时为服务端注册端口
       ServerSocket serverSocket = new ServerSocket(8888);

       while (true) {
           // 2.使用serverSocket对象，调用一个accept方法，等待客户端的连接请求
           Socket socket = serverSocket.accept();
           System.out.println("有人上线了" + socket.getRemoteSocketAddress());

           // 3.把这个客户端对应的socket通信管道， 交给一个独立的线程负责处理
           new ServerReaderThread(socket).start();
       }
  }
}
