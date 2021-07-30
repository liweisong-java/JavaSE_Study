package IOFileReaderWriterTest;

import org.junit.Test;

import java.io.*;

/**
 * 测试FileInputStream和FileOutputStream
 * * 结论：
 *  *  1.对于文本文件(.txt   .java   .c  .cpp)，使用字符流处理
 *  *  2.对于非文本文件(.jpg  .mp3    .mp4    .avi    .doc    .ppt)，使用字节流处理

 * @author liweisong
 * @2021072021/7/1313:11
 *
 */
public class FileInputOutputStreamTest {
    //使用字节流FileInputStream处理文本文件，可能出现乱码
    @Test
    public void testFileInputStream(){
        FileInputStream fileInputStream = null;
        try {
            //1.造文件
            File file = new File("日志.txt");
            //2.造流
            fileInputStream = new FileInputStream(file);
            //3.读数据
            byte[] buffer = new byte[5];
            int len;//记录每次读取的字节的个数
            while((len = fileInputStream.read(buffer)) != -1){
                String str = new String(buffer,0,len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            if (fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
    /*
    实现对图片的复制操作
     */
    @Test
    public void testFileInputOutputStream(){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //
            File srcfile = new File("排队的时候最讨厌遇到的情况，中枪的有木有.gif");
            File destfile = new File("排队2.gif");

            //
            fis = new FileInputStream(srcfile);
            fos = new FileOutputStream(destfile);

            //复制的过程
            byte[] buffer = new byte[5];
            int len;
            while ((len = fis.read(buffer)) != -1){
                fos.write(buffer , 0 ,len);
            }
            System.out.println("复制成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
