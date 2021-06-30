/*
 * 
 * 
 * 
 * static 关键字的使用
 * 			static 静态的
 * 			static 可以用来修饰属性.方法.代码块.内部类
 * 
 * 
 * 使用static修饰属性:静态变量（类变量）
 * 		3.1 属性：按是否使用static修饰，又分为：静态属性，非静态属性(实例变量)
 * 		实例变量：我们创建了类的多个对象，每个对象都独立的拥有一套类中的非静态属性。
 * 当修改其中一个对象中的非静态属性时，不会导致其他对象同样的属性值的修改
 * 		静态变量：我们创建了多个对象，多个对象共享同一个静态变量，当通过某一个对象去修改某一个静态变量时，
 * 会导致其他对象调用此静态变量时修改过了的
 * 
 * 		3.2 static修饰属性的其他说明：
 * 			①静态彬良随类的加载而加载。可以通过"类.静态变量"的方式调用
 * 			②静态变量的加载要早于对象的创建。
 * 			③由于类只会加载一次，则静态变量的内存中也会存在一份：存在方法区的静态域中。
 * 			④    类变量   实例变量
 * 			类	  yes    no
 * 			对象   yes	 yes
 * 
 * 		3.3静态属性举例：System.out; Math.PI;
 * 
 * 使用static修饰方法:静态方法
 * 			①随着类的加载而加载，可以通过“类.静态方法”的方式调用
 * 			②    静态方法   非静态方法
 * 			类	   yes      no
 * 			对象    yes	    yes
 * 			③静态方法中，只能调用静态的方法或属性
 * 			 对于非静态方法，既可以调用非静态的方法属性，也可以调用静态的方法属性
 * 
 * static注意点：
 * 			在静态的方法内，不能使用this关键字 super关键字
 * 			关于静态属性和静态方法的使用：大家都从生命周期的角度区理解
 * 
 * 开发中如何确定一个属性是否声明为static
 * 			>属性是可以被多个对象共享的，不会随着对象的不同而不同的
 * 			
 * 开发中如何确定一个方法是否声明为static
 * 			>操作静态属性的方法，通常设置为static
 * 			>工具类中的方法，习惯上声明为static的.比如Math  Arrays  Collections
 * 			>
 */
public class StaticTest {
	public static void main(String[] args) {
		
		
		//类.静态属性
		Chinese.nation = "中国";
		
		
		
		Chinese c1 = new Chinese();
		c1.name = "姚明";
		c1.age = 40;
		
		Chinese c2 = new Chinese();
		c2.name = "马龙";
		c2.age = 30;
				
		c2.nation = "CHINA";
		c1.nation = "CHN";
		System.out.println(c2.nation);
		
		
	}
}
class Chinese{
	String name;
	int age;
	static String nation;
	
	public void eat() {
		System.out.println("中国人吃中餐");
	}
	
	public static void show() {
		System.out.println("我是一个中国人");
	}
}