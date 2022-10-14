package Test;

import java.util.ArrayList;

//import java.util.ArrayList;

public class ArrayStudy {
	public static void main(String[] args) {

		ArrayRandom ArrayRandom = new ArrayRandom();
		ArrayRandom.constructor_maker();
		ArrayRandom.input_Number();
		ArrayRandom.input_RandomNum();
	}
}
////N개의 수를 입력받아서 리스트에 랜덤 함수를 이용해서 담는다.
////화면에 리스트로 출력 받기!
////띄워주기!
////홀수의 N개가 있습니다
////홀수의 합은 N개 입니다
////짝수 N개가 있습니다.
////짝수의 합은 n입니다
////짝수 or 홀수가 더 큽니다
////총 수의 합은 N입니다.

//		
//		System.out.println("리스트를 넘겨서 출력하기");
//		ArrayList<Integer> even_list = new ArrayList<>();
//		dom1.get_find_num_list(0 , even_list);
//		
//		for(Integer n_num : even_list) {
//			System.out.println(n_num);
//		}
//		
//		System.out.println("리스트를 넘겨서 출력하기");
//		ArrayList<Integer> even_list2 = new ArrayList<>();
//		ArrayList<Integer> even_list3 = dom1.get_find_num_list(0 , even_list2);
//		
//		System.out.println("파라메타로 넘긴 데이타 확인");
//		for(Integer n_num : even_list2) {
//			System.out.println(n_num);
//		}
//		
//		System.out.println("파라메타로 넘긴 결과값 확인");
//		for(Integer n_num : even_list3) {
//			System.out.println(n_num);
//		}
//		
//		/*
//		int sum3 = dom1.getSum();
//		System.out.println("sum3 = " + sum3);
//		
//		ArrayNandom dom2 = new ArrayNandom();
//
//		int sum2 = dom1.getSum();
//		int sum1 = dom2.getSum();
//		System.out.println("sum1 = " + sum1);
//		System.out.println("sum2 = " + sum2);
//		*/
// static memory상 저장
// 모든 클래스의 변수가 참조
//N개의 수를 입력받아서 리스트에 랜덤 함수를 이용해서 담는다.
//화면에 리스트로 출력 받기!
//띄워주기!
//
//홀수의 N개가 있습니다
//홀수의 합은 N개 입니다
//짝수 N개가 있습니다.
//짝수의 합은 n입니다
//짝수 or 홀수가 더 큽니다
//총 수의 합은 N입니다.

// 자 문제가 머냐 L4를 호출이 안돼 파라미터 값을 넣어주면 메인에 들어오지 않는데
// 메인에 안넣어주면 호출이 안되고 옹 호출할려면 생성자에 변수.메소드(); 해서 호출
// 생성자 없이 그냥 메소드(); 이거는 걍 값 넣어주기 하는건가
// 쩃든 문제는 L4를 해야하는데 호출이 안댕
// L5메소드에서 생성자를 만들어서 L3호출 시도
// 안됨 왜 안대지 , 아니 리턴만들어서 값 넘기는거 잘 못하겠어
// System.out.println()
// 또 꺠달은거 매개값을 받는 함수는 호출을 하면 꼬여버린다! 0값을 또 받고
// null 값을 또 받기떄문에 , 아무리 0 이랑 null을 넣어줘도 1번 실행되는것이 아니라
// 그 값까지 받아서 2번 실행되는것이기 떄문!
// 그리고 너무 좋은 꿀팁 실행흐름을 모르는것이기 떄문에 어디서 삐꾸났는지 모르는것
// 흐름을 파악하기 위해선 어느부분에서 출력을 해줘라!
// 위에 붙일수도 있다!1을 떼서 1에 붙여서 넣어주고 또 1넣어주고 1>2>3 으로 가지수가 나뉠수 있다