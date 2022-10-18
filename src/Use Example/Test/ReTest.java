package Test;

public class ReTest {
	public static void main(String[] args) {
		ReTest test = new ReTest();	//메인 클래스 객체 만들고
		test.testMethod(300);	//객체변수이름.파라미터넣고싶은 메소드 ( 파라미터) ;
	
		ReTest2 rt = new ReTest2();
		
	}
	
	public void testMethod(int age) { //메소드 만들고 파라미터로 이거 받아여~ 공고
		System.out.println("당신의 나이는" + age + "세 입니다.");	//당신의 나이는 ~세
	}
	
	public void returning_Test() {
	}
	

}		