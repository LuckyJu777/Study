package Test;

import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListData{
	private ArrayList<Integer> A_List = new ArrayList<>();
	private int Enter1;
	private int Enter2;
	
	ArrayListData(){
	//얘네는 여기 안에 넣어두면 그냥 호출이 되버린다.
	}
	
	void ArrayListData_Enter1(int Eneter1){
		this.setinput_N(Eneter1);
	}
	void ArrayListData_Enter2(int Enter2){
		this.setinput_N_List(Enter2);
	}

	public int getinput_N() {	
		System.out.println("input_Number 입력값 : > " + Enter1);
		return Enter1;
	}
	
	public ArrayList<Integer> getinput_N_List() {	//리스트 입력값 반환
		System.out.println("getinput_N_List 입력값 :  > " + A_List);
		return A_List;	//리스트 뽑기
	}
	
	
	public void get_even_List() {
		System.out.println("get_even_List 입력값 :  > " );
	}
	
	
	public void setinput_N(int Enter1) {
		this.Enter1 = Enter1;
		System.out.println("setinput_N 입력값 : " + Enter1);
	}
	
	public void setinput_N_List(int Enter2) {
		this.Enter2 = Enter2;
//		System.out.println("setMain2 랜덤 값 > " + Enter2);	//출력확인
		A_List.add(Enter2);
//		System.out.println("setMain2 리스트 값 > " + A_List.toString());	//출력확인
	}
	
	public void set_even_List(ArrayList<Integer> N_Array, int print_type) {
		String print_str;
		
		if (print_type == 1) {
			print_str = "짝수";
			System.out.println(N_Array + " : " + print_str);	//출력값
		} else if (print_type == 2) {
			print_str = "홀수";
			System.out.println(N_Array + " : " + print_str);	//출력값
		}
	}

//	int size = ;	
//	for (int i = 0; i < size; i++) {
//		int sum = //리스트 사이즈 아니고 getter
//		int num1;
//		sum += num1; // 리스트 총 합계 sum 값~
//		if (num1 % 2 == 0) {
//			odd_sum += List.get(i); // 아니이거 for문을 또 만들어야 하나
//			odd_Array.add(num1);	//뭐래???
//		} else if (num1 % 2 != 0) {
//			even_sum += List.get(i);
//			even_Array.add(num1); // 홀수~
//		}	
}