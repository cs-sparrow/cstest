package com.atguigu.java;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 两个储户，分别往同一个账户里面存3000元，分三次存，每次1000元
 * @author cs
 * @create 2022-12-29-22:35
 */
public class AccountTest {
    public static void main(String[] args) {
        Account a = new Account(0);
        Customer c1 = new Customer(a);
        Customer c2 = new Customer(a);
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.setName("储户1");
        t2.setName("储户2");
        t1.start();
        t2.start();

    }
}
class Customer implements Runnable{

    Account acct = new Account(0);

    public Customer(Account acct){
        this.acct = acct;
    }

    @Override
    public void run() {
        for (int i=0;i<3;i++){
            acct.deposite(1000);
        }
    }

}
class Account{

    private double balance;
    ReentrantLock lock = new ReentrantLock();

    public Account(double balance){
        this.balance = balance;
    }

    public void deposite(double amt){
        try{
            lock.lock();
            if (amt > 0) {
                balance += amt;

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                System.out.println(Thread.currentThread().getName() + "存钱，余额为：" + balance);
            }

            }finally{
               lock.unlock();
            }

        }


}
