package Test5;

public class GeometricTest {
	public static void main(String[] args) {
		GeometricTest test = new GeometricTest();
		
		Circle c1 = new Circle("white",2.3, 1.0);
		//
		test.displayGeometricObject(c1);
		
	}
	public boolean equalsArea(GeometricObject o1,GeometricObject o2) {
		return o1.findArea() == o2.findArea();
	}
	public void displayGeometricObject(GeometricObject o) {
		System.out.println("面积为 -->" + o.findArea());
	}
}
