package com.itheima;

import java.util.Scanner;

public class 大于平均值 {
    public static void main(String[] args) {
        int a[]=new int [20];
        Scanner s=new Scanner(System.in);
        int sum=0;
        for(int i=0;i<20;i++){
            a[i]=s.nextInt();
            sum+=a[i];
        }
        int aver=0;
        aver=sum/20;
        for(int i=0;i<20;i++){
            if(a[i]>aver)
                System.out.println(a[i]);
        }



    }
}
