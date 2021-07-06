package collection;

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
 * @author liweisong
 * @2021072021/7/615:21
 */
public class ListTest {


}
