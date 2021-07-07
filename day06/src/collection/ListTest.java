package collection;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

/**
 *  /----Collection接口：单例集合，用来储存一个一个的对象
 *            /---List接口：存储有序的，可重复的数据：--->“动态”数组,替换原有的数组
 *                 /---ArrayList   作为List接口的主要实现类：线程不安全的，效率高：底层使用Object[] elementDate存储
 *                 /---LinkedList  对于频繁的插入，删除操作，此类效率比ArrayList效率高：底层使用双向链表存储
 *                 /---Vector      作为List接口的古老实现类：线程安全的，效率低：底层使用Object[] elementDate存储
 *
 *
 *
 *   ArrayList源码分析：
 *   jdk 7 情况下
 *            ArrayList list = new ArrayList();底层创建了长度为10的Object[]数组elementDate
 *            list.add(123);//elementDate[0] = new Integer(123);
 *            ...
 *            list.add(11);如果此次的添加导致底层elementDate数组容量不够，则扩容
 *            默认情况下，扩容原来的容量为1.5倍，同时需要将原有数组中的数据赋值到新的数组中
 *
 *    结论：建议开发中使用带参的构造器ArrayList list = new ArrayList(int capacity)
 *
 *   jdk 8 情况下
 *            ArrayList list = new ArrayList();//底层Object[] elementData初始化为{}，并没有创建长度10的数组
 *
 *            List.add(123);第一次调用add()时，底层才创建了长度10的数组，并将数据123添加到elementDate[0]
 *            ...
 *            后续的添加和扩容操作与jdk 7 无异
 *
 *     小结：jdk7中的ArrayList的对象的创建类似于单例的饿汉式，
 *          jdk8中的ArrayList的对象的创建类似于单例的懒汉式，延迟了数组的创建，节省内存。
 *
 *
 *  LinkedList的源码的分析
 *          LinkedList list = new LinkedList();内部声明了Node类型的first和last属性，默认值为null
 *          List.add(123);//将123封装到Node中，创建了Node对象。
 *
 *          其中，Node定义体现了LinkedList的双向链表的说法
 *
 *
 *  面试题：ArrayList，LinkedList，Vector三者的异同
 *  同：三个类都实现了List接口，存储数据的特点相同：存储是有序的，可重复的数据
 *  不同：见上

 *
 * @author liweisong
 * @2021072021/7/615:21
 */
public class ListTest {
/*
 * void add(int index, Object ele):在index位置插入ele元素
 * boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
 * Object get(int index):获取指定index位置的元素
 * int indexOf(Object obj):返回obj在集合中首次出现的位置
 * int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
 * Object remove(int index):移除指定index位置的元素，并返回此元素
 * Object set(int index, Object ele):设置指定index位置的元素为ele
 * List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的子集合
 *
 * 总结：常用方法
 *      增：add(Object obj)
 *      删: remove(int index)/remove(Object obj)
 *      改: set(int index,Object ele)
 *      查: get(int index)
 *      插: add(int index, Object ele)
 *      长度: size()
 *      遍历    ①Iterator迭代器方式
 *              ②增强for循环
 *              ③普通的循环
 */
    @Test
    public void test3(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");

        //方式一：Iterator迭代器方式
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("******************************");
        //方式二：增强for循环
        for (Object obj : list){
            System.out.println(obj);
        }
        System.out.println("******************************");

        //方式三：普通for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    @Test
    public void test1(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(new Person("Tom",20));
        list.add(456);
        System.out.println(list);

        //void add(int index, Object ele):在index位置插入ele元素
        list.add(0,"李伟松");
        System.out.println(list);

        //boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
        List list1 = Arrays.asList(1, 2, 3);
        list.addAll(1,list1);
        System.out.println(list);

        //Object get(int index):获取指定index位置的元素
        System.out.println(list.get(5));

        //int indexOf(Object obj):返回obj在集合中首次出现的位置，不存在返回-1
        int i = list.indexOf(123);
        System.out.println(i);

        //int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置，不存在返回-1
        int i1 = list.lastIndexOf(456);
        System.out.println(i1);

        //Object remove(int index):移除指定index位置的元素，并返回此元素
        list.remove(0);
        System.out.println(list);

        //Object set(int index, Object ele):设置指定index位置的元素为ele
        list.set(1, 123);
        System.out.println(list);

        //List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置左闭右开的子集合
        List l2 = list.subList(1, 3);
        System.out.println(l2);

    }


}
