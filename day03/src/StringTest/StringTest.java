package StringTest;

import org.junit.Test;

/**
 *
 * String的使用
 * @author liweisong
 * @Time 2021/6/23 16:28
 */
public class StringTest {
    /*
    String的实例化方式
    方式一：通过字面量定义的方式
    方式二：通过new + 构造器的方式
        面试题：String s = new String("abc");
              两个     一个是堆空间中new结构，另一个是char[]对应的常量池中的数据"abc"
     */
    @Test
    public void test2(){
        //通过字面量定义的方式：此时的s1和s2的数据JavaEE声明在方法区中的字符串常量池中
        String s1 = "JavaEE";
        String s2 = "JavaEE";
        //通过new + 构造器的方式：此时的s3和s4保存的地址值，是数据在堆空间中开辟空间以后对应的地址值
        String s3 = new String("JavaEE");
        String s4 = new String("JavaEE");

        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//false
        System.out.println(s1 == s4);//false
        System.out.println(s3 == s4);//false

        System.out.println("**************************************");
        Person p1 = new Person("Tom",12);
        Person p2 = new Person("Tom",12);

        System.out.println(p1.name.equals(p2.name));//true
        System.out.println(p1.name == p2.name);//true

        p1.name = "Jenny";
        System.out.println(p2.name);//Tom
    }
    /*
    String:字符串，使用一对""引号来表示
            1.String声明为final的，不可被继承
            2.String实现了Serializable（可序列化）接口：表示字符串时支持序列化的
                    实现了Comparable（可比较）接口：表示String可以比较大小
            3.String内部定义了final char[] value 用于储存字符串数据
            4.String:代表不可变的字符序列，简称不可变性.
                    体现：1.当对字符串重新赋值时，需要重写指定内存区域赋值，不能使用原有的value进行赋值
                          2.当对现有的字符串进行连接操作时，也需要重新指定内存区域值，不能在原有的value进行赋值
                          3.当调用String的replace()方法修改指定字符或字符串时，也需要重新制定内存区域赋值，不能在原有的value进行赋值
            5.通过字面量的方式（区别于new）给一个字符串赋值，此时的字符串值声明在字符串常量池种
            6.字符串常量池种是不会储存相同相同内容的字符串的
     */
    @Test
    public void test(){
        String s1 = "abc";//字面量的定义方式
        String s2 = "abc";
//        s1 = "hello";

        System.out.println(s1 == s2);

        System.out.println(s1);//hello
        System.out.println(s2);//abc

        System.out.println("**********************************************");

        String s3 = "abc";
        s3 += "def";
        System.out.println(s3);//abcdef
        System.out.println(s2);

        System.out.println("**********************************************");

        String s4 = "abc";
        String s5 = s4.replace('a','m');
        System.out.println(s4);
        System.out.println(s5);
    }
}
