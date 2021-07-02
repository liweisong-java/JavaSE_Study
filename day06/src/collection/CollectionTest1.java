package collection;

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

       //contains(Object obj)
       boolean contains = coll.contains(123);
       System.out.println(contains);

       //
   }
}
