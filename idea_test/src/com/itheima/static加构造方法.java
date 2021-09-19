package com.itheima;

public class static加构造方法 {


    public static void main(String[] args) {
        new Hello();
    }
}

class Hello {
    public Hello() {
        System.out.println("HelloWorld!");
    }

    static {
        System.out.println("static加载类时我就执行了，比构造方法还早");
    }
}

