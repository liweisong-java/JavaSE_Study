package 面向对象;
/*
 * 1.创建Person类的对象，设置该对象的name.age.sex属性，调用study方法，输出字符串
 * “studying”调用showAge()方法显示age值，调用addAge()方法给age属性值增加2岁
 * 
 * 创建第二个对象，执行上述操作，体会同一个类不同对象之间的关系
 * Person
 * name：String
 * age：int
 * sex：int
 * 
 * +study():void
 * +showAge():void
 * +addAge(int i):int
 *
 * 2.利用面向对象的编程方法，设计Circle计算圆的面积
 * 
 * 3.1编写一个程序，声明一个method方法，在方法中打印一个10*8的*型矩形，在main方法中调用该方法
 * 3.2修改上一个程序，在method方法中，除打印一个10*8的*型矩形外，再计算该矩形的面积，并将其作为方法返回值，
 * 再main方法中调用该方法，接收返回的面积值并打印
 * 3.3修改上一个程序，在method方法中提供m和n两个参数，方法中打印一个m*n的*型矩形，并计算该矩形的面积并打印。
 */

public class Test0101 {
	public static void main(String[] args) {
		Test0101 a1 = new Test0101();
		int area = a1.method();
		System.out.println("鹅值为" + area);
	}


    public int method(){
    	int m;
        int n;
        m = 9;
        n = 5;
         for(int i = 0;i < m;i++){
        	 for(int j = 0;j < n;j++){
        		 System.out.print("* "); 
             }
        	 System.out.println();
         }
         return m * n;
    }

}















































































/*
public class Test {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "李伟松";
		p1.age = 20;
		p1.sex = 1;
		p1.addAge();
		System.out.println(p1.age);
		p1.study();
		
		Person p2 = new Person();
		
		p2.study();
		p2.addAge();
		System.out.println(p2.age);
	}

}

class Person{
	String name;
	int age;
	int sex;
	
	public void study(){
		System.out.println("studying");
	}
	
	public void showAge(){
		System.out.println(age);
	}
	
	public int addAge(){
		age += 2;
		return age;
	}
}
*/
/*
public class Test {
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		c1.radius = 2;
		System.out.println(c1.findArea());
	}
}

class Circle{
	double radius;
	
	public double findArea(){
		double area = Math.PI * radius * radius;
		return area;
	}
}

*/