package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class ForEx {
	// 새로운 객체생성
	// 메소드 생성2
	public static ArrayList<ForEx2> forex2 = null;
	public Scanner sc = null;
	String name = null;
	String hobby = null;
	
	
	ForEx() {	//필요한것들?
		Scanner sc = new Scanner(System.in);
		forex2 = new ArrayList<ForEx2>();
	}
	
	public void ForEx1() {
		name = sc.next();	//name에 저장
		hobby = sc.next();	//hobby에 저장
		
		while (serVe(name)) {	//serVe에 name 을 넣어봄
			System.out.println("다른 문자열을 입력하세요"); //출력
			name = sc.next();		//다시입력
		}
		
		ForEx2 for2 = new ForEx2();
		for2.test1();
		for2.test2(name);
		for2.test3(name,hobby);
		forex2.add(for2);
	}
	
	public static boolean serVe(String name) {
		boolean flag = false;
			for(ForEx2 for2 : forex2) {
				for2.test2(name);
			}
		return flag;
	}
	
}


//생성자 객체 만들기
//객체 ForEx2에 값넣기
//ForEx2에 있는 값을 가져와서 대조 if for2.test2(name값).equals(name)) 문자열 비교 왜 안돼지
//get이랑 set은 private함수 호출할 때만 넣는것이 아니였나..?