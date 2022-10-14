package Test;

import java.util.ArrayList;	//getter와 setter를 이용해서 쓰기
import java.util.Random;
import java.util.Scanner;

public class ArrayRandom {
	private ArrayList<ArrayListData> List = new ArrayList<>();
	private ArrayListData LTest = new ArrayListData();
	private static Scanner sc = null;
	private static Random rd = null;
	
	public void constructor_maker() {	//생성자
		sc = new Scanner(System.in);
		rd = new Random();
		
	}

	public void input_Number() { // N개의 랜덤함수를 입력받고 > 무작위로 수 넣어주기 (난수생성)
		System.out.println("N개의 랜덤함수");
		int Enter1 = sc.nextInt();
		
		LTest.setinput_N(Enter1); // 값넣기	, 객체생성자변수이름 . 메소드명 ( 넣을 파라미터값 ) 1번째 줄
		System.out.println(LTest.toString()+"LTest에 뭐들어갔는지 함 보자");
	}
	
	public void input_RandomNumber() { // Enter2에는 들어감
		int size = LTest.getinput_N();
		for (int i = 0; i < size; i++) {
			LTest.setinput_N_List((int) (rd.nextInt(100) + 1));
		}
		LTest.getinput_N_List();
		LTest.get_even_List();	//값을 넣어주는게 아니여써? 호출을 하는거여꾼
		System.out.println("R3 getMain2호출완료");
	}
	
	public void input_even_L() { // 홀수의 N개가 있다. > 아니 홀수와 짝수를 리스트로 받아줘야 댐
		
	}
//	public void R6(ArrayList<Integer> O_Array, ArrayList<Integer> E_Array) {// 홀수 혹은 짝수의 총 배열사이즈 값은 N 입니다.
//		System.out.println("odd 사이즈 출력 확인 : " + O_Array.size()); // 홀짝 값
//		System.out.println("even 사이즈 출력 확인 : " + E_Array.size());
//	}
//
//	public void R7() {
//		System.out.println("리스트 총 합계 sum 값 :  " + sum);
//		System.out.println("짝수 총 합계 odd_sum 값 :  " + odd_sum);
//		System.out.println("홀수 총 합계 even_sum 값 :  " + even_sum);
//	}
//
//	public void R8(ArrayList<Integer> O_Array, ArrayList<Integer> E_Array) { // 문자열 비교하여 더 큰 데이터양 출력
//		if (O_Array.equals(E_Array)) {
//			System.out.println("홀수의 배열길이가 더 큽니다.");
//		} else {
//			System.out.println("짝수의 배열길이가 더 큽니다.");
//		}
//	}
//
//	public void R9() { // 홀수 총합 짝수 총합 비교
//		if (odd_sum > even_sum) {
//			System.out.println("짝수의 총 합이 더 큽니다.");
//		} else {
//			System.out.println("홀수의 총합이 더 큽니다.");
//		}
//	}
}