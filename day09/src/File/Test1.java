package File;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author liweisong
 * @2021072021/7/1111:52
 */
public class Test1 {
    @Test
    public void test1() throws IOException {
        File file = new File("D:\\idea\\IO\\hi.txt");
        //创建一个file同目录下的另一个文件，文件名为：haha.txt
        File file1 = new File(file.getParent(),"haha.txt");
        boolean newFile1 = file1.createNewFile();
        if (newFile1){
            System.out.println("创建成功");
        }
    }
    @Test
    public void test2(){
        File file = new File("D:\\idea\\IO");
        String[] arr = file.list();
        for (String c : arr){
            if (c.endsWith(".jpg")){
                System.out.println(c);
            }
        }
    }

}
