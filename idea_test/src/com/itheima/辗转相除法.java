package com.itheima;

import java.util.Scanner;

public class 辗转相除法 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int oa=a;
        int ob=b;
        while(b!=0) {
            int i=a%b;
            a=b;
            b=i;
        }
        System.out.println(oa+"和"+ob+"的最大公约数为"+a);


    }

}
