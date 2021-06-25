package eclipse01;
/*
 * 
 * java.util.Arrays:操作数组的工具类里面定义了很多操作数组的方法
 * 
 */
public class 工具类操作数组的方法 {
	public static void main(String[] args) {
		
		//1.boolean equals(int[] a,int[] b)      判断两个数组是否相等
		int[] arr1 = new int[] {1,2,3,4};
		int[] arr2 = new int[] {1,3,2,4};
		boolean isEquals = 工具类操作数组的方法.equals(arr1,arr2);
		System.out.println(isEquals);
		
		
		//2.String toString(int[] a)             输出数组信息

		//3.void fill(int[] a,int val)           将指定值填充到数组中
		
		//4.void sort(int[] a)                   对数组进行排序
		
		//5.int binarySearch(int[] a,int key)    对排序后的数组进行二分法检索指定值
	}

	private static char[] toString(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	private static boolean equals(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		return false;
	}
}
