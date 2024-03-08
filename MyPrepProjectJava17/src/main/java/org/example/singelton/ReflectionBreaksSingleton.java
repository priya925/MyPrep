package org.example.singelton;

import java.lang.reflect.Constructor;

public class ReflectionBreaksSingleton {

    public static void main(String[] args) throws Exception {
       Singleton obj1 = Singleton.getInstance();
       System.out.println(obj1.hashCode());
       Singleton obj2 = null;
       Constructor c = Singleton.class.getDeclaredConstructor();
       obj2 = (Singleton) c.newInstance();
       System.out.println(obj2.hashCode());
    }
}


