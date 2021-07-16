package InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 一.网络编程中有两个主要的问题
 *      1.如何准确的定位网络上一台或多台主机：定位主机上的特定的应用
 *      2.找到主机后如何可靠高效的进行数据传输
 *
 * 二.网络编程中的两个要素
 *      1.对应的问题一：IP和端口号
 *      2.对应的问题二：提供网络通信协议：TCP/IP参考模型（应用层，传输层，网络层，物理+数据链路层）
 *
 * 三.通信要素一：IP和端口号
 *  1.IP：唯一的表示Internet上的计算机（通信实体）
 *  2.再Java中使用InetAddress类代表IP
 *  3.IP分类：IPv4和IPv6; 万维网 和 局域网
 *  4.域名： www.baidu.com    www.mi.com   www.sina.com  www.jd.com   www.vip.com
 *  5.本地回路地址：127.0.0.1   对应着localhost
 *  6.如何实例化InetAddress：两个方法：getByName(String host)    getLocalHost(String host)
 *          两个常用方法：getHostName() / getHostAddress;
 *  7.端口号：正在计算机运行的进程
 *  要求：不同的进程有不同的端口号
 *  范围：被规定为一个16位的整数0~65535
 *  8.端口号与ip地址的组合得出一个网络套接字：Socket
 *
 *
 * @author 李伟松
 * @2021 07   2021/7/14  17:17
 */
public class InetAddressTest {
    public static void main(String[] args) {
        try {
            //File file = new File("hello.txt");
            InetAddress inet1 = InetAddress.getByName("198.163.1.1");

            System.out.println(inet1);

            InetAddress inet2 = InetAddress.getByName("www.atguigu.com");
            System.out.println(inet2);

            InetAddress inet3 = InetAddress.getByName("127.0.0.1");
            System.out.println(inet3);

            //获取本地IP
            InetAddress inet4 = InetAddress.getLocalHost();
            System.out.println(inet4);

            //getHostName()
            System.out.println(inet2.getHostName());

            //getHostAddress()
            System.out.println(inet2.getHostAddress());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
