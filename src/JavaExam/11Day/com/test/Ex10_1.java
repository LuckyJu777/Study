package com.test;

public class Ex10_1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Object [] arr = {"홍","이","유"};
        for (Object obj : arr) {
            String name = (String)obj;
            System.out.println("이름 : " +name+ " " + "\t" + name.length());

        }
        for (Object obj : arr) {	//object타입에서 형변환 하여 String으로 배열 쓰기
            System.out.println(obj);	//근데 안해서 obj밖에 못씀

        }
        Object[] arr2 = {"홍","이","유","100"};
        for (Object obj : arr2) {	//object타입에서 형변환 하여 String으로 배열 쓰기
            String n = (String)obj;
            System.out.println(n);

        }
    }
}