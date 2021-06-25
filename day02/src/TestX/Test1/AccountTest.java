package TestX.Test1;

/**
 * 银行有一个账户
 *      有两个储户分别向同一个账户存3000，每次存1000，存三次。每次存完打印账户余额
 *
 * 分析：是否是多线程问题   是，两个储户线程
 *      是否有共享数据     有，账户余额
 *      是否有线程安全问题  有需要考虑如何解决
 *      需要考虑如何解决线程安全问题    同步机制：有三种方式
 *
 *
 * @author liweisong
 * @Time 2021/6/21 17:27
 */
class Account{
    private double balance;
    public Account(double balance){
        this.balance = balance;
    }
    //存钱
    public synchronized void deposit(double amt){

        if (amt > 0){
            balance += amt;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "存钱成功，余额为：" + balance);
        }
    }
}
class Customer1 extends Thread{
    private Account acct;

    public Customer1(Account acct){
        this.acct = acct;
    }

    public void run(){

        for (int i = 0; i < 3; i++) {

            acct.deposit(1000);

        }

    }
}
public class AccountTest {
    public static void main(String[] args) {
        Account acct = new Account(0);
        Customer1 c1 = new Customer1(acct);
        Customer1 c2 = new Customer1(acct);

        c1.setName("甲");
        c2.setName("乙");

        c1.start();
        c2.start();
    }

}
