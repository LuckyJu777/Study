package chap2; //비트반전연산자
public class BitReverseOperator{
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1; //10 비트를 반전
		int v3 = ~v1 + 1; // 반전한걸 + 1
		System.out.println(toBinaryString(v1) + "(십진수: " + v1 + ")");
		System.out.println(toBinaryString(v2) + "(십진수: " + v2 + ")");
		System.out.println(toBinaryString(v3) + "(십진수: " + v3 + ")");
		System.out.println();
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4 + 2;
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}
}