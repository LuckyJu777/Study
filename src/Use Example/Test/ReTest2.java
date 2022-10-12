package Test;

public class ReTest2{
	int varTest(int a) {
		a++;	//증감
		return a;	//리턴으로 a받아줌
	}
	
	public static void main(String[] args) {
		int a = 1;	//일단 a가 1이라고 해줌
		ReTest2 test = new ReTest2();	//생성자 만들음
		a = test.varTest(a);	//a는 클래스 생성자. varTest(a)는 위에 메소드 호출하고 a를 넣어준다는건지 받아준단건지
		System.out.println(a);	// 시스템은 a를 출력한다.
	}
}