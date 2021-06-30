package 面向对象;
/*
 * 可变个数形参：
 *       格式：数据类型...变量名  
 *       当调用可变个数形参的方法时，传入的参数可以是多个。
 *       可变个数形参的方法与本类中方法名相同，形参不同的方法之间构成重载
 *       可变个数形参的方法与本类中方法名相同，形参类型也相同的数组之间不构成重载，二者不能共存
 * 		 可变个数不能放在前面，最多只能声明一个可变形参
 * 		 
 * 
 * 创建一个类的对象以后，我们可以通过“对象.属性”的方式，对对象的属性进行赋值。这里赋值操作要受到属性的数据类型和存储范围的制约
 * 但是除此之外没有其他制约条件，但是实际问题中，我们往往需要给属性赋值加入额外的限制条件，这个条件就不能在属性声明时体现，我们
 * 只能通过方法进行限制条件的添加，
 * 同时我们需要避免用户在使用“对象.属性”的方式堆属性进行赋值，则需要将属性声明为私有的   private    
 * 此时---->  对此针对属性就体现了封装性。
 * 
 * 封装性的体现
 * 我们将类的属性私有化 private  
 * 同时，提供公共的(public)方法来获取(getxxx)和设置(setxxx)此属性的值。
 * 
 * 封装性的体现：1.如上   2.不对外暴露私有方法    3.单例模式....
 * 
 * 封装性的体现：权限修饰符
 * 1.java规定的4种权限，（从小到大）：private  缺省  protected   public
 * 2.  4种权限可以修饰类的内部结构：属性，方法，构造器，内部类
 * 3.  4中权限都可以修饰内部类的内部权限属性，方法，构造器，内部类
 *                修饰类的话：这只能使用，缺省，public
 */
public class 可变个数形参 {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.name = "大黄狗";
		a.age = 1;//The field Animal.age is not visible
		
//		a.legs = 4;
		
		a.show();
		
//		a.legs = -4;
//		a.setLegs(6);
		a.setLegs(-6);
		
//		a.legs = -4;The field Animal.legs is not visible
		a.show();
		
		
	}
}
class Animal{
	String name;
	int age;
	private int legs;
	
	//对属性设置
	public void setLegs(int l) {
		if(l >= 0 && l % 2 ==0) {
			legs = 1;
		}else{
			legs = 0;
		}
	}
	
	//对属性的获取
	public int getLegs(){
		return legs;
		
		
	}
	public void eat(){
		System.out.println("进食");
	}
	public void show(){
		System.out.println("name =" + name + ",age = " + age + ",legs = " + legs);
	}
	
	//提供
	public int getage() {
		return age;
	}
	public void setage(int a) {
		age = a;
	}
	
	
}











