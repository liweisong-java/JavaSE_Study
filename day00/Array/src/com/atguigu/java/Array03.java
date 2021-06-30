package com.atguigu.java;

/*
5.数组元素的默认初始化值
规定二位数组分为外层数组元素和内层数组的元素
int[][] arr = new int [4][3];
外层元素：arr[0],arr[1]等
内层元素：arr[0][0],arr[1][2]等

数组元素的默认初始化值
外层元素：地址值
内层元素：与一维一致

数组的内存解析
*/ 			
public class Array03 {
	public static void main(String[] args) {
		
		int[][] arr = new int [4][3];
		System.out.println(arr[0]); //[I@182decdb  地址值   [说明是一维数组    [[说明是二维数组

		System.out.println(arr[0][0]);//0

	}
}
