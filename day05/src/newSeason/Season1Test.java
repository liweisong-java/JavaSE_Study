package newSeason;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import oldSeasonTest.Season;

import javax.swing.plaf.synth.SynthInternalFrameUI;

/**
 * 一.枚举类的使用
 * 1.枚举类的理解：类的对象只有有限个，确定的。我们称此为枚举类
 * 2.当需要定义一组常量时，强烈建议使用枚举类
 * 3.如果枚举类中只有一个对象，则可以作为单例模式的实现方法
 *
 * 二.如何定义枚举类
 * 方式一：jdk5.0之前，自定义枚举类
 * 方式二：jdk5.0，可以使用enum关键字定义枚举类
 *
 * 三.Enum类中的常用方法
 * 说明：定义的枚举类默认继承于java.lang.Enum类
 *
 *四.使用enum关键字定义的枚举类实现接口的情况
 * 1.实现接口，再enum类中实现抽象方法
 * 2.让枚举类的对象分别实现接口中的抽象方法
 * @author liweisong
 * @2021062021/6/3011:48
 */
public class Season1Test {
    public static void main(String[] args) {
        Season1 spring = Season1.SPRING;
        Season1 summer = Season1.SUMMER;
        Season1 autumn = Season1.AUTUMN;
        Season1 winter = Season1.WINTER;
//      toString():
        System.out.println(spring.toString());
        System.out.println(summer.toString());
        System.out.println(autumn.toString());
        System.out.println(winter.toString());
        System.out.println("+-+-+-+-+-+-+-+-+--++-+-+-+-+--+--++-+-+---+-+--+++--+-+");
        //values():
        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
            values[i].show();
        }
        Thread.State[] values1 = Thread.State.values();
        for (int i = 0; i < values1.length; i++) {
            System.out.println(values1[i]);
        }

        //valuesOf(String objName):返回枚举类中对象名时objName的对象
        //如果没有objName的枚举类对象，则抛出异常：IllegalArgumentException
        winter = Season1.valueOf("WINTER");
//        winter = Season1.valueOf("WINTER1");
        System.out.println(winter);
        winter.show();
    }
}
interface Info{
    void show();

}
//使用enum关键字枚举类
enum Season1 implements Info{
    //1.提供打过去按枚举类对象用","隔开，末尾对象";"结束
    SPRING("春天","春天不错"){
        @Override
        public void show() {
            System.out.println("春天在哪里");
        }
    },
    SUMMER("夏天","夏天不错"){
        @Override
        public void show() {
            System.out.println("夏天在哪里");
        }
    },
    AUTUMN("秋天","秋天不错"){
        @Override
        public void show() {
            System.out.println("秋天在哪里");
        }
    },
    WINTER("冬天","冬天不错"){
        @Override
        public void show() {
            System.out.println("冬天在哪里");
        }
    };

    //1.声明Season对象的属性：private final修饰
    private final String seasonName;

    private final String seasonDesc;
    //2.私有化类的构造器，并给对象属性赋值
    private Season1(String seasonName, String seasonDesc) {

        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;

    }
    //4.其他诉求：获取枚举类对象的属性
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
    //4.其他诉求，提供toString方法

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }

//    @Override
//    public void show() {
//        System.out.println("这是一个季节");
//    }
}
