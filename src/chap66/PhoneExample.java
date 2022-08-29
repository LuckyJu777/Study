package chap66;
public class PhoneExample {
	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("홍길동");
		smartPhone.turnOn(); //phone의 메소드
		smartPhone.internetSearch();
		smartPhone.turnOff(); //phone의 메소드
	}
}