package 网络编程.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        // 1.创建客户端对象
        DatagramSocket socket = new DatagramSocket();

        // 2.创建数据包对象封装要发出去的数据
//         public DatagramPacket(byte buf[], int length,
//        InetAddress address, int port) {
        // 参数一、封装要发出去的数据
        // 参数二、发送出去的数据大小（字节个数）
        // 参数三、服务端的IP地址（找到服务端主机）
        // 参数四、服务端程序的端口
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请说：");
            String msg = sc.nextLine();
//            byte[] bytes = "我是客户端，发送数据abc".getBytes();

            // 输入exit命令，就退出
            if("exit".equals(msg)) {
                System.out.println("欢迎下次光临！退出成功！");
                socket.close();
                break;
            }

            byte[] bytes = msg.getBytes();
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(),
                    6666);

            // 3.开始正式的发送数据
            socket.send(packet);
        }

        System.out.println("客户端数据发送完毕～～～～");
        socket.close(); //释放资源
    }
}
