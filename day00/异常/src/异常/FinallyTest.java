package 异常;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;
/*
 * finally中声明的一定会执行的代码，即使catch中又出现了异常了，try中有return语句，catch中有return语句等情况
 * 
 * 像数据库链接，输入输出流，网络编程Socket等资源，JVM时不能自动回收的，
 * 我们需要自己手动的进行资源的释放，此时的资源释放，就需要声明在finally里
 */
public class FinallyTest {
	@Test
	public void test2() {
		FileInputStream fis = null; 
			try {
				File file = new File("hello.txt");
				fis = new FileInputStream(file);
				
				int data = fis.read();
				while(data != -1) {
					System.out.print((char)data);
					data = fis.read();
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	
	@Test
	public void test1() {
		try {
			int a = 10;
			int b = 0;
			System.out.println(a / b);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("我好帅啊");
		}
	}
}
