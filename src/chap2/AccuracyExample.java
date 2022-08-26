package chap2;
public class AccuracyExample{ //부동소수점 타입을 사용하지 않는다. 정확히 계산하려면 정수연산으로 변경해야한다.
	public static void main(String[] args) {
		int apple = 1;
//		double pieceUint = 0.1;
//		int number = 7;
//		double result = apple - number*pieceUint;

		int totalPieces = apple * 10;
		int number = 7;
		int temp = totalPieces - number;
		
		double result = temp/10.0;
		
		System.out.println("사과한개에서 0.7조각을 빼면, ");
		System.out.println(result + "조각이 남는다. ");
	
	}
}