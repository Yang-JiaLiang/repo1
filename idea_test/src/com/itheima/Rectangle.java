package com.itheima;

public class Rectangle {
    private double a,b;//成员变量
    public  Rectangle(double a,double b){
        this.a=a;
        this.b=b;
    }
    public  double getA(){
        return this.a;
    }

    public  double getB(){
        return this.b;
    }

    public void setA (double A){
        this.a =a;
    }

    public void setB (double B){
        this.b=b;
    }



    public  double getPerimeter(){
        return 2*(a+b);
    }


}
