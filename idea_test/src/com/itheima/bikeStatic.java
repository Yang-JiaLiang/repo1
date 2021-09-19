package com.itheima;

public class bikeStatic {
    public static class bike {//类bike
        String color;
        static String size;//被static修饰的静态成员变量

        public static void main(String[] args) {
            //创建一个bike类的对象实例，名称b，即对象引用
            bike b = new bike();
            b.color = "黄色";
            size = "25尺寸";
            System.out.println("bike颜色：" + b.color);//color没有用static修饰，则不能用bike.color调用
            System.out.println("bike型号：" + bike.size);
            /*static修饰的成员被所有的对象所共享；
              静态变量能被对象调用，还能被类名调用；*/
        }

    }

}
