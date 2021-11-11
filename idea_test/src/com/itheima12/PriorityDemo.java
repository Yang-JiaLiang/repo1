package com.itheima12;

public class PriorityDemo extends Thread{
    //例11-3:线程的优先级演示
    public void run(){
        for(int i=1;i<=1000;i++){
            System.out.println(Thread.currentThread().getName()+ " 第 "+i+"次运行");
            Thread.yield();//让出cpu执行权
        }
    }

    public static void main(String[] args) {
        PriorityDemo t1 =new PriorityDemo();
        PriorityDemo t2 =new PriorityDemo();
        PriorityDemo t3 =new PriorityDemo();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
