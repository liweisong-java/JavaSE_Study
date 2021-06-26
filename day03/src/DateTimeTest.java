import org.junit.Test;

import java.util.Date;

/**
 *
 * JDK8之前的时间API测试
 *
 * @author liweisong
 * @Time 2021/6/26 12:33
 *
 */
public class DateTimeTest {
    /*
    java.util.Date类
        /---java.sql.Date类

    1.两个构造器的使用

    2.两个方法的使用
     */
    @Test
    public void test2(){
        //构造器一：Date():创建一个对应当前时间的Date对象
        Date date1 = new Date();
        System.out.println(date1.toString());//Sat Jun 26 20:28:32 CST 2021
        System.out.println(date1.getTime());//1624710512658

        //构造器二：创建指定毫秒数的Date对象
        Date date2 = new Date(15614564156L);
        System.out.println(date2.toString());//Wed Jul 01 01:22:44 CST 1970

        //创建java.sql.Date对象
        java.sql.Date date3 = new java.sql.Date(12315612315L);
        System.out.println(date3);//1970-05-23

        //如何将java.util.Date对象转换为java.sql.Date对象
        //情况一：
        Date date4 = new java.sql.Date(45612161565L);
        java.sql.Date date5 = (java.sql.Date) date4;

        //情况二：
//        Date date6 = new Date();
//        java.sql.Date date7 = (java.sql.Date) date6;
    }
    //1.System类中的currentTimeMillis()
    @Test
    public void test1(){
        long time = System.currentTimeMillis();
        //返回当前时间与1970年1余额1日0分0秒之前以毫秒为单位的时间差
        //称为时间戳
        System.out.println(time);


    }
}
