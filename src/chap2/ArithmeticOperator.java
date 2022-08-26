package chap2;
public class ArithmeticOperator{
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1=" +result1);
		
		int result2 = v1 - v2;
		System.out.println("result2=" +result2);
		
		int result3 = v1 / v2;
		System.out.println("result3=" +result3);
		
		double result4 = (double) v1 / v2; //(double)이 있기 떄문에 앞에 int가 아닌 double!
		System.out.println("result4=" +result4);
		
		//char타입도 정수타입이여서 가능하다.
		char c1 = 'A' + 1;
		char c2 = 'A';
		char c3 = (char)(c2 + 1);
		System.out.println("c1:" + c1);
		System.out.println("c2:" +c2);
		
	}
}