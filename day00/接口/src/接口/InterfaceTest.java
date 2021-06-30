package 接口;

/*
 * 接口的使用：
 * 1.接口用interface来定义
 * 2.在Java中，接口和类时并列的两个结构
 * 3.如何定义接口：定义接口中的成员
 * 
 * 		3.1 JDK7以前：只能定义全局常量和抽象方法
 * 				>全局常量：public static final   书写时可以省略不写
 * 				>抽象方法：public abstract的
 * 		3.2 JDK8：除了定义全局常量和抽象方法之外，还可以定义静态方法，默认方法（略）
 * 
 * 4.接口中不能定义构造器：意味着接口不可以实例化	
 * 5.在Java开发中，接口都通过类去实现(implements)的方式来使用
 * 		如果实现类覆盖了接口中所有抽象方法，则此实现类就可以实例化
 * 		如果实现类没有覆盖接口中所有的抽放方法，则此实现类仍为一个抽象类
 * 
 * 6.Java类可以实现多个接口---->弥补了Java单继承性的局限性
 *    格式：class AA extends BB implements CC,DD,EE
 *    
 * 7.接口与接口之间可以继承，而且可以多继承
 * 
 * *********************************
 * 8.接口的具体使用，体现多态性
 * 9.接口，实际上可以看做一种规范
 * 
 * 
 * 面试题
 * 		抽象类和接口有哪些异同
 * 			abstract      implements
 * 			都不能实例化
 * 			
 */
public class InterfaceTest {
	public static void main(String[] args) {
		System.out.println(Flyable.MAX_SPRRD);
		System.out.println(Flyable.MIN_SPEED);
//		Flyable.MIN_SPEED = 2;
	} 
}
interface Flyable{
	//全局常量
	public static final int MAX_SPRRD = 7900;
	int MIN_SPEED = 1;//省略public static final 
	
	//抽象方法
	public abstract void fly();
	//省略了public 
	void stop();
	//构造器
//	public Flyable() {};
}

class Plane implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	
}
