import org.junit.Test;

import java.io.*;

/**
 * 对象流的使用
 * 1.ObjectInputStream 和 ObjectOutputStream
 * 2.作用：用于存储和读取基本数据类型或对象的处理流，他的强大之处就是可以把Java中的对象写入到数据源中，也能把对象从数据源还原回来
 *
 * @author 李伟松
 * @2021 07   2021/7/14  11:43
 */
public class ObjectInputOutputStreamTest {
    /*
    序列化过程：将内存中的java对象保存到磁盘中或通过网络传输出去
     */
    @Test
    public void testObjectOutputStream(){
        ObjectOutputStream oos = null;
        try {
            //1.
            oos = new ObjectOutputStream(new FileOutputStream("Object.dat"));
            //2.
            oos.writeObject(new String("我爱北京天安门"));
            //3.
            oos.flush();//刷新操作
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.
            if (oos != null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }}}}

    /*
    反序列化：将磁盘文件中的对象还原为内存中的一个Java对象
    使用ObjectInputStream来实现
     */
    @Test
    public void testObjectInputStream(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("Object.dat"));
            Object obj = ois.readObject();
            String str = (String) obj;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
