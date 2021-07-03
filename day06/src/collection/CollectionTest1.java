package collection;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Collection接口中生命的方法的测试
 *
 *
 * @author liweisong
 * @2021072021/7/114:19
 */
public class CollectionTest1 {
   @Test
   public void test1(){
       Collection coll = new ArrayList();
       coll.add(123);
       coll.add(465);
       coll.add(new String("Tom"));
       coll.add(false);

       coll.add(456);
       coll.add(new Person("Jerry",20));

       //contains(Object obj):判断当前集合中是否包含obj
       boolean contains = coll.contains(123);
       System.out.println(contains);
       System.out.println(coll.contains(new String("Tom")));
       System.out.println(coll.contains(new Person("Jerry",20)));//???  new的地方是堆  跟add出来的指向的地址值不同
   }
}
