package RouletteExample;

import java.util.Random;
import java.util.Scanner;

public class Gun{
	static Random random = new Random();	//랜덤으로 쏜다는 뜻인가용 
	static int bullet;	//총알 메소드 
	
	public static void main(String[] args) {
	Scanner scanuser = new Scanner(System.in);	//사용자가 키보드에서 친 매개변수 스캔
//	String user = in.next();				//user 이 배열을 읽어서 넣어주는건가..?
	int num;	//유저가 적은 매개변수 객체를 만들어준다.
	num = scanuser.nextInt();	//num은 스캔유저에.nextInt안에 값을 입력해요 int형 정수를 입력받는 메서드
	
	
	int[] cylinder = {0,1,2,3,4,5};			//실린더는 5개
	int count = cylinder.length-1;	//랜덤총알을 하는 기능이 while문을 돌 때 1번씩 차감하는 변수
	bullet = random.nextInt(cylinder.length); //불렛 = 랜덤.넥스트인트가(실린더.배열길이)
	
	while(true) {
		System.out.println("러시안 룰렛 한판 할래?");
		num = scanuser.nextInt();
		if(num == 1) {
			System.out.println("게임시작");
			System.out.println("당신은 스스로 머리에 총구를 겨냥하고 있습니다.");
			playRoulette(num, count, bullet, cylinder);	//메소드하고 객체들
			break; //브레이크는 왜하는거지
		}else if (num <= 2) {
			System.out.println("넌 못지나간다.");
		} else {
			System.out.println("지나갈까말까 지나갈까 말까 지 지 지 지 못지 나 가~");
			continue;
		}
	}
}
	

	static void playRoulette(int num, int count, int bullet, int[] cylinder) {
	int i = 0; //i가 0으로 기본값 만듦, 실린더에 들어가는 변수
	while(true) {
		if(count == 0) {	//if안에 들어가는 카운트는 뭔가 다른가 색깔이다른데
			System.out.println("첫 도전 1");
			break;
		}
		System.out.println("1.발사 2.그만");
		if(num == 1) {	//user가 1을 골랐을 때
			if(bullet == cylinder[i]) {
				System.out.println("사망");
				break;
			} else {
				count--;	//카운트 차감
				System.out.println("살아남았다.");
			}
		}else if (num == 2) {	//2를 선택했을 때
			if(i == 0) { //실린더가 0일때
				System.out.println("런~");
				continue;
			}else {
				System.out.println("런~~");
				break;
			}			
		}else {
			System.out.println("1,2만 누르세요");
			continue;
		}
	}
}
}


//하루종일 헤맸던 내용 전체 다 실장님이 공부하라고 주신 책 첫페이지부터 좔좔 있던걸 본 사람의 마음을 서술하시오.
//것도 소복히 내용 ㄷㅏ 잘짜져있어서.. 억장 와르르인간 되버림무 무무 무무무뭉무우루루울울ㅇ뭉ㄹ
