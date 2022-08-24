package chap1;

public class IntTest {
	public static void main (String[] args ) {
	int x = 3;
	int y = 2;
	int result = x + y;
	
	int age; //정수값을 저장할 수 있는 age변수 선언
	double value; //실수double값을 저장할 수 있는 value 변수 선언
	/**
	 변수 명명 규칙은 다음과 같다 
	 1. 문자이거나 $,"_" 이어야 하고 숫자로 시작할 수 없다
	 2. 영어 대소문자 구분된다.
	 3. 첫문자는 영어 소문자, 첫문자를 대문자로 한다.
	 4. 문자 수(길이)의 제한없음.
	 5.자바 예약어는 사용할 수 없다.
	 **/
	int bird; //변수 선언
	bird = 100; //변수 값 저장
	
	/**
	 리터럴은 상수constant와 같은 의미,
	 프로그램에서는 상수를 "값을 한번 저장하면 변경할 수 없는 변수" 로 정의, 이와 구분하기 위해 리터럴 사용
	 **/
	System.out.println(result);
	}	
}
