//정수 타입을 실수 타입으로 변환할 떄 정밀도 손실을 피한다.
package chap1;
public class FromIntToFloat{
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
//		float num3 = num2;  		//int값을 손실없이 float 타입의 값으로 변환할 수 있으려면 가수 23비트로 표현 가능한 값이여야한다. 23비트로 표현할 수 없기 때문에 근사치로 변환
		double num3 = num2;
		num2 = (int)num3;			//정밀도 손실 . float > int 로 변환시켜면 원래의 int값을 얻지 못한다. 모든 int값을 실수 타입으로 안전하게 변환시키는 double 타입을 사용.
		float result = num1 - num2;	//double타입은 비트 수가 할당되어 있다.
		System.out.println(result);
	}
}
