package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;

public class FileOutputStreamExample {
    public static void main(String args[]) throws IOException {
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream("D:\\testout.txt");
            String s = "Hello Tang Yu Cheng";
            byte[] b = s.getBytes();
            fout.write(b);
            System.out.println("Success");

        }
        catch (Exception e){
            System.out.println(e);

        }
        finally {
            fout.close();
        }
    }
}