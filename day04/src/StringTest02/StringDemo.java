package day04.src.StringTest02;

import org.junit.Test;

/**
 * @author liweisong
 * @Time 2021/6/26 21:45
 */
public class StringDemo {
    /*
    将一个字符串进行反转，将字符串中指定部分进行反转，比如“abcdefg”反转为“abfedcg”
    方式一：转换为char[]
     */
   public String reverse(String str,int startIndex,int endIndex){
        char[] arr = str.toCharArray();
        for (int x = startIndex,y = endIndex;x < y;x++,y--){
            char temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }

        return new String(arr);
    }

    @Test
    public void testReverse(){
        String str = "abcdefg";
        String reverse = reverse(str,2,5);
        System.out.println(reverse);
    }
}
