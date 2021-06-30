package com.atguigu.java;

public class 反转线性二分法查找 {
	public static void main(String[] args) {
		
		String[] arr = new String[] {"MM","JJ","GG","DD","BB","AA"};
		
		
		//区别于数组变量的复制：赋值arr1=arr2
		String[] arr1 = new String[arr.length];
		for(int i = 0;i < arr1.length;i++){
				arr1[i] = arr[i];
		}
		
		
		
		
		//数据的反转
		//方式1
		/*for(int i = 0;i < arr.length / 2;i++) {
			String temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		*/
		//方式2
		/*for(int i = 0,j = arr.length - 1;i < j;i++,j--) {
			String temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		*/
		
		
		
		//查找，搜索
		//线性查找：
		String dest = "DD";
		
		boolean isFlag = true;
		
		for(int i = 0;i < arr.length;i++) {
			if(dest.equals(arr[i])) {
				System.out.println("找到了指定元素，位置为" + i);
				isFlag = false;
				break;
			}
		}
		if(isFlag) {
			System.out.println("很遗憾没有找到");
		}
		
		
		
		//二分法查找

		//前提：所要查找的数组必须要有序
		int[] arr2 = new int[] {-98,-34,2,34,54,66,79,105,210,333};
		
		int dest1 =  -34;
		dest1 = 79;
		int head = 0;//初始的首索引
		int end = arr2.length - 1;//初始的末索引
		boolean isFlag1 = true;
		while(head <= end) {
			
			int middle = (head + end)/2;
			
			if(dest1 == arr2[middle]) {
				System.out.println("找到了指定元素，位置为" + middle);
				isFlag1 = false;
				break;
			}else if(arr2[middle] > dest1) {
				end = middle - 1;
			}else {
				head = middle + 1;
			}
		}
		
		if(isFlag1) {
			System.out.println("很遗憾没有找到");
		}
		
		
		
	}
}
