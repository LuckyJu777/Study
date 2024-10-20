package Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class ReTest {
	public static void main(String[] args) {
		ReTest test = new ReTest();	//메인 클래스 객체 만들고
		test.testMethod(300);	//객체변수이름.파라미터넣고싶은 메소드 ( 파라미터) ;
	
		ReTest2 rt = new ReTest2();
		
	}
	
	public void testMethod(int age) { //메소드 만들고 파라미터로 이거 받아여~ 공고
		System.out.println("당신의 나이는" + age + "세 입니다.");	//당신의 나이는 ~세
	}
	
	//재귀메서드 Test - recursive call
	public void method(int n) { //1이 될때까지 숫자를 줄여나가면서 곱하기
		if(n == 0)
			return;
		System.out.print(n);
		
		method(--n);
	}
	
	@Target({ElementType.METHOD})		//Target은 메소드에만 적용 @Retention은 런타임까지 어노테이션 정보를 유지하도록
	@Retention(RetentionPolicy.RUNTIME)	//Retention은 런터임시까지 어노테이션정보를 유지하도록 
	public @interface PrintA{	//기본엘리먼트는 value는 구분석ㄴ에 사용될 문자 number는 반복횟수이다. 
		String value() default "-";		//디폴트값으로 - 15 를 주었다. 
		int number() default 15;
	}										//
	//클래스 메서드 , 인스턴스 메서드
	//클래스를 정의 할 때 어떤 경우에 static을 사용해서 정의해야할까
	//객체 매서드는 인스턴스 변수와 관련된 작업을 하는 메서드의 작업을 수행하는데 인스턴스 변수를 필요로 하는 메서드
	//인스턴스 변수는 인스턴스를 생성해야만 만들어지므로 클래스 메서드 static메서드로 정의	
}