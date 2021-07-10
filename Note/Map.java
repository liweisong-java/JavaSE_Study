package Note;

/**
 * @author liweisong
 * @2021072021/7/912:22
 */
public class Map {
    /**
     * /---Map:双列数据，存储key-value对的数据 ---类似于高中的函数：y=f(x)
     *      /---HashMap：作为Map的主要实现类：线程不安全的，效率高：储存null和key和value
     *           /---LinkedHashMap：保证在遍历map元素时，可以按照添加的顺序实现遍历
     *                   原因：在原有的HashMap底层结构基础上，添加了一对指针，指向前一个和后一个元素。
     *                  对于频繁的遍历操作，此类执行效率高于HashMap
     *       /---TreeMap：保证按照添加的key-value对进行排序，实现排序遍历。此时考虑key的自然排序或定制排序
     *                       底层使用红黑树
     *       /---Hashtable：作为古老的实现类：线程安全的，效率低：不能储存null和key和value
     *           /---Properties：常用来处理配置文件.
     *
     *           HashMap的底层：数组 + 链表(jdk 7 及之前)
     *           数组 + 链表 + 红黑树(jdk 8)
     *
     *
     *1.HashMap的底层实现原理：
     *               * HashMap map = new HashMap();
     *               * 在实例化以后，底层创建了长度时16的一维数组Entry[] table.
     *                  * ...可能已经执行过多次put...
     *                  * map.put(key1,value1):
     *              * 首先，调用key1所在类的hashCode()计算key1哈希值，
     *               * 此哈希值经过某种算法以后，得到Entry数组中得存放位置.
     *               * 如果此位置上得数据为空，此时得key1-value1添加成功
     *               * 如果此位置上得数据不为空，(意味着此位置上存在一个或多个数据(以链表得形式存在))，比较
     *               * key1和已经存在得一个或多个数据的哈希值：
     *               * 如果key1的哈希值与已经存在的数据的哈希值都不相同，此时key1-value1添加成功
     *               * 如果key1的哈希值和已经存在的数据(key2-value2)的哈希值相同，继续比较：调用key1所在类的equals(key2)方法，比较
     *                       * 如果equals()返回false:此时key1-value1添加成功
     *                       * 如果equals()返回true：使用value1替换value2.
     *2.HashMap和Hashtable的异同
     *3.CurrentHashMap 与 Hashtable 的异同（暂时不讲）
     *
     *  *      添加：put(Object key,Object value)
     *  *      删除：remove(Object key)
     *  *      修改：put(Object key,Object value)
     *  *      查询：get(Object key)
     *  *      长度:size()
     *  *      遍历：keySet() / values() / entrySet()
     *
     */
}
