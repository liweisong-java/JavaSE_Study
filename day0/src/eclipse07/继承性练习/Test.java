package eclipse07.继承性练习;

public class Test {
	public static void main(String[] args) {
		Cylinder cy = new Cylinder();
		
		cy.setRadius(2.1);
		cy.setLength(3.4);
		double Volume = cy.findVolume();
		System.out.println("面积为" + Volume);
	}
}
