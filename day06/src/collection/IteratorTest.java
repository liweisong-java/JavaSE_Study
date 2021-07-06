package collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * 集合元素的遍历操作，使用迭代器Iterator接口
 * 内部的方法：hasNext()和next();
 * 集合对象每次调用iterator()方法都得到一个全新的迭代器对象
 *  默认的游标都在集合的第一个元素之前
 * hasNext()判断是否还有下一个元素
 * while(iterator.hasNext){
 *    //next():①指针下移  ②将下移以后集合位置上的元素返回
 *    System.out.println(iterator.next());
 * }
 *
 * @author liweisong
 * @2021072021/7/520:58
 */
public class IteratorTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);

        Iterator iterator = coll.iterator();
        //方式一
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        报异常：NoSuchElementException
//        System.out.println(iterator.next());

        //方式二：
//        for (int i = 0; i < coll.size(); i++) {
//            System.out.println(iterator.next());
//        }

        //方式三：推荐
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    @Test
    //错误的
    public void test2(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);
        //错误的方式一：NoSuchElementException
//        Iterator iterator = coll.iterator();
//        while ((iterator.next()) != null){
//            System.out.println(iterator.next());
//        }
        //错误的方式二：死循环
//        while(coll.iterator().hasNext()){
//            System.out.println(coll.iterator().next());
//        }
    }
    //测试Iterator中remove()
    @Test
    public void test3(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);
        //删除集合中Tom
        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            if ("Tom".equals(obj)){
                iterator.remove();
            }
        }
        //重新遍历
        iterator = coll.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
