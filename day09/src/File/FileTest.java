package File;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * File类的使用
 *
 * 1.File类的一个对象，代表一个文件或一个文件目录（俗称文件夹）
 * 2.File类声明在java.io包下
 * 3.File类涉及到关于文件或文件目录的创建，删除，重命名，修改时间，文件大小等方法
 *          并未涉及到写入或读取文件内容的操作，如果需要读取或写入文件内容，必须使用IO流来完成，
 * 4.后续File类的对象常会作为参数传递到流的构造器中，指明读取或写入的“终点”
 *
 * @author liweisong
 * @2021072021/7/1017:48
 */
public class FileTest {
    /*
    1.如何创造File类的实例

    2.
    相对路径:相较于某个路径下，指明的路径
    绝对路径包含盼复在内的文件或文件目录的路径

    3.路径分割符
    windows:\\
    lunix:/

     */
    @Test
    public void test1(){
        //构造器1
        File file1 = new File("hello.txt");//相对于当前module
        File file2 = new File("D:\\idea\\work\\day09\\he.txt");
        System.out.println(file1);
        System.out.println(file2);

        //构造器2
        File file3 = new File("D:\\idea\\work","day09");
        System.out.println(file3);

        //构造器3
        File file4 = new File(file3,"hi.txt");
        System.out.println(file4);
    }

    /*
 File类的获取功能
     public String getAbsolutePath()：获取绝对路径
     public String getPath() ：获取路径
     public String getName() ：获取名称
     public String getParent()：获取上层文件目录路径。若无，返回null
     public long length() ：获取文件长度（即：字节数）。不能获取目录的长度。
     public long lastModified() ：获取最后一次的修改时间，毫秒值

    如下的两个方法适用于文件目录
     public String[] list() ：获取指定目录下的所有文件或者文件目录的名称数组
     public File[] listFiles() ：获取指定目录下的所有文件或者文件目录的File数组

 File类的判断功能
     public boolean isDirectory()：判断是否是文件目录
     public boolean isFile() ：判断是否是文件
     public boolean exists() ：判断是否存在
     public boolean canRead() ：判断是否可读
     public boolean canWrite() ：判断是否可写
     public boolean isHidden() ：判断是否隐藏
 File类的创建功能
     public boolean createNewFile() ：创建文件。若文件存在，则不创建，返回false
     public boolean mkdir() ：创建文件目录。如果此文件目录存在，就不创建了。如果此文件目录的上层目录不存在，也不创建。
     public boolean mkdirs() ：创建文件目录。如果上层文件目录不存在，一并创建
            注意事项：如果你创建文件或者文件目录没有写盘符路径，那么，默认在项目路径下。
 File类的删除功能
     public boolean delete()：删除文件或者文件夹
    删除注意事项：
        Java中的删除不走回收站。 要删除一个文件目录，请注意该文件目录内不能包含文件或者文件目录
     */
    @Test
    public void test2(){
        File file1 = new File("hello.txt");
        File file2 = new File("D:\\idea\\IO\\hi.txt");

        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(new Date(file1.lastModified()));

        System.out.println("**************************");

        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getPath());
        System.out.println(file2.getName());
        System.out.println(file2.getParent());
        System.out.println(file2.length());
        System.out.println(new Date(file1.lastModified()));
    }
    @Test
    public void test3(){
        File file = new File("D:\\idea\\work");
        String[] list = file.list();
        for(String s : list){
            System.out.println(s);
        }
        System.out.println("**********************************");
        File[] files = file.listFiles();
        for(File f : files){
            System.out.println(f.toString());
        }
    }
    /*
 File类的重命名功能
     public boolean renameTo(File dest):把文件重命名为指定的文件路径
    比如file1.renameTo(file2)为例
     要想保证返回true ，需要file1在硬盘中时存在的，且file2不能在硬盘中存在
     */
    @Test
    public void test4(){
        File file1 = new File("hello.txt");
        File file2 = new File("D:\\idea\\IO\\hi.txt");
        boolean renameTo = file1.renameTo(file2);
        System.out.println(renameTo);

    }
    /*
 File类的判断功能
     public boolean isDirectory()：判断是否是文件目录
     public boolean isFile() ：判断是否是文件
     public boolean exists() ：判断是否存在
     public boolean canRead() ：判断是否可读
     public boolean canWrite() ：判断是否可写
     public boolean isHidden() ：判断是否隐藏
     */
    @Test
    public void test5(){
        File file = new File("hello.txt");
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isHidden());

        System.out.println("*****************************");

        File file1 = new File("D:\\idea\\IO");
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.exists());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.isHidden());
    }
    @Test
    /*
 File类的创建功能
     public boolean createNewFile() ：创建文件。若文件存在，则不创建，返回false
     public boolean mkdir() ：创建文件目录。如果此文件目录存在，就不创建了。如果此文件目录的上层目录不存在，也不创建。
     */
    public void test6() throws IOException {
        File file = new File("hi.txt");
        if(!file.exists()){
            //文件的创建
            file.createNewFile();
            System.out.println("创建成功");
        }else{//文件存在
            file.delete();
            System.out.println("删除成功");
        }


    }
 /*
 File类的创建功能
     public boolean createNewFile() ：创建文件。若文件存在，则不创建，返回false
     public boolean mkdir() ：创建文件目录。如果此文件目录存在，就不创建了。如果此文件目录的上层目录不存在，也不创建。
     public boolean mkdirs() ：创建文件目录。如果上层文件目录不存在，一并创建
            注意事项：如果你创建文件或者文件目录没有写盘符路径，那么，默认在项目路径下。
 */
    //文件目录的创建
    @Test
    public void test7(){
        //文件目录的创建
        File file = new File("D:\\idea\\IO\\IO2");
        boolean mkdir = file.mkdir();
//        file.mkdirs();
        if (mkdir){
            System.out.println("创建成功1");
        }
        File file1 =new File("D:\\idea\\IO\\IO4\\IO3");
        boolean mkdir1 = file1.mkdirs();
        if (mkdir1){
            System.out.println("创建成功2");
        }
        for (int i = 0; i < 100; i++) {
            File file2 =new File("D:\\idea\\IO\\我\\创\\建\\了\\1\\0\\0\\层\\文\\件\\夹\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!\\玩儿!");
            boolean mkdirs3 = file2.mkdirs();
        }
    }

}
