package com.itheima;

public class 统计每个字母次数 {
    public static void main(String[] args) {
        String str1 = "ABadgeIAdj";

        int[] count = new int[52]; //用来存储字母a-z A-Z出现的次数。


        for(int i=0; i<str1.length(); i++){

            char tmp = str1.charAt(i); //依次取出每个字母
            if((tmp>=65&& tmp<=90)||(tmp>=97&& tmp<=122)){

                int index = tmp - 65; //利用ascii码表，最小结果是0.
                count[index] = count[index] + 1;
            }
        }

        //循环打印每个字母出现次数
        for(int j=0; j<count.length; j++){
            if(count[j]!=0)
                System.out.println("字母"+(char)(j+65)+"出现次数："+count[j]);
        }


    }
}
