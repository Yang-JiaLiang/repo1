package com.itheima12;

public class FirstThread extends Thread {
    //例11-1：继承Thread类来建立线程类。
    private String name;
    public FirstThread(String name){
        super(name);// 访问父类成员方法
        System.out.println(name+"创建成功");
    }
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println(Thread.currentThread().getName()+"第"+i+"次运行");
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        FirstThread t1 =new FirstThread("第一个线程");
        FirstThread t2 =new FirstThread("第二个线程");
        System.out.println("开始启动t1、t2线程");
        t1.start();
        t2.start();
        System.out.println("main方法运行完毕");
    }

}
