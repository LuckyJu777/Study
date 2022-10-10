package Test;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayNandom{
	private ArrayList<ArrayLT> List = null;
	private static ArrayLT Nandom = null;
	private static Scanner sc = null;
	private static Random rd = null;
	
	static boolean run = true;
	String A = "0";
	int i;
	int Enter;
	
	void L1(){
		List = new ArrayList<>();
		Nandom = new ArrayLT();
		sc = new Scanner(System.in);
		rd = new Random();
	}
	
	void L2() {		//N개의 랜덤함수를 입력받고 > 무작위로 수 넣어주기 (난수생성)
		System.out.println("N개의 랜덤함수");
		int Enter1 = sc.nextInt();
		System.out.println("<"+ Enter1 +"> 개의 랜덤함수");
		L3(Enter1); 
	}
	
	void L3(int Enter1) {	//랜덤함수
		ArrayLT;
		for(int i =0; i<Enter1; i++) {
			System.out.println("[" + (rd.nextInt(45)+1)+"]");
			ArrayLT A1= new ArrayLT();
			A1.setMain(Enter1);	//입력받기
		}
		return 
	}
	
	void L4() {	//홀수의 N개가 있다. > 아니 홀수와 짝수를 리스트로 받아줘야 댐
		
		
	}
	
	void L5() {	//홀수의 합은 N개 이다.
		
	}
	
	void L6() { //짝수의 합은 N 입니다.
		
	}
	
	void L7() { //짝수 or 홀수가 더 큽니다.
		
	}
	
	void L8() {	//총 수의 합은 N입니다.
		
	}
}
