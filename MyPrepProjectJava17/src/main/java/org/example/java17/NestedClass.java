package org.example.java17;

public class NestedClass {

    public static void main(String[] args){
        OuterClass oc = new OuterClass();
        OuterClass.InnerClass ocic = oc.new InnerClass();
        oc.outerClassMethod();
        ocic.show();
    }
}

class OuterClass{
    private int i = 10;
    public void outerClassMethod(){
        System.out.println("I am outer class method");
    }
    class InnerClass{
        public void show(){
            System.out.println("I am inner class printing outer class data: "+ i);
        }
    }

}

