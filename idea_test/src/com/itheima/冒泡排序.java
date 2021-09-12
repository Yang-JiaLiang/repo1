package com.itheima;
import java.util.Scanner;
public class 冒泡排序 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int []a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = s.nextInt();
        }
        int i, j, temp;//按从小到大排序
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        int k;
        for (k = 0; k < 10; k++) {
            System.out.println(a[k]);
        }
    }
}
