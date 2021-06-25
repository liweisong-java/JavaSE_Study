package Thread;

/**
 * 测试Thread中的常用方法
 * 1.start():启动当前线程；调用当前线程的run()
 * 2.run():通常需要重写Thread类中的此方法，将创建的线程要执行的操作声明在此方法中
 * 3.currentThread():静态方法，返回执行当前代码的线程
 * 4.getName():获取当前线程的名字
 * 5.setName():设置当前线程的名字
 * 6.yield():释放当前cpu的执行权
 * 7.join():在线程a中调用线程b的join(),此时线程a就进入阻塞状态，
 * 直到线程b完全执行完以后，线程a结束阻塞状态。
 * 8.stop():已过时，当执行方法时，强制结束当前线程
 * 9.sleep(long millitime):让当前线程"milltime"毫秒，在执行的milltime毫秒。在指定的milltime毫秒时间内，
 * 当前线程时阻塞状态
 * 10.isAlive()：判断当前线程是否存活
 * <p>
 * 线程的优先级：
 * 1.
 * MAX_PRIORITY:10
 * MIN_PRIORITY:1
 * MORM_PRIORITY:5默认的优先级
 * <p>
 * 2.如何获取和设置当前线程的优先级
 *      getPriority：获取线程的优先级
 *      setPriority(int p)：设置线程的优先级
 *
 *      s说明：高优先级的线程要抢占低优先级线程cpu的执行权，
 *      但只是从概率讲，高优先级的线程高概率的情况下被执行，
 *      并不意味着只有当高优先级的线程执行完以后才运行低优先级
 * @author liweisong
 * @Time 2021/6/19 18:11
 */
class HelloThread extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {

                System.out.println(Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority() + ":" + i);
//                try {
//                    sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
//            if(i % 20 == 0) {
//                this.yield();
//            }
        }
    }

    public HelloThread(String name) {
        super(name);
    }
}

public class ThreadMethodTest {
    public static void main(String[] args) {
        HelloThread h1 = new HelloThread("Thread:1");
//        h1.setName("线程一");
        h1.start();
        //设置线程的优先级
        h1.setPriority(Thread.MAX_PRIORITY);
        // 给主线程命名
//        Thread.currentThread().setName("主线程");

        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
//        System.out.println(h1.isAlive());
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority() + ":" + i);

            }
//            if(i == 20){
//                try {
//                    h1.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//            if(i == 20) {
//                h1.stop();
//            }
        }

    }

}
