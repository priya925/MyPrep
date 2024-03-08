package org.example.singelton;

import java.io.Serializable;

public class Singleton implements Serializable {
    private static volatile Singleton instance = null;
    private Singleton() throws Exception {
        if(instance != null){
            throw new Exception("instance already exists");
        }
    }

    public static Singleton getInstance() throws Exception {
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null)
                    instance = new Singleton();
            }
        }
        return instance;
    }

    protected Object readResolve(){
        return instance;
    }

    protected Object clone(){
        return instance;
    }
}
