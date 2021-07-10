import org.junit.Test;

import java.util.ArrayList;

/**
 * @author liweisong
 * @2021072021/7/1012:31
 */
public class Person {
    @Test
    public void test2(){
        SubOrder sub1 = new SubOrder();
        //由于子类在继承带泛型的父类时，指明了泛型的类型。则实例化子类对象时，不再需要指明泛型。
        sub1.setOrderT(1122);

        SubOrder1<String> sub2 = new SubOrder1<>();
        sub2.setOrderT("order2...");

    }
    @Test
    public void test3(){
        ArrayList<String> list1 = null;
        ArrayList<Integer> list2 = null;

        //泛型不用的引用不能相互赋值
//        list1 = list2;

        Person p1 = null;
        Person p2 = null;
        p1 = p2;
    }
}
