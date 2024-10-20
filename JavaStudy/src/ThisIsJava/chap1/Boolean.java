package chap1; //논리타입 두가지 상태값을 저장할 필요성이 있을 경우 사용, 상태값에 따라 조건문과 제어문의 실행 흐름을 변경하는데 주로 이용 
public class Boolean {	//stop 변수에 false가 저장되어 있다면 else블록이 실행되어 "시작합니다"를 출력 
	public static void main(String[] args) {	// stop변수에 값을 변경해보면서 출력을 확인해보기를 바란다.
		boolean stop = true;
		if(false) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.!");
		}
	}
}