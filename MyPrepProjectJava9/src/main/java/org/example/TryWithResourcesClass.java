package org.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TryWithResourcesClass {

    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fo = new FileOutputStream("abc.txt");
        try(fo){
            String abc = "abc";
            byte[] b = abc.getBytes();
            fo.write(b);
            System.out.println("File written");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
