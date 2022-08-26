package chap2;
public class CheckOverflow{		//산술연산 전 오버플로우를 탐지
	public static void main(String[] args) {
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없다.");
		}
	}
	//safeAdd는 메소드 두개 매개값을 산술연산하기 전에 어떤 범우의 값인지 조사해서 연산 시에 오버플로가 발생하면
	//14, 18라인에서 예외 발생 > 오버플로가 발생하여 정확하게 계산할 수 없다.
	public static int safeAdd(int left, int right) {
		if((right>0)) {
			if(left>(Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("오버플로 발생");
			}
		}else{
			if(left<(Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("오버플로 발생");
			}
		}
		return left + right;
	}
}