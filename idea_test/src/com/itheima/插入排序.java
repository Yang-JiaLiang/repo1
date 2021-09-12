package com.itheima;
public class 插入排序 {
    public static void main(String[] args) {
        int[] a = {9, 5, 1, 7, 3, 2, 6, 8, 4, 0};
        //按从小到大排序
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j - 1] > a[j]) {
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int k = 0; k < 10; k++) {
            System.out.println(a[k] + "  ");
        }
    }
}
