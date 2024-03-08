package org.example.java17;

public class SealedClassExample {
    public static void main(String[] args){
        Shape shape = new Circle();
        Circle circle = new Circle();
        Square square = new Square();
        Cube cube = new Cube();
        Abc abc = new Abc();
        shape.show();
        circle.show();
        square.show();
        cube.show();
        abc.show();
    }
}

sealed class Shape permits Circle, Square, Cube{
    public void show(){
        System.out.println("I am in Shape class");
    }
}

final class Circle extends Shape{
    public void show(){
        System.out.println("I am in Circle class");
    }
}

sealed class Square extends Shape permits Abc{
    public void show(){
        System.out.println("I am in Square class");
    }
}

non-sealed class Cube extends Shape{
    public void show(){
        System.out.println("I am in Cube class");
    }
}

final class Abc extends Square{

}