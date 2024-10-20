package Test;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayNandom {
	private ArrayList<Integer> List = null;
	private ArrayList<Integer> odd_Array = null;
	private ArrayList<Integer> even_Array = null;
	private static Scanner sc = null;
	private static Random rd = null;

	private int num1 = 0; // L3
	private int sum = 0;
	private static int odd_sum = 0;
	private static int even_sum = 0; // even이 홀수야
	

	public ArrayNandom() {
		List = new ArrayList<Integer>();
		odd_Array = new ArrayList<Integer>();
		even_Array = new ArrayList<Integer>();
		sc = new Scanner(System.in);
		rd = new Random();
	}


	//public void input_number() { // N개의 랜덤함수를 입력받고 > 무작위로 수 넣어주기 (난수생성)
	public void inputNumber() { // N개의 랜덤함수를 입력받고 > 무작위로 수 넣어주기 (난수생성)
		System.out.println("N개의 랜덤함수");
		int Enter1 = sc.nextInt();
		System.out.println("<" + Enter1 + "> 개의 랜덤함수");

		
		L3(Enter1); // 호출 반환
	}

	public void L3(int Enter2) { // Enter2에는 들어감
		for (int i = 0; i < Enter2; i++) {
			List.add((int) (rd.nextInt(100) + 1));
		}

//		System.out.println("출력확인용L3" + List); // List에 잘 들어왔
		L4(); // 호출
//		System.out.println("L4(List)출력완료");
	}
	
	/**
	 * 
	 * @param find_type 0 : 짝수 , 1 : 홀수
	 * @return
	 */
	public ArrayList<Integer> get_find_num_list(int find_type , ArrayList<Integer> local_Array) {
		
		ArrayList<Integer> even_list = new ArrayList<>();
		
		int size = this.List.size();
		for (int i = 0; i < size; i++) {
			num1 = List.get(i);

			if (num1 % 2 == find_type) {
				even_list.add(num1);
			}
		}
//		return even_list;
		return even_list;
	}
	
	
	/**
	 * 
	 * @param find_type 0 : 짝수 , 1 : 홀수
	 * @return
	 */
	public ArrayList<Integer> get_find_num_list(int find_type) {
		ArrayList<Integer> local_Array = new ArrayList<>();
		
		int size = this.List.size();
		for (int i = 0; i < size; i++) {
			num1 = List.get(i);

			if (num1 % 2 == find_type) {
				local_Array.add(num1);
			}
		}

		return local_Array;
	}
	
	

	public ArrayList<Integer> get_find_odd() {
		ArrayList<Integer> local_odd_Array = new ArrayList<>();
		
		int size = this.List.size();
		for (int i = 0; i < size; i++) {
			num1 = List.get(i);

			if (num1 % 2 == 0) {
				local_odd_Array.add(num1);
			}
		}

		return local_odd_Array;
	}
	
	// 자 여기까지는 됐어
	public void L4() {
		
//		ArrayList<Integer> odd_Array = new ArrayList<>();
//		ArrayList<Integer> even_Array = new ArrayList<>();
//		
//		System.out.println("출력확인용L4 " + List); // List에 잘 들어왔

		int size = this.List.size();
		for (int i = 0; i < size; i++) {
			num1 = List.get(i);
			sum += num1; // 리스트 총 합계 sum 값~

			if (num1 % 2 == 0) {
				odd_sum += List.get(i); // 아니이거 for문을 또 만들어야 하나
				odd_Array.add(num1);
			} else if (num1 % 2 != 0) {
				even_sum += List.get(i);
				even_Array.add(num1); // 홀수~
			}
		}
		
		
		L5(); // 디폴트 찾수 찾기
		L5( 1); // 어떻게 되냐면 저기로 값을 넣어주고 여기서 당장 실행
		L5( 2); // 실행 구문을 다 돌고 나온다음에 다음 줄 실행
		L6(odd_Array, even_Array);
		L7(odd_Array, even_Array);
		
		System.out.println("L4 호출 끝(L5,L5,L6,L7)");
		System.out.println("");
	}

	//디폴트 짝수 찾기
	public void L5() {
		L5(1);
	}
	
	public void L5(int print_type) { // 홀수의 N개가 있다. > 아니 홀수와 짝수를 리스트로 받아줘야 댐
		String print_str;

		if (print_type == 1) {
			print_str = "짝수";
			System.out.println(even_Array + " : " + print_str);
		} else if (print_type == 2) {
			print_str = "홀수";
			System.out.println(odd_Array + " : " + print_str);
		}
	}
	
	public void L6(ArrayList<Integer> O_Array, ArrayList<Integer> E_Array) { // 문자열 비교하여 더 큰 데이터양 출력
		if (O_Array.equals(E_Array)) {
			System.out.println("홀수의 배열길이가 더 큽니다.");
		} else {
			System.out.println("짝수의 배열길이가 더 큽니다.");
		}

	}
	
	public void L7(ArrayList<Integer> O_Array, ArrayList<Integer> E_Array) {// 홀수 혹은 짝수의 총 배열사이즈 값은 N 입니다.
		System.out.println("odd 사이즈 출력 확인 : " + O_Array.size()); // 홀짝 값
		System.out.println("even 사이즈 출력 확인 : " + E_Array.size());
	}

	public void L8() {
		System.out.println("리스트 총 합계 sum 값 :  " + sum);
		System.out.println("짝수 총 합계 odd_sum 값 :  " + odd_sum);
		System.out.println("홀수 총 합계 even_sum 값 :  " + even_sum);
	}

	public void L9() { // 홀수 총합 짝수 총합 비교
		if (odd_sum > even_sum) {
			System.out.println("짝수의 총 합이 더 큽니다.");
		} else {
			System.out.println("홀수의 총합이 더 큽니다.");
		}
	}
	
	public int getSum() {
//		this.sum = sum;
		//System.out.println("[sum]" + sum);
		return sum;
	}
}
