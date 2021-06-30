package 异常;
/*
 * 1.finally是可选的
 * 2.使用try将可能出现异常代码包装起来，在执行过程中，一旦出现异常就会生成一个对应异常类的对象，根据此对象的类型去catch种进行匹配
 * 3.一旦try中的异常对象匹配到某一个catch时，就进入catch中惊醒异常处理，一旦处理完成，
 * 就跳出当前的try-catch结构（如果没有finally的情况）继续执行后面的代码
 * 4.catch中的异常类型如果没有子父类关系，则谁声明在上，谁声明在下无所谓
 *	 catch中的异常类型如果满足子父类关系，则要求子类一定声明在父类上面，否则报错。
 *5.常用的异常对象处理方式 
 *			① String getMessage()    
 *			②printStackTrace()
 *6.在try结构中声明的变量，再除了try结构以后就不能再被调用
 *7.try-catch-finally结构可以嵌套
 *
 *体会1：使用try-catch-finally处理编译时异常，使得程序再编译时就不再报错，但运行时仍可能报错
 *	   相当于我们使用try-catch-finally将一个编译时出现的异常，延迟到运行时出现。
 *体会2：开发中由于运行时异常比较常见，所以我们通常不针对运行时异常编写
 *try-catch-finally了针对编译时异常，我们说一定要考虑异常的处理
 *
 *
 *方法的重写的规则之一：
 *		子类重写的方法抛出的异常不大于父类被重写的方法抛出的异常类型
 */
public class ExceptionTest1 {
	public void test1() {
		String str = "123";
		str = "abc";
		int num = 0;
		try {
			num = Integer.parseInt(str);
			System.out.println("hello----------1");
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}catch(NullPointerException e) {
			System.out.println("出现空指针异常了");
		}catch(Exception e) {
			System.out.println("出现异常了，不要着急.....");
		}
		System.out.println("hello----------2");
	}
}
