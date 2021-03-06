package 方法的重写;
/*
 * 重写：子类继承父类以后，可以对父类中同名同参数的方法，进行覆盖操作
应用：重写以后，创建子类对象以后，通过子类对象调用子父类中的同名同参数的方法，实际执行的是子类重写父类的方法
	
重写的规定
		方法的声明：权限修饰符 返回值类型 方法名(形参列表){
				方法体;
		}
		约定俗称：子类中的叫重写的方法，父类中的叫被重写的方法
		
		①子类重写的方法的方法名和形参列表与父类被重写的方法的方法名和形参列表相同
		②子类重写的方法的权限修饰符不小于父类被重写的方法的权限修饰符
		  >特殊情况：子类不能重写父类中声明为private的方法     private是类中进行
		③返回值类型：
			>父类中被重写的方法的返回值类型是void  则子类重写的返回值类型也必须是void
			>父类被重写的方法的返回值类型是A类型   则子类重写的返回值类型可能是A类或A类的子类
			>父类被重写的方法的返回值类型是基本类型（比如 double）    则子类重写的返回值类型必须是相同的基本数据类型（必须也是double）
		
面试题：区别方法的重载与重写	
		答：①二者的概念    重载：我们可以在同一个类中声明多个方法名相同，形参列表不同的方法，彼此之间构成重载，构造器也可以构成重载
					   重写：子类继承父类以后，可以对父类中同名同参数的方法，进行覆盖操作
		   ②重载和重写的具体规则：
		   ③重载：不表现为多态性
		    重写：表现为多态性
 */
public class Student extends Person{
	String major;
	
	public Student() {
		
	}
	public Student(String major) {
		this.major = major;
	}
	
	public void study() {
		System.out.println("学习的专业是" + major);
	}
	//对父类中的eat方法进行重写
	public void eat(){
		System.out.println("学生应该多吃有营养的食物");
	}
	
}
