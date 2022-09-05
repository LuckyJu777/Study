public class TryCatchFinallyRuntimeException{
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];
			data2 = args[1];
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매기값의 수가 부족합니다.");
			System.out.println("[실행방법]");
			System.out.println("Java TryCatchFinallyRuntimeExceptionExample num1 num2");
			return;
		}
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}finally {
			System.out.println("다시 실행하세요.");
		}
	}
}

/*이클립스 예제 6라인에서 ArrayIndexOutOfBoundsException이 발생하는데, 이것은 실행 매개값을 주지 않았기 때문이다. 6라인에서 예외가 
 *발생되면 9~12랑니을 실행해서 예외 처리 한다.
 *스레드 "main" java.lang.Error의 예외: 해결되지 않은 컴파일 문제:
 *ArrayIndexOutOfBoundsException 유형의 예외는 throw될 수 없습니다. 예외 유형은 Throwable의 하위 클래스여야 합니다.
 *TryCatchFinallyRuntimeException.main(TryCatchFinallyRuntimeException.java:8)에서
*/