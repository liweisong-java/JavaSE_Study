/**
 * 动态代理举例
 * @author 李伟松
 * @2021 07   2021/7/17  20:34
 */
//interface Human{
//    String getBelief();
//    void eat(String food);
//}
////被代理类
//class SuperMan implements Human{
//    public String getBelief(){
//        return " I believe I can fly！";
//    }
//    public void eat(String food){
//        System.out.println("我喜欢吃" + food);
//    }
//}
///*
//要想实现动态代理，需要解决的问题？
//问题一：如何根据加载到内存中的被代理类，动态的创建一个代理类及其对象
//问题二：当通过代理类的对下个调用方法时，如何动态的去调用被代理类中的同名方法。
// */
//
//class ProxyFactory{
//    MyInvocationHandler handler = new MyInvocationHandler();
//    //调用此方法，返回一个代理类的对象，解决问题一
//    public static Object getProxyInstance(Object obj){//obj:被代理类的对象
//        Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),)
//    }
//}
//class MyInvocationHandler implements InvocationHandler{
//
//    private Object obj; //需要使用被代理类的对象进行赋值
//
//    //当我们通过代理类的对象，调用方法a时，就会自动的调用如下的方法：invoke()
//    //将被代理类要执行的方法a的功能就声明在invoke()中
//    @Override
//    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        return null;
//    }
//}
//public class ProxyTest {
//
//}




//没看懂，重新学
