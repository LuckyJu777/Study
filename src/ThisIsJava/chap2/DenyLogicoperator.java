package chap2;
public class DenyLogicoperator{
	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.print(play);
		
		play = !play;
		System.out.print(play);
		//상태값이 스위치처럼 처음 상태로 유지되면서 !를 달면 스위칭되는 형식이다.
	}
}