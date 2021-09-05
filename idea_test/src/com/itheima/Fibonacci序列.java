package com.itheima;

public class Fibonacci序列 {
    public static void main(String[] args) {
        int f1=1,f2=1;
        int i=1;
        while(i<=20){
            System.out.println(f1);
            System.out.println(f2);
            i++;
            f1=f1+f2;
            f2=f2+f1;
        }
    }
}
