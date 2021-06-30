package 异常;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 异常处理的方式2：throws + 异常类型
 * 
 * "throws" + 异常类型，写在方法的声明处，指明此方法执行时，可能会抛出的异常类型
 * 	一旦方法体执行时出现异常，仍会异常代码处生成一个异常类的对象，此对象满足throws后异常类型时，
 *  就会被抛出异常代码后续的代码就不再执行
 *  
 *  体会：try-catch-finally：真正的把异常处理掉了
 *      throws的方式只是将异常抛给了方法的调用者，并没有真正的将异常处理掉
 *      
 *      
 *   开发中如何选择try-catch-finally还是使用throws？
 *   
 *   如果父类中被重写的方法没有throws方式处理异常，则子类重写的方法也不能使用throws，
 *   	意味着如果子类重写的方法中有异常必须使用try-catch-finally方式处理
 *   执行的方法中，先后有调用了另外的几个方法，着几个方法是递进关系执行的，我们建议这几个方法使用throws的方式进行处理，
 *   而执行的方法A可以考虑用try-catch-finally方式进行处理
     
     		
 *   
 */
public class ExcptionTest2 {
	public static void main(String[] args){
		
		try {
			method2();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void method2 () throws IOException{
		method1();
	}
	public static void method1() throws FileNotFoundException,IOException{
		File file = new File("hello.txt");
		FileInputStream fis = new FileInputStream(file);
		
		int data = fis.read();
		while(data != -1) {
			System.out.print((char)data);
			data = fis.read();
		}
		fis.close();
	}
}
