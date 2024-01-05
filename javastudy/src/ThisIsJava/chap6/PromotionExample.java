package chap6;
class A{}

class B extends A{}
class C extends A{}

class D extends B{}
class E extends C{}

public class PromotionExample{
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
	}
}

//부모타ㅣㅂ으로 자동 타입 변환된 이후에는 부모 클래스에 선언된 필드와 메소드만 접근이 가능하다.
//예외적으로 오버라이딩 되었다면 자식 클래스의 메소드가 대신 호출 
//다형성 과 관련 