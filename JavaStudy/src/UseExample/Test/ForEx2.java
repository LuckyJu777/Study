package Test;
public class ForEx2{
	private String name;
	private String hobby;
	
	void test1() {
		System.out.println("테스트1메소드 호출");
	}
	void test2(String name) {
		this.name = name;
		System.out.println("테스트2메소드 호출 / 이름 : " + name);
	}
	void test3(String name, String hobby) {
		this.name = name;
		this.hobby = hobby;
		System.out.println("태스트3메소드 호출 / 이름 취미 : " + name +"\t"+ hobby);
	}
}
//main에서 값을 받지않으려면 여기서 다 받아야?