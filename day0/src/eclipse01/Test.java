package eclipse01;

import java.util.Scanner;

/*
 * 从键盘输入学生成绩，找出最高分，并输出学生成绩等级
 * 			成绩>=最高分-10  等级为“A”
 * 			成绩>=最高分-20  等级为“B”
 * 			成绩>=最高分-30  等级为“C”
 * 			其余            等级为“D”
 * 		提示：先读入学生人数，根据人数创建int数值，存放学生成绩。
 */
public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入学生人数：");
		int number = scanner.nextInt();//赋值给number = 输入的学生人数
		//使用Scanner，读取学生人数
		
		int[] scores = new int[number];//scores = 数组[x个学生]动态数组
		//创建数组，读取学生成绩:动态初始化
		
		System.out.println("请输入" + number + "个学生成绩：");
		for(int i = 0;i < scores.length;i++){
			scores[i] = scanner.nextInt();//scores[i]---->数组[x元素]=输入赋值
		}
		//给数组的元素赋值
		
		int maxScore = 0;
		for(int i = 0;i < scores.length;i++){
			if(maxScore < scores[i]) {
				maxScore = scores[i];
			}
		}
		//获取数组中元素的最大值：最高分
		
		char level;
		for(int i = 0;i < scores.length;i++) {
			if(maxScore - scores[i] <= 10) {
				level = 'A';
			}else if(maxScore - scores[i] <= 20){
				level = 'B';
			}else if(maxScore - scores[i] <= 30){
				level = 'C';
			}else{
				level = 'D';
			}
			System.out.println("Student" + i + "score is" + scores[i] + ",grade is" + level);
		}
		//更具每个学生成绩与最高分的差值，得到每个学生的等级，并输出等级和成绩
		
	}
}
