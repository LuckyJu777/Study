package Test;

import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListData{
	private ArrayList<Integer> A_List = new ArrayList<>();
	private int enterNum;
	private int enterList;
	
	ArrayListData(){
	//얘네는 여기 안에 넣어두면 그냥 호출이 되버린다.
	}
	
	public void ArrayListData_Enter(int enterNum){
		this.setinput_N(enterNum);
	}

	public int getinput_N() {		//배열 입력 갯수
		System.out.println("input_Number 출력값 : > " + enterNum);
		return enterNum;
	}
	
	public void setinput_N(int enterNum) {
		this.enterNum = enterNum;
		System.out.println("setinput_N 입력값 : " + enterNum);	//setinput_N입력값 출력됨 
	}
	
	public int getinput_NL() {		//배열 랜덤 데이터 값
		System.out.println("input_Number 출력값 : > " + enterList);
		return enterList;
	}
	
	public void setinput_NL(int enterList) {
		this.enterList = enterList;
		System.out.println("setinput_N 입력값 : " + enterList);	//setinput_N입력값 출력됨 
	}
	
	public ArrayList<Integer> getinput_N_List() { // 리스트 입력값 반환
		System.out.println("getinput_N_List, A_List 출력값 :  > " + A_List);
		return A_List; // 리스트 뽑기
	}
	//이거 두개 차이점을 모르겠음
	public void setinput_N_List (int enterNum) {
		this.A_List = A_List; // A_List 배열 받아서 this.A_List로 호출 후 배열 뽑아주기
		System.out.println("setinput_N_List 입력값 : > " + A_List);
	}

	public void geteven_List() {
		System.out.println("get_even_List 출력값 :  > ");
	}
}