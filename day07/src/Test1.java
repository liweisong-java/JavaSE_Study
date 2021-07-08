import java.util.*;

/**
 * @author liweisong
 * @2021072021/7/820:27
 */
public class Test1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入10个数字:");
        for (int i = 0; i < 10; i++) {
            int i1 = scanner.nextInt();
            list.add(i1);
        }
        Collections.sort(list);//根据元素的自然顺序对指定 List 集合元素按升序排序
        Collections.reverse(list);//reverse(List)：反转 List 中元素的顺序
        System.out.println("排序后的数为：");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}

