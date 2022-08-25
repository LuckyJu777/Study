/**
byte타입으로 변환하기 전에 변환될 값이 byte 타입으로 변환된 후에도 값의 손실이 발생하지 않는지 검사해서 올바른 타입변환
**/
package chap1;
public class CheckValue{
	public static void main(String[] args) {
		int i = 128;
		
		if( (i<Byte.MIN_VALUE)|| (i>Byte.MAX_VALUE) ) {
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해 주세요");
		}else {
			byte b = (byte) i;
			System.out.println(b);
		}
	}
}