package Test2;

public abstract class Person {
	
	
	public abstract void walk();
}

abstract class PersonTest extends Person{
	
	public static void main(String[] args) {
		Person a = new Person() {
			public void walk() {
				
			}
		};
		a.walk();
	}
	
}

