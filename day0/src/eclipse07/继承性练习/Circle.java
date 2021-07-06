package day0.src.eclipse07.继承性练习;

public class Circle {
	private double radius;
	
	public Circle() {
		radius = 1.0;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double findArea(){
		return radius * radius * Math.PI;
	}
}
