/**작은크기의 타입 = (작은 크기 타입) 큰 크기 타입 
    (강제타입변환)_____________________|
사용자로부터 입력받은 값을 변환할 때 값의 손실이 발생하면 안된다.
강제 타입변환을 하기 전에 우선 안전하게 값이 보존될 수 있는지 검사하는것이 좋다.
**/

package chap1;
public class Casting {
	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
	}
}