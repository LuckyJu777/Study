public class NumverFormatException{
	public static void main(String[] args) {
	String data1 = "100";	//문자열은 수사로 변환이 가능하기 때문에 6라인이 정상적으로 실행되지만 
	String data2 = "a100";	//data2변수의 "a100" 문자열은 숫자로 변환할 수 없기 때문에 다음과 같이 numberFormatException이 발생한다.
	
	int Value1 = Integer.parseInt(data1);
	int value2 = Integer.parseInt(data2); //NumberFormatException 발생
	
	int result = value1 +value2;
	System.out.println(data1 + "+" + data2 + "=" + result);
	}
}

/*문자열을 숫자열으로 변환하는 방법은 여러가지가 있다.
 *Integer.parseInt(String s) 주어진 문자열을 정수로 변환해서 리턴
 *Double.parseDouble(String s) 주어진 문자열을 실수로 변환해서 리턴
*/이 메소드들은 매개값인 문자열이 숫자로 변환 될 수 있다면 숫자를 리턴하지만, 숫자로 변환될 수 없는 문자가 포함되어 있다면 java.lang.NumberFomatException 발생
