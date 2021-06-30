package 多态性;

public class Man extends Person{
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
