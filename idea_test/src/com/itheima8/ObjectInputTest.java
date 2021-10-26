package com.itheima8;
import java.io.*;


public class ObjectInputTest {
    public static void main(String[] args) {
        ObjectInputTest test =new ObjectInputTest();
        try {
            System.out.println(((Employee) test.ReadObj()).getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Object ReadObj() throws Exception{
        FileInputStream fi=null;
        ObjectInputStream ois= null;
        Object obj =null;
        fi= new FileInputStream("C:\\hp\\BIN\\作业.docx");//不能是文件夹，得是具体文档
        ois =new ObjectInputStream(fi);
        obj =ois.readObject();
        ois.close();
        fi.close();
        return obj;
    }
}
