package reflextion;

import deepclone.Car;

public class ClassExample{
	public static void main(String[] args) {
		Car car = new Car(null);	//왜 널값이 여기 들어가지?
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
	
	try {
		Class clazz2 = Class.forName("sec06.exam01_class.Car");
		System.out.println(clazz2.getName());
		System.out.println(clazz2.getSimpleName());
		System.out.println(clazz2.getPackage().getName());
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
		}
	}
}
