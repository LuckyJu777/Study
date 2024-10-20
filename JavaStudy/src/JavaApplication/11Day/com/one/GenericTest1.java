package com.one;

import java.util.Date;

//<>안에는 변수명 아무거나 지정해도 됌
class Box<T>{
    T obj;

    public void setVal(T obj) {
        this.obj = obj;
    }

    public T getVal() {
        return obj;
    }
}
public class GenericTest1 {

    public static void main(String[] args) {
        Box<String> b = new Box<String>();
        b.setVal("hello");
        b.setVal("100");
//		b.setVal(new Date());//error

        String x = b.getVal();//자동형변환
        System.out.println(x.length());
        System.out.println(x);

        Box<Date> b2 = new Box<>();
        b2.setVal(new Date());
//		b2.setVal("aaa");
        Date d =b2.getVal();	//형변환 필요 없음
        System.out.println(d);

        Box<Integer> dd = new Box<>();
        dd.setVal(100);
//		b2.setVal("aaa");
        int ddd = dd.getVal();	//형변환 필요 없음 , 오토언박싱
        System.out.println(ddd);
    }

}