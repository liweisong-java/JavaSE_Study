package 面向对象;
/*1.
 * 类中方法的声明和使用
 * 方法：描述类具有的功能
 * 比如math类   sqrt()  ranfom()
 *    Scanner类  nextxxx()
 *     
 * public void eat(){}
 * public void sleep(int hour){}
 * public String getName(){}
 * public String getNation(String nation){}
 * 
 * 2.
 * 方法的声明：权限修饰符 返回值类型 方法名(形参列表){
 * 			方法体；
 *          }
 * 关于权限修饰符：
 * 		4种：private.public.缺省.protected
 *
 * 3.2
 * 返回值类型：   有返回值 vs 没有返回值
 *  3.2.1    如果方法有返回值，则必须在方法声明时，指定返回值类型，同时，方法中，需要使用return关键字来返回指定类型常量或变量
 *      如果方法没有返回值：则方法声明时，使用void来表示，没有返回值的方法中就不适用return，但是，如果使用的话只能“return”
 *      
 *  3.2.2           该不该有返回值？
 *      题目要求
 *      凭经验
 *      
 * 3.3
 * 方法名：属于标识符，遵循标识符的规则和规范“见名知意”    
 * 
 * 3.4 形参列表：方法可以声明多个形参
 * 3.4.1
 * 
 * 格式，数据类型1 形参1 , 数据类型2 形参2
 * 
 * 3.4.2
 *     
 * 我们定义方法时，该不该定义形参
 *     题目要求
 *     凭经验
 *     方法里不可以定义方法
 *     
 */
public class 类中方法的声明和使用{
	//属性
	String name;
	int age;
	boolean isMale;
	
	//方法
	public void eat(){
		System.out.println("客户吃饭");
	}
	public void sleep(int hour){
		System.out.println("休息了" + hour + "个小时");
	}
	public void getName(){
		System.out.println();
	}
	public void getNation(String nation){
		System.out.println();
	}
}