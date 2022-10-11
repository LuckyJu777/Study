package Test;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayNandom{
	private ArrayList<Integer> List = null;
	private ArrayList<Integer> N_List = null;	//배열 안 객체 넣지않고 getter setter 쓰지않기
	private ArrayList<Integer> 	odd_Array = null;
	private ArrayList<Integer> even_Array = null;
	private static ArrayLT Nandom = null;
	private static Scanner sc = null;
	private static Random rd = null;
	private int odd_N = 0;	//위에 안쓰이는 코드들 좀 지우기
	private int even_N = 0;
	private int sum;
	static boolean run = true;
	String A = "0";
	int i;
	int Enter;
	
	void L1(){
		List = new ArrayList<>();
		sc = new Scanner(System.in);
		rd = new Random();
	
	}
	
	public int L2() {		//N개의 랜덤함수를 입력받고 > 무작위로 수 넣어주기 (난수생성)
		System.out.println("N개의 랜덤함수");
		int Enter1 = sc.nextInt();
		System.out.println("<"+ Enter1 +"> 개의 랜덤함수");
		L3(Enter1);
	}
	
	void L3(int Enter1) {	//랜덤함수
		for(int i =0; i<Enter1; i++) {
			 int N = ((int)(rd.nextInt(45)+1));
			 List.add(N);
		} 
		System.out.println(List.toString());	//출력
	}
	
	public void L4() {	//L4리스트받음 파라미터로
		int size = List.size();
		for(int i = 0; i<size; i++) {
			int num1 = List.get(i);	//int num은 n_List.get주소 불러오기
			System.out.println("반환" + num1);	//반환4까지는 됨
			
			if(num1%2!=0) {	//if만약 num1은 홀수라면
				num1 += List.get(i);	//int odd N은 주소값 할당까지 넣어줌
				odd_Array.add(num1);	//oddArray는 add로 해서 num1넣어줌
			} else {
				num1 += List.get(i);
				even_Array.add(num1);
			}
		}L5(odd_Array,1); 
		L5(even_Array,2);
	}
	
	public void L5(ArrayList<Integer> List, int print_type) {	//홀수의 N개가 있다. > 아니 홀수와 짝수를 리스트로 받아줘야 댐
		 String print_str = "";
		 
		 if(print_type == 1) {
			 print_str = "홀수";
		 } else if (print_type == 2) {
			 print_str = "짝수";
		 }
		 
		 int size = N_List.size();
		 for(i = 0; i<size; i++) {
			 int str = N_List.get(i);
			 System.out.println(print_type + " : " + str);
		 }
		 System.out.println();
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
