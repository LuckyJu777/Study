package Test;

import java.util.ArrayList;	//getter와 setter를 이용해서 쓰기
import java.util.Random;
import java.util.Scanner;

public class ArrayRandom {
	private ArrayList<ArrayLT> List = new ArrayList<ArrayLT>();
	private ArrayLT LTest = new ArrayLT();
	private static Scanner sc = null;
	private static Random rd = null;

	private int num1 = 0; // L3
	private static int sum = 0;
	private static int odd_sum = 0;
	private static int even_sum = 0; // even이 홀수야

	void R1() {
		List = new ArrayList<ArrayLT>();	//ArrayLT를 객체 배열안에 넣어줌
	
		sc = new Scanner(System.in);
		rd = new Random();
	}

	public void R2() { // N개의 랜덤함수를 입력받고 > 무작위로 수 넣어주기 (난수생성)
		System.out.println("N개의 랜덤함수");
		int Enter1 = sc.nextInt();
		
		
		LTest.setMain(Enter1); // 값넣기	, 객체생성자변수이름 . 메소드명 ( 넣을 파라미터값 )
		List.add(LTest);
	}

	public void R3() { // Enter2에는 들어감
		int size = LTest.getMain();
		for (int i = 0; i < size; i++) {
			LTest.setMain2((int) (rd.nextInt(100) + 1));
		}
		System.out.println(LTest.getMain2());
//		L4(List); // 호출
	}
//
//	// 자 여기까지는 됐어
//	public void R4(ArrayList<Integer> List) {
//		System.out.println("출력확인용L4 " + List); // List에 잘 들어왔
//		int size = List.size();
//		for (int i = 0; i < size; i++) {
//			num1 = List.get(i);
//			sum += num1; // 리스트 총 합계 sum 값~
//			if (num1 % 2 == 0) {
//				odd_sum += List.get(i); // 아니이거 for문을 또 만들어야 하나
//				odd_Array.add(num1);
//			} else if (num1 % 2 != 0) {
//				even_sum += List.get(i);
//				even_Array.add(num1); // 홀수~
//			}
//		}
//		R5(odd_Array, 1); // 어떻게 되냐면 저기로 값을 넣어주고 여기서 당장 실행
//		R5(even_Array, 2); // 실행 구문을 다 돌고 나온다음에 다음 줄 실행
//		System.out.println("odd랑 even배열L5 > 호출 끝 L4");
//		System.out.println("");
//		R6(odd_Array, even_Array);
//		R8(odd_Array, even_Array);
//	}
//
//	public void R5(ArrayList<Integer> N_Array, int print_type) { // 홀수의 N개가 있다. > 아니 홀수와 짝수를 리스트로 받아줘야 댐
//		String print_str;
//
//		if (print_type == 1) {
//			print_str = "짝수";
//			System.out.println(N_Array + " : " + print_str);
//		} else if (print_type == 2) {
//			print_str = "홀수";
//			System.out.println(N_Array + " : " + print_str);
//		}
//
//	void R6(ArrayList<Integer> O_Array, ArrayList<Integer> E_Array) {// 홀수 혹은 짝수의 총 배열사이즈 값은 N 입니다.
//		System.out.println("odd 사이즈 출력 확인 : " + O_Array.size()); // 홀짝 값
//		System.out.println("even 사이즈 출력 확인 : " + E_Array.size());
//	}
//
//	void R7() {
//		System.out.println("리스트 총 합계 sum 값 :  " + sum);
//		System.out.println("짝수 총 합계 odd_sum 값 :  " + odd_sum);
//		System.out.println("홀수 총 합계 even_sum 값 :  " + even_sum);
//	}
//
//	void R8(ArrayList<Integer> O_Array, ArrayList<Integer> E_Array) { // 문자열 비교하여 더 큰 데이터양 출력
//		if (O_Array.equals(E_Array)) {
//			System.out.println("홀수의 배열길이가 더 큽니다.");
//		} else {
//			System.out.println("짝수의 배열길이가 더 큽니다.");
//		}
//	}
//
//	void R9() { // 홀수 총합 짝수 총합 비교
//		if (odd_sum > even_sum) {
//			System.out.println("짝수의 총 합이 더 큽니다.");
//		} else {
//			System.out.println("홀수의 총합이 더 큽니다.");
//		}
//	}

}