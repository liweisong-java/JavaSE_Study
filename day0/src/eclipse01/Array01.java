package eclipse01;

/*
 *  数组元素的默认初始化值
 * 			>数组元素是整数：        0
 * 			>数组元素是浮点型：      0.0
 * 			>数组元素是char类型：  \u0000
 *  		>数组元素是布尔型：     false
 * 
 * 			>数组类型是引用数据类型：  null
 * 								
 * 
 * 
 * 数组的内存解析
 * 
 * 
 */
public class Array01 {
	public static void main(String[] args) {
		// 5.数组元素的默认初始化值
		int[] arr = new int[4];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// 数组的内存解析
	}
}
