package day02.src.safetyThread;

/**
 *
 * 例子：创建三个窗口卖票，总票数为100张 使用继承Thread类的方式
 *  存在线程安全问题，待解决
 *
 *  使用同步代码块解决继承Thread类的方式的线程安全问题
 *
 *  在继承Thread类创建多线程的方式中，慎用this充当同步监视器，可以考虑使用当前类使用同步监视器
 *
 * @author liweisong
 * @Time 2021/6/19 22:39
 */
public class WindowTest1 {
    public static void main(String[] args) {

        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();
        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}

class Window extends Thread{
    private static int ticket = 100;
//    public static Object obj = new Object();
    public void run(){
        while (true){
            synchronized (this) {//此时的this:唯一的window的对象
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "  卖票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}



