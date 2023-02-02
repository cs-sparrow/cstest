package com.atguigu.java;

/**
 * @author cs
 * @create 2022-12-27-17:17
 */
class Window implements Runnable{
    private int tickets = 100;
    //Object o = new Object();

    @Override
    public void run() {
        while(true){
            synchronized(Window.class){
                if(tickets > 0){
                    System.out.println(Thread.currentThread().getName() + "卖票,票号为：" + tickets);
                    tickets--;
                }else{
                    break;
                }
            }
        }
    }
}

public class SellTickets{
    public static void main(String[]args){
        Window w = new Window();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
