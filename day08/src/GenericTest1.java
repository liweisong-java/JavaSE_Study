import org.junit.Test;

/**
 * 如何自定义泛型结构：泛型类，泛型接口，泛型方法
 *
 * 1.关于自定义泛型类，泛型接口
 *
 * @author liweisong
 * @2021072021/7/918:55
 */
public class GenericTest1 {
    @Test
    public void test1(){
        //如果定义了泛型类，实例化没有指明类的泛型，则认为此泛型类型为Object型
        //要求：如果大家定义了类时带泛型的，建议在实例化时要指明类的泛型
        Order order = new Order();
        order.setOrderT(123);
        order.setOrderT("ABC");

        //建议：实例化时指明类的泛型
        Order<String> order1 = new Order("orderAA",1001,"orderAA");

        order1.setOrderT("AA:hello");


    }
    @Test
    public void test2(){
        SubOrder1 sub1 = new SubOrder1();
        sub1.setOrderT(1122);

        SubOrder1<String> sub2 = new SubOrder1<>();
        sub2.setOrderT("order2...");

    }
}
