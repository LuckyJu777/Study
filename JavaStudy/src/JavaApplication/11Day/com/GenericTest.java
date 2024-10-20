package com;

import java.util.Date;

class Box{
    Object obj;

    public void setVal(Object obj){
        this.obj = obj;
    }
    public Object getVal() {
        return obj;
    }
}

public class GenericTest {
    public static void main(String[] args) {
        Box b = new Box();
        b.setVal("hell");
        String strData = (String) b.getVal();	// obj를 바로 String안에 꽂을 수 없기 때문에
//		String strData = (String)objData;	//변수로 받아와 String변수에 저장
        System.out.println(strData + "\t" + strData.length());

        Box b2 = new Box();
        b2.setVal(new Date());
        Date d = (Date)b2.getVal();
        System.out.println(d.toString());

        Box b3 = new Box();
        b3.setVal(100);
        Integer num = (Integer) b3.getVal();
        System.out.println(num);
        int number = num.intValue();
    }
}