package 多态;
/*
 * 
 * 
 */
public class PersonTest {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.eat();
		
		Man man = new Man();
		man.eat();
		man.age = 25;
		man.earnMoney();
		
		//******************************
		System.out.println("********************************************");
		//对象的多态性：父类的引用指向子类的对象
		Person p2 = new Man();
		//多态的使用：当调用子父类同名同参数的方法时，实际执行的时子类重写父类的方法--虚拟方法调用
		p2.eat();
		p2.walk();
		
		System.out.println(p2.id);
		
		System.out.println("***************************");
		//不能调用子类所特有的方法:编译时，p2是Person类型

		p2.name = "Tom";
//		p2.earnMoney();
//		p2.isSmoking = ture;
		
		//有了对象的多态性以后，内存中实际上是加载了子类特有的属性和方法的，但由于变量声明为父类类型，导致编译时
		//只能调用父类中声明的属性和方法。子类特有的属性和方法不能调用
		//如何才能调用子类特有的属性和方法？   使用强制类型转换符   向下转型
		Man m1 = (Man)p2;
		m1 .earnMoney();
		m1.isSmoking = true;
		
		//使用强转时，可能出现ClassCastException的异常
//		woman w1 = (Woman)p2;
//		w1.goShopping();
		
		/*
		 * instanceof:关键字的使用
		 * 		a instanceof A:判断对象是否是类A的实例 如果是返回True  如果不是，返回false
		 * 		对象          类
		 * 使用情景：为了避免向下转型时出现ClassCastException的异常，我们在向下转型之前，先进行instanceod的判断
		 * 一旦返回true 就向下转型，如果为false不进行向下转型
		 */
		
		if(p2 instanceof Woman) {
			Woman w1 = (Woman)p2;
			w1.goShopping();
			System.out.println("********Woman********");
		}
		if(p2 instanceof Man) {
			Man m2 = (Man)p2;
			m2.earnMoney();
			System.out.println("********Man********");
		}
		
		
	}
}