package eclipse04;

public class PassObject {
	public static void main(String[] args) {
		PassObject test = new PassObject();
		
		Circle c = new Circle();
		
		test.printAreas(c, 10);
	}
	
	public void printAreas(Circle c,int time) {
		for(int i = 1;i <= time;i++) {
			c.radius = i;
			System.out.println(c.radius + "\t" + c.findArea() );
		}
	}
}
