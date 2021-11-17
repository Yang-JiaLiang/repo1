package com.itheima13;

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        for(int i=1;i<=4;i++) {
            Producer p1 = new Producer("p1",warehouse);
            Producer p2 = new Producer("p2",warehouse);
            Consumer c1 = new Consumer("c2",warehouse);
            Consumer c2 = new Consumer("c2",warehouse);
            p1.start();
            p2.start();
            c1.start();
            c2.start();

        }
    }
}
