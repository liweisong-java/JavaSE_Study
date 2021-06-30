package 面向对象;
/*
 * 
 * java,面向对象学习三条主线（4-6章）
 * 1.java类及类的成员：属性，方法，构造器，代码块，内部类
 * 
 * 2.面向对象的三大特征：封装性，继承性，多态性（抽象性）
 * 
 * 3.其他关键字：this super static final 
 * abstract interface package import.
 * 
 * "大处着眼，小出着手"
 * 
 * 面向过程：强调的功能行为，以函数为最小单位，考虑怎么做
 * 面向对象：具备了功能的对象，以类或者对象为最小单位，考虑谁来做 
 * 
 * 面向对象两个要素
 * 类：对一类事物的描述，是抽象的.概念上的定义
 * 对象：是实际存在的该类事物的每个个体，因而也称为实例（instance）
 * >面向对象程序设计的重点是类的设计
 * 
 * 
 * 
 * >设计类，就是设计类的成员
 * 
 * 属性：对应类中的成员变量     
 * 行为：对应类中的成员方法
 * 
 * 
 * 属性 = 成员变量 = field = 域.字段
 * 方法 = 成员方法 = 函数 = method
 * 
 * 创建类的对象 = 类的实例化 = 实例化类
 * 
 * 类和对象的使用（面向对象思想落地的实现）
 * 1.创建类：设计类的成员
 * 2.创建类的对象
 * 3.对象.属性 或 对象.方法 调用对象结构
 * 
 * 如果创建了一个类的多个对象，则每个对象都独立的拥有一套类的属性（非static） 
 * 意味着：如果我们修改一个对象的属性a，则不影响另外一个对象属性a的值
 * 
 * 
 */

/*
public class OOP {
	public static void main(String[] args) {
		//2.创造person类的对象
		Person p1 = new Person();
		//Scanner scanner = new Scanner(System.in);
		
		//调用对象的结构：属性，方法
		//调用属性：“对象.属性”
		p1.name = "Tom";
		p1.isMale = true;
		System.out.println(p1.name);
		
		//调用方法：“对象.方法”
		p1.eat();
		p1.sleep();
		p1.talk("Chinese");
		
		Person p2 = new Person();
		System.out.println(p2.name);//ull
		
		Person p3 = p1;
		System.out.println(p3.name);//Tom
		
		p3.age = 10;
		System.out.println(p1.age);//10
		
		
	}
}

//1.创建类：设计类的成员
class Person{
	//属性
	String name;
	int age = 1;
	boolean isMale;
	//方法
	public void eat() {
		System.out.println("可以吃");
	}
	public void sleep() {
		System.out.println("可以睡觉");
	}
	public void talk(String language) {
		System.out.println("可以说语言" + language);
	}
}



*/





