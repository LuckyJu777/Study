package Test;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayNandom {
	private ArrayList<Integer> List = new ArrayList<Integer>();
	private ArrayList<Integer> N_List = new ArrayList<Integer>(); // 배열 안 객체 넣지않고 getter setter 쓰지않기
	private ArrayList<Integer> odd_Array = new ArrayList<Integer>();
	private ArrayList<Integer> even_Array = new ArrayList<Integer>();
	private static Scanner sc = null;
	private static Random rd = null;

	private int num1 = 0; // L3
	private int odd_N = 0; // 위에 안쓰이는 코드들 좀 지우기
	private int even_N = 0;
	private int sum;

	void L1() {
		List = new ArrayList<Integer>();
		N_List = new ArrayList<Integer>();
		odd_Array = new ArrayList<Integer>();
		even_Array = new ArrayList<Integer>();
		sc = new Scanner(System.in);
		rd = new Random();
	}

	public void L2() { // N개의 랜덤함수를 입력받고 > 무작위로 수 넣어주기 (난수생성)
		System.out.println("N개의 랜덤함수");
		int Enter1 = sc.nextInt();
		System.out.println("<" + Enter1 + "> 개의 랜덤함수");

		ArrayNandom test = new ArrayNandom();
		test.L3(Enter1);
	}

	public void L3(int Enter2) { // Enter2에는 들어감
		for (int i = 0; i < Enter2; i++) {
			List.add((int) (rd.nextInt(100) + 1));
		}
		
		System.out.println(List.toString());
		L4(List);
	}

	// 자 여기까지는 됐어
	public void L4(ArrayList<Integer> N_List) {
	
		int size = N_List.size(); // 값 받았으니까 뭐라도 처 나오는거겠지 됐다 일단 문제해결했다 근데 오 ㅐ저렇게 나옴
		for (int i = 0; i < size; i++) {
			num1 = N_List.get(i); // 해당주소값 만약 i 1이라면

			if (num1 % 2 == 0) { // if만약 num1은 홀수라면
				odd_Array.add(num1); // oddArray는 add로 해서 num1넣어줌
			} else if (num1 % 2 != 0) {
				even_Array.add(num1); // 이거 오류 났던 이유가 null값 넣어줘서 새 배열을 못만들고
			}

		}

		System.out.println(odd_Array); // 그리고 이건 왜 입력이 안되는거지?
		System.out.println(even_Array); // 음..
		L5(odd_Array, 1);
		L5(even_Array, 2);
	}

	public void L5(ArrayList<Integer> List, int print_type) { // 홀수의 N개가 있다. > 아니 홀수와 짝수를 리스트로 받아줘야 댐
		String print_str;

		if (print_type == 1) {
			print_str = "짝수";
			System.out.println(print_str);
		} else if (print_type == 2) {
			print_str = "홀수";
			System.out.println(print_str);
		}

		System.out.println(List);
		int size = N_List.size();
		for (int i = 0; i < size; i++) {
			int str = N_List.get(i);
			odd_Array.add(str);
		}
	}

	void L6() { // 홀수의 합은 N개 이다.
		ArrayNandom dom2 = new ArrayNandom();

		System.out.println("출력확인");
	}

	// 짝수의 합은 N 입니다.

	void L7() { // 짝수 or 홀수가 더 큽니다.

	}

	void L8() { // 총 수의 합은 N입니다.

	}
}
