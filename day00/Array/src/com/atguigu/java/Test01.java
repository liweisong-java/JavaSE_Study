package com.atguigu.java;
/*        获取arr中所有元素的和
 *       j=0      j=1      j=2      j=3
 * i=0    3        5        8        -
 * i=1   12        9        -        -
 * i=2    7        0        6        4
 * 
 * 
 * 
 */
public class Test01 {
	public static void main(String[] args) {
		int [][]arr = new int[][] {{3,5,8},{12,9},{7,0,6,4}};
		
		int sum = 0;//记录总和
		for(int i = 0;i < arr.length;i++) {                //arr     //是获取一维数组的长度！！！！
			for(int j = 0;j < arr[i].length;j++) {         //arr[i]  //是获取二维数组长度！！！！！
				sum += arr[i][j];
			}
		}
		
		System.out.println("总和为：" + sum);
	}
}
