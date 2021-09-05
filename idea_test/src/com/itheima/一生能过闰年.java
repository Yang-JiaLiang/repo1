package com.itheima;

import java.util.Scanner;

public class 一生能过闰年 {
    public static void main(String[] args) {
        System.out.println("请输入出生年份：");
        Scanner s = new Scanner(System.in);
        int a = Integer.parseInt(s.next());
        System.out.println(a);

        int count=0;
        for (int i=a;i<a+100;i++)
        {
            if((i%4==0&&i%100!=0)||(i%400==0))
             count++;
        }
        System.out.println(count);

        }
}

