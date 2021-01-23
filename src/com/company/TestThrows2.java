package com.company;

import java.io.IOException;

class M {
    void method() throws IOException {
        throw new IOException("Thiet bi");
    }
}

public class TestThrows2 {
    public static void main(String args[])  {
        try {
            M m = new M();
            m.method();
        }
        catch (Exception e){
System.out.println(e.getMessage());
        }
        System.out.println("Luong binh thuong...");
    }
}