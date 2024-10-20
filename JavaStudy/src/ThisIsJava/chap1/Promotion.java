/**byte(1)<Short(2<int(4)<long(8)<lfoat(4)<double(8)
byte byteValue = 10;
int intValuee = byteValue; 자동타입변환이 일어난다.
int intValue = 200;
double doubleVaule = intvalue; //200.0
char 타입의 경우 int타입으로 자동 변환 되면 유니코드 값이 int타입에 저장.

byte byteValue = 65;
char charValue = byteVaule; (x) //컴파일 에러
char charData = (char)byteData; (o) //강제 타입 변환
**/

package chap1;
public class Promotion {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue; //int <-byte
		System.out.println(intValue);
		
		char charValue = '가';
		intValue =charValue;
		System.out.println("가의 유니코드 =" + intValue);
		
		intValue = 500;
		long longValue = intValue; //long <- int
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue; //double<-int
		System.out.println(doubleValue);
	}
}

