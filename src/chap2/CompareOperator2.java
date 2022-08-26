package chap2;
public class CompareOperator2 {
	public static void main(String[] args) { //접근제어자 반환타입 메소드이름(매개변수목록) { : 선언부
		int v2 = 1;							 // : 구현부 }
		double v3 = 1.0;
		System.out.println(v2 == v3); //true
		
		double v4 = 0.1;
		float v5 = 0.1f; //정수형 L 실수형 F
		System.out.println(v4 == v5); //false
		System.out.println((float)v4 == v5); //true
		System.out.println((int)(v4*10) == (int)(v5*10)); //true
	}
}