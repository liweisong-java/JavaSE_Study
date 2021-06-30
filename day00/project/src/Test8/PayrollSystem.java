package Test8;

import java.util.Calendar;

public class PayrollSystem {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		int month = calendar.get(Calendar.MONTH);
		
		Employee[] emps = new Employee[2];
		
		emps[0] = new SalariedEmployee("马森",1002,new MyDate(2021, 6, 28),10000);
		emps[1] = new HourlyEmployee("李伟松", 2001, new MyDate(2000, 5, 27),60,540);
		
		for(int i = 0 ; i < emps.length ; i++) {
			System.out.println(emps[i]);
			double salary = emps[i].earnings();
			System.out.println("月工资为" + salary);
			
			if(month + 1 == emps[i].getBirthday().getMonth()) {
				System.out.println("生日快乐！奖励100元");
			}
		} 		
	}
}
