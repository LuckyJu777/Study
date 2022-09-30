package chap1;
public class SignOperator{
	public static void main(String[] args) {
		//단항연산자 > 부호연산자 boolean, char타입을 제외한 나머지 기본 타입에 사용할 수 있다.
		//일반적으로 부호 연산자를 다음과 같이 정수 및 실수 리터럴 앞에 붙여 양수 및 음수를 표현
		//부호연산자의 산출타입은 int
		//short 타입 값을 부호 연산 >>> int 타입 값으로 바뀐다.
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1= " + result1);
		System.out.println("result2= " + result2);
		
		short s = 100;
		//short result3 = -s; //컴파일 에러
		int result3 = -s;
		System.out.println("result3= " + result3);
		
	}
}