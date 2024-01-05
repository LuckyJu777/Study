package Test;

public class ArrayStudy2{
	public static void main(String[] args) {
		ArrayRandom dom2 = new ArrayRandom();
		dom2.L1();
		dom2.L2();
		dom2.L3();
		dom2.L();
	}
}
// 자 setter는 private 변수값을 변경하는 메서드
// getter는 private 변수값을 출력하는 메서드
// 자식 클래스의 객체변수 x를 뜻한다 => this. 자식클래스의 객체변수 x를 뜻하고 
// super 조상 클래스에 선언된 인스턴스 변수 x를 뜻한다. 
//내가 넣고 싶은 파라미터에 생성자 만들고 암것도 안해도 실행되고 실행시킬 수 있게 한다면 기본클래스
//거기 넣어주고 void해서 파라미터값을 받고 안에 this.set을 하면 
//set함수를 불러와서 실행시킨다. 그래서 함수하나 시켜놓고 리턴값 넣어주고
//this부르면 위에 