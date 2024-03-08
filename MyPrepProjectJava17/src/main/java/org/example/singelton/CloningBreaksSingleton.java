package org.example.singelton;

public class CloningBreaksSingleton {

    public static void main(String[] args) throws Exception{
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = (Singleton) instance.clone();
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}
