package com.test;
class Emp {
    public Emp() {
        System.err.println("Emp 생성자 1");
    }
    public Emp(String name, int salary) {
        System.err.println("Emp 생성자 2");
    }
}

class Man extends Emp {
    public Man() {
        System.err.println("Man 생성자 ");
    }
}

public class Ex06_2 {

    public static void main(String[] args) {
        Man man = new Man();
    }

}