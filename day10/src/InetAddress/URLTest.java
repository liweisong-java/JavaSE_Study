package InetAddress;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * URL网络编程
 * 1.URL：统一资源定位符，对应着互联网得某一资源地址
 * 2.格式
 *      http://baidu:8080/examples/排队.gif?username=Tom
 *      协议   主机名  端口号  资源地址     参数列表
 *
 * @author 李伟松
 * @2021 07   2021/7/16  14:01
 */
public class URLTest {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://baidu:8080/examples/排队.gif?username=Tom");
            //public String getProtocol( ) 获取该URL的协议名
            System.out.println(url.getProtocol());
            //public String getHost( ) 获取该URL的主机名
            System.out.println(url.getHost());
            //public String getPort( ) 获取该URL的端口号
            System.out.println(url.getPort());
            //public String getPath( ) 获取该URL的文件路径
            System.out.println(url.getPath());
            //public String getFile( ) 获取该URL的文件名
            System.out.println(url.getFile());
            //public String getQuery( ) 获取该URL的查询名
            System.out.println(url.getQuery());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
