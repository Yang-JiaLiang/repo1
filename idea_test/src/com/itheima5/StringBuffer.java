package com.itheima5;

public class StringBuffer {
    public static void main(String[] args) {
        String str ="";
        StringBuffer sb =new StringBuffer();
        long startTime;
        long endTime ;
        startTime=System.currentTimeMillis();
        for(int i=0;i<9999;i++){
            str=str+"sssss";
        }
        endTime =System.currentTimeMillis();
        System.out.println("使用string的时间是:"+(endTime-startTime)+"毫秒");
        
        startTime =System.currentTimeMillis();
        for(int i=0;i<9999;i++){
            sb.append("sssss");
        }
        endTime =System.currentTimeMillis();
        System.out.println("使用StringBuffer的时间是："+(endTime-startTime)+"毫秒");
    }

    private void append(String sssss) {
    }


}
