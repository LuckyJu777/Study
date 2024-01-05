package Test;

//import java.util.ArrayList;

public class ArrayStudy {
	public static void main(String[] args) {
		ArrayRandom Masterkey = new ArrayRandom();
		Masterkey.input_Name();
		
		DataName Test0 = new DataName();
//		Test0.timeStamp();
		Test0.setArrayKey();
		
		DataName nt = new DataName();
//		nt.print(null, null);
		System.out.println("잠와요");
	}
}

//내가 가지고 있는 함수는 
//inputNumber = 랜덤생성 배열입력
//inputRandom = 배열에 랜덤값을 넣어줌
//get_find_num_list = even_list 해서  홀수배열 넣어주기 local_Array
//get_find_odd = local_odd_Array로 해서 뭐 .. 뭐넣어주지 위에꺼랑 find_type다름.
//conbineConst = 리스트 총 합계 sum 값! findDefalt,bigLength,decisionLength 로 값을 뿌려줌
//findDefalt = 1값을 넣어줘서 , findDefalt값으로 1로 넣어줌
//bigLength = 배열길이 비교해서 홀수의 배열길이 짝수의 배열길이 더 큰것 비교
//decisionLength = 사이즈 출력확인
//allsum = 리스트 총 합계 sum, odd_sum, even_sum값 출력
//compare = 짝수의 총 합이 더 크다.
//getSum = sum 값 리턴
//call_Name = 리턴할 때 무언가 함수기능 추가해서 넣어주거나 받아올떄 무슨 장치같은걸 만든 다음 꼬아서 받아와보기
//input_Name = 관리자이름 숫자키 받아오는 함수 데이터


//ArrayRandom ArrayRandom_A = new ArrayRandom();
//ArrayRandom_A.inputNumber();
//ArrayRandom_A.get_find_odd();
//
//int sum3 = ArrayRandom_A.getSum();	//getsum의 sum리턴값 불러와서
//System.out.println("sum3 = " + sum3);
//
//ArrayRandom ArrayRandom_B = new ArrayRandom();	//새생성자
//int sum1 = ArrayRandom_B.getSum();	//새생성자를 해서 getSum을 불러오면 안볼러와진다..
//int sum2 = ArrayRandom_B.getSum();	//왜?
//
//System.out.println("sum1 = " + sum1);	//sum1
//System.out.println("sum2 = " + sum2);
//
//ArrayRandom ArrayRandom_C = new ArrayRandom();
//ArrayRandom_C.call_Name();



//N개의 수를 입력받아서 리스트에 랜덤 함수를 이용해서 담는다.
//화면에 리스트로 출력 받기!
//띄워주기!
//홀수의 N개가 있습니다
//홀수의 합은 N개 입니다
//짝수 N개가 있습니다.
//짝수의 합은 n입니다
//짝수 or 홀수가 더 큽니다
//총 수의 합은 N입니다..

// static memory상 저장
// 모든 클래스의 변수가 참조
//N개의 수를 입력받아서 리스트에 랜덤 함수를 이용해서 담는다.
//화면에 리스트로 출력 받기!
//띄워주기!
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


//자 setter는 private 변수값을 변경하는 메서드
//getter는 private 변수값을 출력하는 메서드
//자식 클래스의 객체변수 x를 뜻한다 => this. 자식클래스의 객체변수 x를 뜻하고 
//super 조상 클래스에 선언된 인스턴스 변수 x를 뜻한다. 
//내가 넣고 싶은 파라미터에 생성자 만들고 암것도 안해도 실행되고 실행시킬 수 있게 한다면 기본클래스
//거기 넣어주고 void해서 파라미터값을 받고 안에 this.set을 하면 
//set함수를 불러와서 실행시킨다. 그래서 함수하나 시켜놓고 리턴값 넣어주고
//this부르면 위에 