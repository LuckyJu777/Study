package chap1;
public class LongExample{
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 1000000000000000; //complie error The literal 1000000000000000 of type int is out of range =int타입의 저장 범위를 넘어서는 정수 리터럴에 L을 붙이지 않아서.
		long var4 = 1000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}

/**
 실수타입 float, double
 실수타입은 소숫점을 저장할 수 있다. 메모리 사용 크기에 따라 float과 double이 있다.
 실수타입	float 	double
 바이트 수   4       8
 **/

