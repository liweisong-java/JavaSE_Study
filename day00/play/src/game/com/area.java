package game.com;
/*
 * 类，  对象，     属性
 * 	  创建对象    对象.属性
 * 
 * 
 */
public class area {
	double r;
	int wide;
	int longe;
	
	public area() {
		
	}
	public area(double r) {
		
	}
	public area(int wide,int longe) {
		
	}
	
	
	public double Circle() {
		double Circlearea = r * r * Math.PI; 
		return Circlearea;
	}
	public int rectangle() {
		int Retanglearea = wide * longe;
		return Retanglearea;
	}
}


