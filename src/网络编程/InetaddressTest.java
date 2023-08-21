package 网络编程;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetaddressTest {
    public static void main(String[] args) throws IOException {
        // 1.获取本机的IP地址对象
        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println(ip1.getHostName());
        System.out.println(ip1.getHostAddress());

        // 2.获取指定ip或者域名的IP地址对象
        InetAddress ip2 = InetAddress.getByName("www.baudu.com");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());
        // ping www.baidu.com
        // 在指定，判断主机与该IP是否联通
        System.out.println(ip2.isReachable(6000));


    }
}
