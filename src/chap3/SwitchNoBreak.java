package chap3; //break가 없는 Switch
public class SwitchNoBreak{
	public static void main(String[] args) {
		int time = (int)(Math.random()*4) + 8; //8~11사이 정수 뽑기
		System.out.println("현재시간: " + time);
		
		switch(time){
		case 8 : 
			System.out.println("회의시간");
		case 9 :
			System.out.println("식사시간");
		case 10 :
			System.out.println("퇴근시간");
		case 11:
			System.out.println("야근시간");
		}
	}
}