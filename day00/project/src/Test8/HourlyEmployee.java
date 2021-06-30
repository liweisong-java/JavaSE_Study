package Test8;

public class HourlyEmployee extends 	Employee{
	public HourlyEmployee(String name, int number, MyDate birthday) {
		super(name, number, birthday);
	}
	public HourlyEmployee(String name, int number, MyDate birthday,int wage,int hour) {
		super(name, number, birthday);
		this.hour = hour;
		this.wage = wage;
	}
	private double wage;
	private double hour;
	
	public double earnings() {
		return hour * wage;
	}
	public String toString() {
		return "HourlyEmployee" + super.toString();
	}
}
