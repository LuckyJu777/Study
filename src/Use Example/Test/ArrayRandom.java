package Test;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayRandom {
	private ArrayList<Integer> List = null;
	private ArrayList<Integer> odd_Array = null;
	private ArrayList<Integer> even_Array = null;
	private static Scanner sc = null;
	private static Random rd = null;

	private int enterNum = 0; // L3
	private int sum = 0;
	private static int odd_sum = 0;
	private static int even_sum = 0; // even이 홀수야

	public ArrayRandom() {
		List = new ArrayList<Integer>();
		odd_Array = new ArrayList<Integer>();
		even_Array = new ArrayList<Integer>();
		sc = new Scanner(System.in);
		rd = new Random();
	}

	public void inputNumber() { // N개의 랜덤함수를 입력받고 > 무작위로 수 넣어주기 (난수생성)
		System.out.println("N개의 랜덤함수");
		int enterNum = sc.nextInt();
		System.out.println("<" + enterNum + "> 개의 랜덤함수");

		inputRandom(enterNum); // 호출 반환
	}

	public void inputRandom(int enterDataNum) { // Enter2에는 들어감
		for (int i = 0; i < enterDataNum; i++) {
			List.add((int) (rd.nextInt(100) + 1));
		}
		combineConst(); // 호출
	}

	/**
	 * 
	 * @param find_type 0 : 짝수 , 1 : 홀수
	 * @return
	 */
	public ArrayList<Integer> get_find_num_list(int find_type, ArrayList<Integer> local_Array) {

		ArrayList<Integer> even_list = new ArrayList<>();

		int size = this.List.size();
		for (int i = 0; i < size; i++) {
			enterNum = List.get(i);

			if (enterNum % 2 == find_type) {
				even_list.add(enterNum);
			}
		}
		System.out.println("get_find_num_list , return 출력 : >" + even_list);
		return even_list;
	}

	/**
	 * 
	 * @param find_type 0 : 짝수 , 1 : 홀수
	 * @return
	 */
	public ArrayList<Integer> get_find_num_list(int find_type) { // get_find_num_list 로(int find_type) 받기
		ArrayList<Integer> local_Array = new ArrayList<>(); // local new Array 만들어서

		int size = this.List.size();
		for (int i = 0; i < size; i++) {
			enterNum = List.get(i);

			if (enterNum % 2 == find_type) {
				local_Array.add(enterNum); // => local_Array.add.해서 enterNum값 받기.
			}
		}

		return local_Array; // 로컬배열을 리턴받아준다.
	}

	public ArrayList<Integer> get_find_odd() {
		ArrayList<Integer> local_odd_Array = new ArrayList<>(); // 배열만들어주고

		int size = this.List.size();
		for (int i = 0; i < size; i++) {
			enterNum = List.get(i);

			if (enterNum % 2 == 0) {
				local_odd_Array.add(enterNum); // = > local_odd_Array.add해서
			} // 마찬가지로 enterNum해서
		}

		return local_odd_Array;
	}

	// L4 = > combine
	public void combineConst() {
		int size = this.List.size();
		for (int i = 0; i < size; i++) {
			enterNum = List.get(i);
			sum += enterNum; // 리스트 총 합계 sum 값~

			if (enterNum % 2 == 0) {
				odd_sum += List.get(i); // 아니이거 for문을 또 만들어야 하나
				odd_Array.add(enterNum);
			} else if (enterNum % 2 != 0) {
				even_sum += List.get(i);
				even_Array.add(enterNum); // 홀수~
			}
		}

		findDefalt(); // 디폴트 찾수 찾기 L5 => findDefalt
		findDefalt(1); // 어떻게 되냐면 저기로 값을 넣어주고 여기서 당장 실행
		findDefalt(2); // 실행 구문을 다 돌고 나온다음에 다음 줄 실행
		bigLength(odd_Array, even_Array); // L6 =>bigLength
		decisionLength(odd_Array, even_Array); // L7 =>decisionLength

		System.out.println("combineConst호출완료");
		System.out.println("");
	}

	// 디폴트 짝수 찾기
	public void findDefalt() {
		findDefalt(1);
	}

	public void findDefalt(int print_type) { // 홀수의 N개가 있다. > 아니 홀수와 짝수를 리스트로 받아줘야 댐
		String print_str;

		if (print_type == 1) {
			print_str = "짝수";
			System.out.println(even_Array + " : " + print_str);
		} else if (print_type == 2) {
			print_str = "홀수";
			System.out.println(odd_Array + " : " + print_str);
		}
	}

	public void bigLength(ArrayList<Integer> O_Array, ArrayList<Integer> E_Array) { // 문자열 비교하여 더 큰 데이터양 출력
		if (O_Array.equals(E_Array)) {
			System.out.println("홀수의 배열길이가 더 큽니다.");
		} else {
			System.out.println("짝수의 배열길이가 더 큽니다.");
		}
	}

	public void decisionLength(ArrayList<Integer> O_Array, ArrayList<Integer> E_Array) {// 홀수 혹은 짝수의 총 배열사이즈 값은 N 입니다.
		System.out.println("odd 사이즈 출력 확인 : " + O_Array.size()); // 홀짝 값
		System.out.println("even 사이즈 출력 확인 : " + E_Array.size());
	}

	public void allSum() { // L8 = > allSum
		System.out.println("리스트 총 합계 sum 값 :  " + sum);
		System.out.println("짝수 총 합계 odd_sum 값 :  " + odd_sum);
		System.out.println("홀수 총 합계 even_sum 값 :  " + even_sum);
	}

	public void compare() { // 홀수 총합 짝수 총합 비교, L9 = >compare
		if (odd_sum > even_sum) {
			System.out.println("짝수의 총 합이 더 큽니다.");
		} else {
			System.out.println("홀수의 총합이 더 큽니다.");
		}
	}

	public int getSum() {
		// this.sum = sum;
		// System.out.println("[sum]" + sum);
		return sum;
	} // getSum값 리턴으로 부르게 함.

	public void call_Name() { // int값을 홀짝으로 해서 홀수번 번입니다
		DataName dataName = new DataName();
		dataName.getKey();
		System.out.println("┌ <getKey - 번호데이터 받아주기> ┐");
		System.out.println(dataName.getKey());

	}

	// 해주고 싶은것 관리자 이름 + 숫자키 = 배열 만들어서 양수 음수 나눠서 => 음수 양수 따라서 사람찾기
	// 언제등록했는지도 적어주고싶음
	public void input_Name() { // 0을 치면 바로 빠져나가기
		ArrayList<DataName> List = new ArrayList<>(); // 리스트생성
		DataName dataName = new DataName();
		System.out.println("관리자 이름을 넣어주세요. 숫자를 입력하세요");
		boolean on = true;
		boolean off = false;
		String zero = "0";
		while (on) {
			String master_name = sc.next();
			if (master_name.equals(zero)) {
				on = off;
				break;
			}
			int number = sc.nextInt();
			System.out.println("<값전달 완료>");
			dataName.setData(master_name, number); // 값축척되게 수정하기
		}
		System.out.println("┌ ArrayRandom > dataName.getData 호출 ┐");
		System.out.println(dataName.getData());
	} // 실행

	public String ArrayName(String input_master_name) { // 이름만 전달
		DataName dataName = new DataName();
		dataName.setName(input_master_name);
		System.out.println("input_master_name > " + input_master_name);
		return input_master_name;
	}

	public void ArrayKey() { // 번호만 전달, 번호 안담김 DataName에서 가져와야함.
		//그냥 해쉬 맵을 통쨰로 들고와야하나. 아마 리스트 값을 여기로 넘겨줘서 받아서 해야할듯 
		//파라미터로하면 main에서 못부름 값을 받아야하는데 그 값을 받을 값이 없다.
		
		
		
	}
	
	public void odd_ArrayKey() { // 매개변수받지않고 호출 
		//아니그럼 hashmap의 값을 꺼내서 int return해서 저어쪽 findDefalt(int print_type)호출
		DataName Test = new DataName();
		System.out.println((Test.getKey())); 	//아니일단 해봐 값이 어디로 가는거니.. 물길이 어디니 왜 없니.. 왜 안해줘..
		System.out.println("출력");
		
	}

}