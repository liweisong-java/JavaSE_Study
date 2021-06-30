package Test2;

public class Person {
	String name;
	int age;
	int sex;
	
	
	public void study(){
		System.out.println("studying");
	}
	public void showAge(){
		System.out.println(age);
	}
	public int addAge(int i){
		age = age + i;
		System.out.println(age);
		return age;
	}
}

