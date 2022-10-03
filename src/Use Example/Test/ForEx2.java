package Test;
public class ForEx2{
	String name;
	String hobby;
	int AA = 1;
	int BB = 2;
	
	void test1() {
		System.out.println("1번");
	}
	void test2(String name) {
		this.name = name;
		System.out.println("이름 : " + name);
	}
	void test3(String name, String hobby) {
		this.name = name;
		this.hobby = hobby;
		System.out.println("이름 취미 : " + name +"\t"+ hobby);
	}
}