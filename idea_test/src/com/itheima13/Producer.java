package com.itheima13;

public class Producer extends Thread {
    private String name;
    private Warehouse warehouse;


    public Producer(String name,Warehouse warehouse) {
        this.name =name;
        this.warehouse = warehouse;

    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            warehouse.put(i);
            System.out.println(name+" put:" + i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
