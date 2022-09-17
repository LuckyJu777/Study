package how;
public class Computer extends ReOverride {
	@ReOverride							//@ReOverride는 어노테이션은 생략해도 좋으나 붙여주게 되면 ㅁㄱㄷㅁCircle()  메소드가 정확히 오버라이딩 것인지 컴파일러 ㅔㅊ크
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r; 		//Mathk클래스는 자바표준 APi제공
	}
}