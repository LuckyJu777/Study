package chap2;
public class Overflow{
/**
	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z);
	} 	범위초과 하여 쓰레기값을 얻게 된다. x,y중 long정수타입을 가져야 올바른 값을 얻을 수 있다.
}		변수의 z가 long타입이여야한다.
**/

public static void main(String[] args) {
	int x = 1000000;
	long y = 1000000;	//long이여도 괜찮다.
	long z = x * y;
	System.out.println(z); 
} 	
}		

