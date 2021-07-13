package File;

import org.junit.Test;

import java.util.*;

/**
 * @author liweisong
 * @2021072021/7/1114:11
 */
public class Test2 {
    @Test
    public void test(){
        //遍历key
        Map<String,Integer> map = new HashMap<>();
        map.put("s",1);
        map.put("q",5);
        map.put("p",6);
        Set<String> keySet = map.keySet();
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    @Test
    public void test1(){

        //遍历value
        Map<String,Integer> map = new HashMap<>();
        map.put("s",1);
        map.put("q",5);
        map.put("p",6);
        Collection<Integer> values = map.values();
        for(Integer s : values){
            System.out.println(s);
        }
    }
    @Test
    public void test2(){
        //遍历key - value
        Map<String,Integer> map = new HashMap<>();
        map.put("s",1);
        map.put("q",5);
        map.put("p",6);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry);
        }
    }
}
