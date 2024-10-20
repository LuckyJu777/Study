package com.test7;

import java.util.Arrays;
import java.util.Comparator;

class Person{
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return name + " " + age;
    }
}//end Person

class PersonComp implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
//		int result = 1;
//		if(o1.age >= o2.age) result = -1;
//		return result;	//내림차순 정렬

        int result = 1;
        if(o1.age >= o2.age) result = 1;
        return result;	//내림차순 정렬

    }		//collection할 때 함.

}

public class Ex07_8 {
    public static void main(String[] args) {
        Person p = new Person("홍길동", 10);
        Person p2 = new Person("홍길동2", 30);
        Person p3 = new Person("홍길동3", 40);
        Person p4 = new Person("홍길동4", 5);
        Person[] per = {
                p , p2, p3, p4
        };

        System.out.println(per);
        Arrays.sort(per, new PersonComp());
        //per 순회 데이터 출력

        for(int i =0; i<per.length; i++) {
            System.out.println(per[i]);
        }
    }
}