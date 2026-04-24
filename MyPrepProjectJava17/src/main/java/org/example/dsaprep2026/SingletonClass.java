package org.example.dsaprep2026;

public class SingletonClass {

    private SingletonClass singletonClassObj= null;
    private SingletonClass(){
        getSingletonClassInstance();
    }

    public SingletonClass getSingletonClassInstance(){

        synchronized (singletonClassObj){
            if(singletonClassObj != null){
                singletonClassObj = new SingletonClass();
                return singletonClassObj;
            }
            return singletonClassObj;
        }
    }


}
