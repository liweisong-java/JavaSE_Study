package com.atguigu.java;
/*
 * 二维数组的使用
 *  
 *  1.理解
 *     对于二位数组的理解，我们可以堪称是一维数组array1又作为另一个一维数组array2的元素而存在
 *     其实，从数组底层的运行机制来看，其实没有多维数组。
 *     
 *  2.二维数组的使用
 * 	二维数组的声明和初始化
 *  如何调用数组的指定位元素
 *  如何获取数组的长度
 *  如何遍历数组
 *  数组元素的默认初始化值   见Array03
 *  数组的内存解析         见Array03
 * 
 * 
 * 
 */
public class 二维数组 {
	public static void main(String[] args) {
		//1.二维数组的初始化
		int[] arr = new int[] {1,2,3};//一维数组
		//静态初始化
		int[][]arr1 = new int[][] {{1,2,3},{4,5},{6,7,8}};
		//动态初始化1
		String[][] arr2 = new String[3][2];
		//动态初始化2
		String[][] arr3 = new String[3][];
		
		int[] arr6 = {1,2,3,4};//类型推断
		
		int[][]arr4 = new int[][] {{1,2,3},{4,5,9,10},{6,7,8}};
		int[][]arr5 = new int[][] {{1,2,3},{4,5},{6,7,8}};
		
		
		
		//错误的情况
//		String[][] arr4 = new String[][4];
//		String[4][3] arr5 = new String[][];
//		int[][]arr1 = new int[4][5] {{1,2,3},{4,5},{6,7,8}};
		
		
		//2.如何调用数组的指定位元素
		System.out.println(arr1[0][1]);//2
		System.out.println(arr2[1][1]);//null 没有赋过值
//		System.out.println(arr3[1]][0]);报错  空指针异常
	    
		
		//3.获取数组的长度
		System.out.println(arr4.length);//3
		System.out.println(arr4[0].length);//3
		System.out.println(arr4[1].length);//4
		
		
		//4.如何遍历二维数组
		for(int i = 0;i < arr4.length;i++) {
			
			for(int j = 0;j < arr4[i].length;j++)
				System.out.println(arr4[i][j]+"	");
			System.out.println();
		}
		
		

		
		
		
		
		
		
		
		
		
	}
}
