public class Service{
	@PrintAnnotation
	public void method1() {
		System.out.println("실행내용1");
	}
	
	@PrintAnnotation("*")
	public void method2() {
		System.out.print("실행내용2");
	}
	
	@PrintAnnotation(value="#", number=20)
	public void method3() {
		System.out.println("실행내용3");
	}
}

//PrintAnnotation 적용한 service 클래스