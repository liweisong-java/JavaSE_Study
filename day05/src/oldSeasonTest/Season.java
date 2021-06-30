package oldSeasonTest;

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
 *
 *
 * @author liweisong
 * @2021062021/6/3011:48
 */
class SeasonTest {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        Season summer = Season.SUMMER;
        Season autumn = Season.AUTUMN;
        Season winter = Season.WINTER;

        System.out.println(spring);
        System.out.println(summer);
        System.out.println(autumn);
        System.out.println(winter);
    }
}
//自定义枚举类
public class Season {

    //    //1.声明Season对象的属性：private final修饰
    private final String seasonName;
    private final String seasonDesc;

    //    //2.私有化类的构造器，并给对象属性赋值
    private Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //    //3.提供当前枚举类多个对象：public static final的
    public static final Season SPRING = new Season("春天","春天不错");
    public static final Season SUMMER = new Season("夏天","夏天不错");
    public static final Season AUTUMN = new Season("秋天","秋天不错");
    public static final Season WINTER = new Season("冬天","冬天不错");

    //    //4.其他诉求：获取枚举类对象的属性
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
//    //4.其他诉求，提供toString方法

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}