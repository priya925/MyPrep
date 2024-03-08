package org.example;

public final class ImmutableClassObject {

    private final int age;
    private final int height;

    public ImmutableClassObject(int age, int height){
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }
}
