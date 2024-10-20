package Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class ArrayListEx1{
	private ArrayList<ArrayListEx1> List = null;
	private static Scanner sc = null;
	
	static boolean run = true;
	String A = "0";
	int i = 0;
	
	void L1(){
		List = new ArrayList<>();
		sc = new Scanner(System.in);
	}
	
	void L2() {	
		String Enter1 = sc.next();
		int Enter2 = sc.nextInt();
		char Enter3 = sc.next().charAt(0);
		boolean Enter4 = sc.nextBoolean();
		
		ArrayLT A1= new ArrayLT();
		A1.setMain(Enter1);
		A1.setServe(Enter2);
		A1.setthird(Enter3);
		A1.setfourth(Enter4);
		ArrayList<ArrayListEx1> List2 = new ArrayList<>();
		
		int i = 0;
		int size = List2.size();
		for(i = 0 ; i<size; i++) {
			ArrayLT A1 = List2.get(i);
			String 
			
		}
	}
	
	void L3() {
		
		
	}
	
	void L4() {
		ArrayList<ArrayListEx1> List1 = new ArrayList<>();
		int size = List1.size();
		for(i = 0; i<size; i++) {
			
		}
	}
}