package chap1;
public class ByteExample {
	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = -0;
		byte var4 = 30;
		byte var5 = 127;
		//byte var6 = 128; 컴파일에러
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
	}
}
/**
 실행 중 저장할 수 있는 값의 범위를 초과하면 최소값부터 다시 반복 저장, byte일 경우 -128부터 시작해서 127을 넘으면 다시 -128부터 시작한다.
 short,int,long 도 마찬가지이다. 초과 저장되면 쓰레기값이라고 한다.
**/