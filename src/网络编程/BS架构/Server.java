package 网络编程.BS架构;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("----服务端启动成功----");
        // 1.创建ServerSocket的对象，同时为服务端注册端口
        ServerSocket serverSocket = new ServerSocket(8080);
        // 创建出一个线程池，负责处理通信管道的任务
        ThreadPoolExecutor pool = new ThreadPoolExecutor(8 * 2, 8 * 2, 0, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(8), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        while (true) {
            // 2. 使用serverSocket对象，调用一个accept方法，等待客户端的连接
            Socket socket = serverSocket.accept();

            System.out.println("有人上线了" + socket.getRemoteSocketAddress());

            // 3.把这个客户端对应的socket通信管道，交给一个独立的线程负责处理
            pool.execute(new ServerReaderRunable(socket));
        }

    }
}
