package chap5;	//메소드 호출
public class CalculatorExample{
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5,6);
		System.out.println("result1: " +result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2: " +result2);
		myCalc.powerOff();
	}
}

/**
	외부 클래스에서 calculator 클래스의 메소드를 호출
	Calculator myCalc = new Calculator(); 를 생성
	참조변수 myCalc를 이용
	myCalc 변수에 도트(.)와 함께 메소드이름(매개값, ...) 형태로 호출 메소드 블록 생성
**/