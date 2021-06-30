package Test2;

public class PersonTest {
	public static void main(String[] args) {
		Person a1 = new Person();
		a1.age = 18;
		a1.name = "Tom";
		a1.sex = 0;
		if(a1.sex == 1){
			System.out.println("男");
		}else {
			System.out.println("女");
		}

		a1.study();
		a1.showAge();
		a1.addAge(2);
		
	}
}
