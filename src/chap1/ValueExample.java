package chap1;
/**
 변수는 초기화가 되어야 읽을 수 있다. 초기화 되지 않은 변수는 읽을 수 없다. 
 value선언 => value가 초기화가 되어야 함.
 **/
public class ValueExample {
	public static void main(String[] args) {
		//10을 변수 value의 초기값으로 저장
		int value = 10;
		
		//변수 vaule 값을 읽고 10을 더하는 산술 연산을 수행
		//연산의 결과값을 변수 result의 초기값으로 저장
		int result = value + 10;
		
		//변수 result 값을 읽고 콘솔에 출력
		System.out.println(result);
		
	}
}
