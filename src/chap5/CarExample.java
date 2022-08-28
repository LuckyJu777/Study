package chap5;
public class CarExample{
	public static void main(String[] args) {
		//객체 생성
		Car myCar = new Car(); // Car.java참조 객체 생성
		
		//필드값 생성
		System.out.println("제작회사: " +myCar.company);
		System.out.println("모델명: " +myCar.model);
		System.out.println("색깔: " +myCar.color);
		System.out.println("최고속도: " +myCar.maxSpeed);
		System.out.println("현재속도: " +myCar.speed);
		
		//필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도: " +myCar.speed);
	}
}