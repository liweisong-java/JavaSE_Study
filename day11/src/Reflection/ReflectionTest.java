package Reflection;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 李伟松
 * @2021 07   2021/7/16  17:14
 */
public class ReflectionTest {
    //反射之前，对于Person的操作
    @Test
    public void test1(){

        //1.创建Person类的对象
        Person p1 = new Person("Tom",12);

        //2.通过对象，调用其内部的属性，方法
        p1.age = 10;
        System.out.println(p1.toString());

        p1.show();

        //在Person类外部，不可以通过Person类的对象调用其内部私有结构
        //比如：name.showNation()以及私有的构造器

    }
    @Test
    //反射之后，对于Person的操作
    public void test2() throws Exception {
        Class clazz = Person.class;
        //1.通过反射，创建Person类的对象
        Constructor cons = clazz.getConstructor(String.class, int.class);
        Object obj = cons.newInstance("Tom", 12);
        Person p = (Person) obj;
        System.out.println(obj.toString());
        //2.通过反射，调用对象指定的属性和指定的方法
        //调用属性
        Field age = clazz.getDeclaredField("age");
        age.set(p,10);
        System.out.println(p.toString());

        //调用方法
        Method show = clazz.getDeclaredMethod("show");
        show.invoke(p);

        System.out.println("**************************************");

        //3.通过反射，可以调用Person类的私有结构的。比如私有的构造器，方法，属性
        Constructor cons1 = clazz.getDeclaredConstructor(String.class);
        cons1.setAccessible(true);
        Person p1 = (Person) cons1.newInstance("Jerry");
        System.out.println(p1);

        //调用私有的属性
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p1,"HanMeiMei");

        //调用私有的方法
        Method showNation = clazz.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        String nation = (String)showNation.invoke(p1, "中国");//相当于p1.showNation("中国");
        System.out.println(nation);

    }
    //疑问？
    //    反射机制与面向对象的封装性是不是矛盾的？如何看待两个技术
    //不矛盾
    //    通过直接new的方式或反射的方式都可以调用公共的结构，开发到底用哪个？
    //  建议：直接new的方式
    //什么时候会使用：反射的方式，反射的特性
    @Test
    public void test3() throws ClassNotFoundException {
        //获取Class的实例的操作
        //方式一：调用运行时类的属性： .class
        Class clazz1 = Person.class;
        System.out.println(clazz1);
        //方式二：通过运行时类的对象，调用getClass()
        Person p1 = new Person();
        Class clazz2 = p1.getClass();
        System.out.println(clazz2);
        //方式三：调用Class的静态方法：forName(String classPath)
        Class clazz3 = Class.forName("Reflection.Person");
        System.out.println(clazz3);


    }
}
