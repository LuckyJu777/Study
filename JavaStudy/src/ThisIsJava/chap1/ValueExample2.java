package chap1;
public class ValueExample2 {
	public static void main(String[] args) {
		int v1 = 15; //메소드에서 블록선언
		if(v1>10) {
			int v2 = v1 -10;
		}
//		int v3 = 1 + v2 + 5; //v2 변수를 사용할 수 없기 떄문에 컴파일 에러가 생김
	}
}

/**
 n이 메모리 사용 크기(bit수)
 int 타입의 경우 4byte(32bit)이므로 -2^31,~2^31-1 값의 범위를 가진다. 실수타입일 경우 가수와 지수 부분에 사용되는 bit의 크기에 따라 결정된다.
 실수타입을 설명할 때 재진행.
 정수타입
 : byte char short int long
 	1    2     3    4   5
**/