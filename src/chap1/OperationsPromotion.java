package chap1;
/**
연산은 기본적으로 같은 타입의 피연산자간의 연결만 수행된다.  서로 다른 타입의 피연산자가 있을 경우 두 피연산자 중 크기가 큰 타입으로 자동 변환된 후 연산을 수행
(ex) int double => double 로 연산. 연산의 결과는 double이 된다.
int intValue = 10;
double doubleValue = 5.5;
double result = intValue + doubleValue; >>> result에 15.5가 저장된다.
int intValue = 10;
double doubleValue = 5.5;
int result = intValue + (int)doubleValue; //result에 15가 저장
int result = byte,char,short,int 연산의 결과도 int 타입이 된다.
**/
public class OperationsPromotion{
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byeValue1 + byteValue2; //컴파일 에러
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = '1';
		int intValue2 = charValue1 +charValue2;
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력코드=" + (char)intValue2); 	//타입변환은 클래스 상속으로 넘어가면 클래스도 부모 자식 두고 변환을 많이 한다.
		
		int intValue3 = 10;									//평균 구하는 계산을 할 때 int를 double로 자동변환 > 소숫점단위	
		int intValue4 = intValue3/4; 
		System.out.println(intValue4);
		
		int intValue5 = 10;
//		int intValue6 = 10 / 4.0;	
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
	}															
}