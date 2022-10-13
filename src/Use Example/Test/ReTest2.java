package Test;

public class ReTest2 {
	/*
	 * int varTest(int a) { a++; //증감 return a; //리턴으로 a받아줌 }
	 * 
	 * public static void main(String[] args) { int a = 1; //일단 a가 1이라고 해줌 ReTest2
	 * test = new ReTest2(); //생성자 만들음 a = test.varTest(a); //a는 클래스 생성자.
	 * varTest(a)는 위에 메소드 호출하고 a를 넣어준다는건지 받아준단건지 System.out.println(a); // 시스템은 a를
	 * 출력한다. }
	 */

	public static void Name() {
		int i = 2;
		if (i < 3) {
			System.out.println("2보다1이 더 클경우도 있나");
		} else if (i == 10) {
			System.out.println("1보다 2가 클경우");
		} else {
			System.out.println("넌 왜 이걸 이해를 못하니");
		}
	}


	public static void main(String[] args) {
		System.out.println("Line");
		Name();
		System.out.println("Line2");
	}
}