package Test;

import Test.ArrayKid.Inter;

final class ArrayStr {
//	public interface 하위인터 extends 상위1 상위 2{
//		하위인터 변수 = new 구현클래스 ();
//	soundable 인터페이스 sound() 추상메소드 , 소리르 ㄹ리턴한다.
	public interface Soundable {
		default void Sound() {
			System.out.println("객체의 소리를 리턴합니다");
		}
		String sound();
		default void Cat() {
			System.out.println("catSound를 실행합니다. <냐옹>");
			
		}
		default void Dog() {
			System.out.println("dogSound를 실행합니다. <멍멍>");
		}
	}
	
//soundableExample 클래스 	
	
	class Dog implements Soundable {
	
		@Override
		public String sound() {
			return "야옹";
		}
	}
	
	class Cat implements Soundable {
		
		@Override
		public String sound() {
			return "멍멍";
		}
	}
	public interface A {
		public void mehtodA();
	}

	public interface B {
		public void methodB();
	}
}
	// 하위 인턴 구현

class A implements B {
	public void A() {
		System.out.println("A실행");
	}

	public void B() {
		System.out.println("B 실행");
	}

	public void C() {
		System.out.println("C 실행");
	}
}