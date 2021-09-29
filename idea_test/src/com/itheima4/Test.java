package com.itheima4;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        try {
            student.setAge(520);
        } catch (AgeLT0Exception e) {
            e.printStackTrace();
        } catch (AgeGT150Exception e) {
            e.printStackTrace();
        }

        try {
            student.setAge(-520);
        } catch (AgeLT0Exception | AgeGT150Exception e) {
            e.printStackTrace();
        }

    }

}
