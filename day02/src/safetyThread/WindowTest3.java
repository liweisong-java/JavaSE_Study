package day02.src.safetyThread;

/**
 * 使用同步方法来解决Runnable接口的线程安全问题
 *
 * @author liweisong
 * @Time 2021/6/20 23:48
 */

class Window3 implements Runnable{
    private int ticket = 100;
    public void run(){
        while (true){
            show();
        }}
    private synchronized void show(){//同步监视器：this
//        synchronized (this){

            if (ticket > 0) {

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + "：卖票，票号为" + ticket);
                ticket--;
            }}}



public class WindowTest3 {
    public static void main(String[] args) {
        Window3 w = new Window3();
        Thread a1 = new Thread(w);
        Thread a2 = new Thread(w);
        Thread a3 = new Thread(w);
        a1.setName("窗口1");
        a2.setName("窗口2");
        a3.setName("窗口3");
        a1.start();
        a2.start();
        a3.start();
    }}
