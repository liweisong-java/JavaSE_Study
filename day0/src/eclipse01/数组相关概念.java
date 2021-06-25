package eclipse01;


/*
 * 1.数组：是多个相同类型数据按一定顺序排列合集，并使用一个名字命名，通过编号的方式对这些数据进行统一管理。
 * 
 * 2.数组相关概念：
 * >数组名
 * >元素
 * >角标，下标，索引
 * >数组的长度
 * 
 * 3.数组的特点：
 * 1）数组是有序排列的
 * 2）数组属于引用数据类型，数组的元素可以是基本数据类型和引用数据类型。
 * 3）创建数组对象会在内存中开辟一整块连续的空间
 * 4）数组的长度一旦确定，就不能修改。
 * 
 * 4.数组的分类
 * 	按维数：一维数组，二维数组
 *  按数组元素的类型：基本数据类型元素的数组；引用数据类型元素的数组
 *  
 * 5.一维数组的使用
 * 	一维数组的声明和初始化
 *  如何调用数组的指定位元素
 *  如何获取数组的长度
 *  如何遍历数组
 *  数组元素的默认初始化值   见Array01.class
 *  数组的内存解析         见Array01.class
 */
public class 数组相关概念 {
	public static void main(String[] args) {
		//1.一维数组的声明和初始化
		int num;  //声明
		num = 10; //初始化
		int id = 1001; //声明 + 初始化
		
		int[]ids;//声明
		//1.1 静态初始化:数组的初始化和数组元素的赋值同时进行
		ids = new int[]{1001,1002,1003,1004};
		//1.2动态初始化：数组的初始化和数组元素的赋值分开进行
		String[] names = new String[5];
		
		//错误的写法：
//		int[] arr1 = new int[];
//		int[5] arr2 = new int[5];
//		int[] arr3 = new int[3]{1,2,3};
		
		
		//总结：数组一旦初始化完成，其长度就确定了。
		
		//2.如何调用数组的指定位元素：通过角标的方式调用
		//数组的角标，从0开始，到数组的长度-1结束。
		names[0] = "李伟松";
		names[1] = "韩睿";
		names[2] = "姚凇翰";
		names[3] = "赵宇宁";
		names[4] = "成龙";
		
		//3.如何获取数组的长度：
		//属性：length
		System.out.println(names.length);//5
		System.out.println(ids.length);//4
		
 		//4.如何遍历数组
		/*System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);*/
		
		for(int i = 0;i < names.length;i++) {
			System.out.println(names[i]);
		}
		
		

		
	}
}





