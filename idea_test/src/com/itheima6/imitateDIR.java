package com.itheima6;

import java.io.File;
import java.util.Date;

public class imitateDIR {
    public static void main(String[] args) {
        int dirNum = 0 ,fileNum =0;
        File file =new File("C:\\auto.txt");
        if(! file.exists()){
            try {
                file.createNewFile();
            }catch (Exception ex){
                System.out.println("出异常");
            }
        }


        System.out.println("文件是否存在："+file.exists());
        System.out.println("文件？"+file.isFile()+"\n"+"目录？"+file.isDirectory());
        System.out.println("文件名："+file.getName()+"\n"+"路径名："
                           +file.getPath()+"\n"+"绝对路径名字符串"
                           +file.getAbsolutePath()+"\n"+"文件长度："+file.length());

        File directory =new File ("C:\\myJava\\chapter7\\3");//这里能够创建新的文件夹
        System.out.println(directory.mkdirs());
        File dir =new File("C:\\hp\\BIN");//这里能够在显示 文件检索结果
        String [] str=dir.list();
        for (String s : str) {
            System.out.println(s);
        }
        File[] fs =dir.listFiles();
        for (File f : fs) {
            System.out.println(f);
            System.out.println(f.getName());
            System.out.println(new Date(f.lastModified()) + "\t");
            if (f.isDirectory()) {
                dirNum++;
                System.out.print("<DIR>\t");
            } else {
                fileNum++;
                System.out.print(f.length() + "\t");

            }
        }
        file.delete();
    }

}
