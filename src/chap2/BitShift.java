package chap2;
public class BitShift{
	public static void main(String[] args) {	// 이진수가 밀린다
		System.out.println("1 << 3 =" + (1<<3));
		System.out.println("-8 >> 3 =" +(-8>>3)); //정수 a를 각 비트를 b만큼 오른쪽으로 이동
		System.out.println("-2 >>> 3 =" +(-8>>>3)); //정수 a의 각 비트를 b만큼 오른쪽으로 이동 
	}
}