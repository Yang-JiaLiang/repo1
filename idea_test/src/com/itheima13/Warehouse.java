package com.itheima13;

public class Warehouse {
    private int content;
    private boolean available = false;

    public synchronized int get() {
        while (!available) {//'available == false' 可以简化为 '!available'
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        available = false;
        notifyAll();
        return content;

    }

    public synchronized void put(int value) {
        while (available) {//'available == true' 可以简化为 'available'
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        content = value;
        available = true;
        notifyAll();
    }
}
