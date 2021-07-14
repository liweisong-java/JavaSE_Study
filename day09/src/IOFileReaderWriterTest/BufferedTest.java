package IOFileReaderWriterTest;

import org.junit.Test;

import java.io.*;

/**
 * 处理流之一：缓冲流的使用
 *
 * 1.缓冲流:
 *      BufferedInputStream
 *      BufferedOutputStream
 *      BufferedReader
 *      BufferedWriter
 *
 * 2.作用：提高流的读取，写入速度
 *          提高读写速度的原因：内部提供了一个缓冲区
 *
 * 3.处理流：就是“套路”在已有的流的基础上
 * @author liweisong
 * @2021072021/7/1314:36
 */
public class BufferedTest {
    /*
    实现非文本文件的复制
     */
    @Test
    public void BufferedStreamTest(){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //1.造文件
            File srcFile = new File("排队2.gif");
            File destFile = new File("排队3.gif");
            //2.造流
            //2.1造节点流
            FileInputStream fis = new FileInputStream((srcFile));
            FileOutputStream fos = new FileOutputStream((destFile));
            //2.2造缓冲流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            //3.复制细节：读取，写入
            byte[] buffer = new byte[10];
            int len;
            while ((len = bis.read(buffer)) != -1){
                bos.write(buffer , 0 ,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //资源关闭
            //要求：先关闭外层的流，再关闭内层的流
            if(bis != null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bos != null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //说明：关闭外层流的同时，内层流也会自动的进行关闭，我们可以省略
//        fis.close();
//        fos.close();
        }
    }
    /*
    使用BufferedReader和BufferedWriter实现文件文件的复制
     */
    @Test
    public void testBufferedReaderBufferedWriter(){
        BufferedReader br = null;
        BufferedWriter wr = null;
        try {
            //造文件造流
            br = new BufferedReader(new FileReader(new File("hello.txt")));
            wr = new BufferedWriter(new FileWriter(new File("hello2.txt")));

            //读写操作
            char[] cbuf = new char[10];
            int len;
            while ((len = br.read(cbuf)) != -1){
                wr.write(cbuf , 0 ,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            if (br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (wr != null){
                try {
                    wr.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}