package com.itheima2;

public class TestShape {
    public static void main(String[] args) {
        Shape shape1 =new Circle(3);
        System.out.println("shape1.getArea()="+shape1.getArea());
        Shape shape2= new Rectangle(5,4);
        System.out.println("shape2.getPerimeter()="+shape2.getPerimeter());
        Shape shape3=new Square(4);
        System.out.println("shape3.getArea()="+shape3.getArea());



    }
}
