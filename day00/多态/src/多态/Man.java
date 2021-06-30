package 多态;

public class Man extends Person{
	boolean isSmoking;
	int id = 1002;
	
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
