package com.itheima;

public class 随机 {
    public static void main(String[] args) {

        int []a=new int[20];
        int sum=0,aver=0;
        int max=a[0];
        int min=a[0];
        for(int i=0;i<a.length;i++)
        {
            a[i]=77+(int)(Math.random()*(459-77));

            if(a[i]>a[0])
                max=a[i];

            if(a[i]<a[0])
                min=a[i];
            sum+=a[i];
        }
        aver=sum/20;
        System.out.println("数组中最大值为"+ max);
        System.out.println("数组中最小值为"+min);
        System.out.println("数组中平均值为"+aver);
        System.out.println("数组中元素和为"+sum);


    }
}
