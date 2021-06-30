package 多态性;

import java.sql.Connection;

//多态性的使举例1
public class AnimalTset {
	public static void main(String[] args) {
		AnimalTset test = new AnimalTset();
		test.func(new Dog());
		
		test.func(new Cat());
	}
	
	public void func(Animal animal) {
		animal.eat();
		animal.shout();
	}
	public void func(Dog dog) {
		dog.eat();
		dog.shout();
	}
	public void func(Cat cat) {
		cat.eat();
		cat.shout();
	}
}
class Animal{
	public void eat() {
		System.out.println("动物进食");
	}
	public void shout() {
		System.out.println("动物叫");
	}
}

class Dog extends Animal{
	public void eat() {
		System.out.println("狗进食");
	}
	public void shout() {
		System.out.println("狗叫");
	}
}

class Cat extends Animal{
	public void eat() {
		System.out.println("猫进食");
	}
	public void shout() {
		System.out.println("猫叫");
	}
}


//举例2

class Order {
	public void method(Object obj) {
		
	}
}

//举例3

class Driber{
	public void doData(Connection conn) {
		//规范的步骤去操作数据
//		conn.method1();
//		conn.method2();
//		conn.method3();
	}
}