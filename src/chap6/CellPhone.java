/* 다중상속 허용하지 않는다.
 * class 자식클래스 extends 부모클래스 {
 * 필드
 * 생성자
 * 메소드
 */
package chap6;
public class CellPhone{	//부모클래스
	//필드
	String model;
	String color;
	
	//생성자
	
	//메소드
	void powerOn() {System.out.println("전원을 켭니다.");}
	void powerOff() {System.out.println("전원을 끕니다.");}
	void bell() {System.out.println("벨이 끕니다.");}
	void sendVoice(String message) {System.out.println("자기:" +message);}
	void receiveVoice(String message) {System.out.println("자기:" +message);}
	void hangUp() {System.out.println("전화를 끊습니다.");}
	}


