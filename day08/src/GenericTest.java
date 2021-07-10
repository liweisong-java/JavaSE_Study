import org.junit.Test;

import java.util.*;

/**
 * 泛型的使用：
 *     1. jdk5.0新增的特性
 *     2. 在集合中使用泛型
 *     总结：
 *      ①集合接口或集合类在jdk5.0时都修改为带泛型的结构
 *      ②在实例化集合类时，可以指明具体的泛型类型。
 *      ③指明完以后，在集合类或接口中凡是定义类或接口时，内部结构(比如：方法，构造器，属性)使用到类的泛型的位置，都指定为实例化的泛型类型
 *      比如：add(E e)  ---- > 实例化以后：add(Integer e)
 *      ④注意点：泛型的类型必须是类，不能时基本数据类型，需要用到基本数据类型的位置，拿包装类替换
 *      ⑤如果实例化的时候，没有指明非泛型的类型，默认类型为Java.long.Object类型
 *
 *      3.如果自定义泛型结构：泛型类，泛型接口；泛型方法。见GenericTest1
 * @author liweisong
 * @2021072021/7/913:12
 */
public class GenericTest {
    //在集合中使用泛型之前的情况：以ArrayList为例
    @Test
    public void test1(){
        ArrayList list = new ArrayList();
        //需求
        list.add(78);
        list.add(76);
        list.add(89);
        list.add(88);
        //问题1
        list.add("Tom");

        for(Object score : list){
            //问题二：强转时，可能出现ClassCastException
            int stuScore = (Integer)score;
            System.out.println(stuScore);
        }
    }
    //在集合中使用泛型的情况
    @Test
    public void test2(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(78);
        list.add(76);
        list.add(89);
        list.add(88);
        //编译时，就会进行类型检查，保证数据的安全
        //方式一
        for(Integer score : list){
            //避免了强转操作
            int stuScore = score;
            System.out.println(stuScore);
        }

        //方式二
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


    //在集合中使用泛型的情况：以HashMap为例
    @Test
    public void test3(){
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("Tom",87);
        map.put("Jerry",87);
        map.put("Jack",67);

        //泛型的嵌套
        Set<Map.Entry<String, Integer>> entry = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entry.iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
        }


    }

}
