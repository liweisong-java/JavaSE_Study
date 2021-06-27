package StringTest02;

import org.junit.Test;

/**
 *
 *
 * @author liweisong
 * @Time 2021/6/27 11:28
 */
public class StringMethodTest2 {
    /*
    获取一个字符串在另一个字符串中出现的次数
    如“ab”在“abjojioabfodjabbfajdo”中出现的次数
     */
    public int getCount(String mainStr,String subStr){
        int mainLength = mainStr.length();
        int subLength = subStr.length();
        int count = 0;
        int inde
        if (mainLength >= subLength){
            if((index = mainStr.indexOf(subStr)) != -1){
                count++;
                mainStr = mainStr.substring(index + subStr.length());
            }
            return count;
        }else{
            return 0;
        }
    }
    @Test
    public void testGetCount(){
        String mainStr = "abjojioabfodjabbfajdo";
        String subStr = "ab";
        int count = getCount(mainStr, subStr);
        System.out.println(count);
    }
}
