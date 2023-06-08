package com.test6;

public class Cat extends Pet {
    String color;

    public Cat(String name, int age, String gender, String color) {
        super(name, age, gender);
        this.color = color;
    }

    @Override
    public String getPet() {
        return super.getPet() + "\t" + color;
    }

    @Override
    public String toString() {
        return "Cat [color=" + color + "]"
                +"[name=" + name     + "]";
    }


}