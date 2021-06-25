package eclipse06;

public class OrderTest {
	public static void main(String[] args) {
		Order s1 = new Order(1001, "AA"); 
		Order s2 = new Order(1002, "BB");
		
		System.out.println(s1.equals(s2));
	}	
}
