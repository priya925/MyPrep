package org.example;

public class StringNewChanges {

    public static void main(String[] args){
        var str = "  Hello Brother    ";
        var newStr = "     ";
        var string1 = "Hello Java! ";
        System.out.println(string1.repeat(4));
        System.out.println(str.strip() + "," + str.strip().length());
        System.out.println(str.stripLeading() + "," +str.stripLeading().length());
        System.out.println(str.stripTrailing() + "," + str.stripTrailing().length());
        str.lines().forEach(line-> System.out.println(line));
        System.out.println(newStr.isBlank());
        System.out.println(newStr.isEmpty());
    }
}
