package 多态性;

public class woman extends Person{
    boolean isBeauty;
	
	public void goShopping() {
		System.out.println("女人负责败家");
	}
	
	public void eat(){
		System.out.println("女人少吃");
	}
	
	public void walk(){
		System.out.println("女人少走");
	}
}
