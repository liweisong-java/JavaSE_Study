package day04.src.StringTest02;

import org.junit.Test;

import java.time.*;
import java.util.Date;

/**
 * @author liweisong
 * @2021062021/6/2812:50
 */
public class JDK8DateTimeTest {
    @Test
    public void testDate(){
        //偏移量
        Date date1 = new Date(2020 - 1900,9 - 1,8);
        System.out.println(date1);//Tue Sep 08 00:00:00 CST 2020
    }

    /*
    LocalDate.LocalTime.LocalDateTime的使用
    说明
        1.LocalDateTime相较于LocalDate.LocalTime，使用频率要高
        2.类似于Calender
     */
    @Test
    public void test1(){
        //now()：获取当前的日期，时间，日期＋时间
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        //of():设置指定的年，月，日，时，分，秒，没有偏移量
        LocalDateTime localDateTime1 = LocalDateTime.of(2020, 10, 6, 13, 23, 12);
        System.out.println(localDateTime1);

        //getXxx()
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getMinute());

        //体现不可变性
        //withXxx()：设置相关属性
        LocalDate localDate1 = localDate.withDayOfMonth(22);
        System.out.println(localDate);
        System.out.println(localDate1);

        LocalDateTime localDateTime2 = localDateTime.withHour(4);
        System.out.println(localDateTime);
        System.out.println(localDateTime2);

        //不可变性
        LocalDateTime localDateTime3 = localDateTime.plusMonths(3);
        System.out.println(localDateTime);
        System.out.println(localDateTime3);

        LocalDateTime localDateTime4 = localDateTime.minusDays(6);
        System.out.println(localDateTime);
        System.out.println(localDateTime4);

    }
    /*
    Instant的使用
     */
    @Test
    public void test2(){
        //now():获取本初子午线对应的标准时间
        Instant instant = Instant.now();
        System.out.println(instant);//2021-06-28T07:05:17.815Z

        /* 添加时间的偏移量 */
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);//2021-06-28T15:08:41.426+08:00

        //toEpochMilli获取1970年1月1日0时0分0秒(UTC)开始的毫秒数
        long l = instant.toEpochMilli();
        System.out.println(l);//1624864214533

        //通过给定的毫秒数，获取Istant实例
        Instant instant1 = Instant.ofEpochMilli(1624864214533L);
        System.out.println(instant1);


    }
    /*
    DateTimeFormatter：格式化或解析日期时间
    类似于SimpleDateFormat
     */
    @Test
    public void test3(){
        //方式一：预定义的标准格式：如ISO
        //贼墨迹
        //方式二：本地化相关的格式
        //贼墨迹
        //方式三：自定义的格式
        //贼墨迹
    }


}
