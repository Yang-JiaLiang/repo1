package com.itheima7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class imgCopy {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/$360Section/月亮.jpg");
        FileInputStream fis = new FileInputStream(file);
        byte[] bit = new byte[fis.available()];
        fis.read(bit);
        File file2 = new File("C:/data/月亮.jpg");
        FileOutputStream fos = new FileOutputStream(file2);
        fos.write(bit);
        fis.close();
        fos.close();
    }


}
