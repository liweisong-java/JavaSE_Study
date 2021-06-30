package com.atguigu.java;
/*
 * 定义一个int型一维数组，包含十个元素，分别赋一些随机整数，然后
 * 求出元素的最大值，最小值，和值，平均值，并输出出来。
 * 要求：所有随机数都是两位数
 * 获取[max,min]数值
 * (int)(Math.random()*(max-min+1)+min);
 * 
 * 
 * 
 */
public class Test03 {
	public static void main(String[] args){
		int[] arr = new int[10];
		
		for(int i = 0;i < arr.length;i++) {
			arr [i] = (int)(Math.random()*(99-10+1)+10);
		}
		
		//冒泡排序

		for(int z = 1;z < arr.length - 1;z++) {
			for(int x = 0;x < arr.length - z;x++) {
				if(arr [x] > arr [x+1]){
					int temp;
					temp = arr [x];
					arr [x] = arr [x+1];
					arr [x+1] = temp;
				}
			}		
     	}
		for(int z = 0;z < arr.length;z++)
		System.out.print(arr[z] + " " );
		System.out.println();
		System.out.println("最大值为:" + arr[9]);
		System.out.println("最小值为:" + arr[0]);
		
		int he = 0;
		for(int z = 1;z < arr.length; z++) {
			
			he += arr[z];
		}
		System.out.println("总和为" + he);
		int PingJun;
		PingJun = he / 10;
		System.out.println("平均数为" + PingJun);

		
		}
}
