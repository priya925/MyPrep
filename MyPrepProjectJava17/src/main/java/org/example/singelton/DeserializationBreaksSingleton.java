package org.example.singelton;

import java.io.*;

public class DeserializationBreaksSingleton {

    public static void main(String[] args) throws Exception {
        FileOutputStream f = new FileOutputStream("File.txt");
        Singleton i = Singleton.getInstance();
        ObjectOutput o = new ObjectOutputStream(f);
        o.writeObject(i);
        o.close();

        FileInputStream f1 = new FileInputStream("File.txt");
        ObjectInput o1 = new ObjectInputStream(f1);
        Singleton i1 = (Singleton) o1.readObject();
        o1.close();
        System.out.println(i.hashCode());
        System.out.println(i1.hashCode());

    }
}
