package 抽象;

public class AbstractTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.eat();
	}
}
class Person{
	String name;
	int age;
	
	public Person() {
		
	}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void eat() {
		System.out.println("人吃饭");
	}
	public void walk(){
		System.out.println("人走路");
	}
}

class Student extends Person{
	
}