package deepclone;

import javax.xml.crypto.Data;

public class ToStringExample{
	public static void main(String[] args) {
		Object obj1 = new Object();
		
		Data obj2 = new Data();
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	}
}