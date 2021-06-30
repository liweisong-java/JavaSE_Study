package 面向对象;
/*
 * 方法重载：在同一个类中，允许存在一个以上的同名方法，只要他们的参数个数或者参数类型不同即可
 * 两同一不同：同一个类，同方法名
 *          参数列表不同，参数个数不同，参数类型不同。
 * 跟方法的权限修饰符，返回值类型，形参变量名，方法体都没有关系
 * 
 * 再通过兑现调用方法时，如何确定某一个指定方法
 *                 方法名---->参数列表
 *                 
 */
public class 方法重载 {
	public void getSum(int i ,int j) {
		System.out.println(i + j);
	}
	public void getSum(double i ,double j) {
		System.out.println(i + j);
	}
	
	
	
	
	
	
	public void getSum(String i ,int j) {
		System.out.println(i + j);
	}
	public void getSum(int i ,String j) {
		System.out.println(i + j);
	}
	
	
	
	
	
}
