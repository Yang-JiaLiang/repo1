package com.itheima2;

public class Square extends Shape {
    private  double x;
    public Square (double x){
        this.x=x;
    }
    public double getArea(){
        return x*x;
    }
    public double getPerimeter(){
        return 4*x;
    }

}
