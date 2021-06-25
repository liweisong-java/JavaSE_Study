package eclipse01;

public class 冒泡排序 {
	
	public static void main(String[] args) {
		
		int[] numbers = {21,27,31,19,50,32,16,25};
		
		for(int i = 0;i < numbers.length-1;i++) {//number是获取8个数 length-1（7）轮对比  浮上去的数
			//需要进行length-1次冒泡
			for(int j = 0;j < numbers.length-i-1;j++) {
				
				if(numbers[j] > numbers[j+1]){
					
					int temp = numbers[j];
					
					numbers[j] = numbers[j+1];
					
					numbers[j+1] = temp;
				}
			}
		}
		System.out.println("从小到大排序结果为");
		
		for(int i= 0;i < numbers.length;i++)
			
			System.out.print(numbers[i]+" ");
	}
}
