package com.itheima8;

import java.io.Serializable;

public class Employee implements Serializable {
    private  int age;
    private  String name;
    private  float  salary;
    public  Employee (int age,String name,float salary){
        this.age=age;
        this.name =name;
        this.salary=salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public  String toString(){
        return  "姓名：" +name+", 年龄："+age+", 工资："+salary;
    }
}
