package com.itheima8;
import java.io.*;

public class ObjectOutputTest {
    public static void main(String[] args) {
        ObjectOutputTest test =new ObjectOutputTest();
        Employee em =new Employee(29,"james",4000f);
        try {
            test.WriteObj(em);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //对象写的操作
    public  void WriteObj(Object obj)throws  Exception{
        FileOutputStream fo =null;
        ObjectOutputStream oos =null;
        fo =new FileOutputStream("C:\\hp\\BIN\\作业.docx");
        oos =new ObjectOutputStream(fo);
        oos.writeObject(obj);
        oos.flush();
        oos.close();
        fo.close();
    }
}
