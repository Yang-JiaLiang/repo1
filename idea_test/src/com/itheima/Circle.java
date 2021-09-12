package com.itheima;

public class Circle {
    private double r;//成员变量

    public Circle(double r)//构造方法
    {
        this.r = r;
    }

    public double getR() {//成员方法
        return this.r;
    }

    public void setR(double r) {//成员方法
        this.r = r;
    }

    public double getArea() {//成员方法
        return r * r * Math.PI;
    }

    public double getPerimeter() {
        return 2 * r * Math.PI;
    }


}
