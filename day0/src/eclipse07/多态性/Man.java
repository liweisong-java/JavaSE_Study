package day0.src.eclipse07.多态性;

public class Man extends eclipse07.多态性.Person {
	public int age;
    boolean isSmoking;
	
	public void earnMoney() {
		System.out.println("男人负责挣钱养家");
	}
	
	public void eat(){
		System.out.println("男人多吃");
	}
	
	public void walk(){
		System.out.println("男人多走");
	}
}
