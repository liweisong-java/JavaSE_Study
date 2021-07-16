package InetAddress;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 实现TCP的网络编程
 *
 * 例题2：客户发送文件给服务端，服务端将文件保存到本地
 *
 * @author 李伟松
 * @2021 07   2021/7/15  17:03
 */
public class TCPTest2 {

    @Test
    public void client() throws IOException {
        //1.
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9090);
        //2.
        OutputStream os = socket.getOutputStream();
        //3.
        FileInputStream fis = new FileInputStream(new File("排队3.gif"));
        //4.
        byte[] buffer = new byte[1024];
        int len;
        while ((len = fis.read(buffer)) != -1){
            os.write(buffer,0,len);
        }
        //5.
        fis.close();
        os.close();
        socket.close();
    }

    @Test
    public void server() throws IOException {
        //1.创建服务端服务器，指明端口号
        ServerSocket ss = new ServerSocket(9090);
        //2.调用accept()表明接收来自于客户端的socket
        Socket socket = ss.accept();
        //3.读取输入流当中的数据
        InputStream is = socket.getInputStream();
        //4.输出流输出排队3
        FileOutputStream fos = new FileOutputStream(new File("排队3.gif"));
        //5.复制的过程
        byte[] buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer)) != -1){
            fos.write(buffer , 0 ,len);
        }
        //6.
        fos.close();
        is.close();
        socket.close();
        ss.close();

    }
}
