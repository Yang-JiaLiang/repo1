package com.itheima13;

public class Consumer extends Thread {
    private String name;
    private Warehouse warehouse;

    public Consumer(String name,Warehouse warehouse) {
        this.name =name;
        this.warehouse = warehouse;


    }

    public void run() {
        int value = 0;
        for (int i = 1; i <= 10; i++) {
            value = warehouse.get();
            System.out.println(name+" got:" + value);
        }
    }
}
