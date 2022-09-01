package RouletteExample;	//이클립스 폴더와 깃허브폴더가 서로 다르기때문에 패키지 바꿔주기

import java.util.Random;
import java.util.Scanner;

	public class Gun{
	static Random random = new Random();	//랜덤으로 쏜다는 뜻인가용 
	static int bullet;	//총알 메소드 
	
	public static void main(String[] args) {
	Scanner scanuser = new Scanner(System.in);	//사용자가 키보드에서 친 매개변수 스캔
//	scanuser = in.next();	in.next는 또 대체 뭔지
	int num;	//유저가 적은 매개변수 객체를 만들어준다.
	//함수를 적을 때 순서가 있는지 궁금하다.
	////num을 만드는게 좀 헷깔린다. 
	//num은 if안에 들어가는 변수 
	//num = scanuser.nextInt(); 스캔유저의 스캐너안의 nextlnt메소드를 이용해 값을 저장 num을 저장.
	//nextInt()와 in.next()의 차이
	//num = scanuser.next(); 얘를 빼니까 돌아간다. 이게뭔 역할이지..?ㄴ
	
	int[] cylinder = { 0, 1, 2, 3, 4, 5 };			//실린더는 6개
	int count = cylinder.length-1;	//랜덤총알을 하는 기능이 while문을 돌 때 1번씩 차감하는 변수
	bullet = random.nextInt(cylinder.length); //불렛 = 랜덤.넥스트인트(실린더.배열길이)
	
	System.out.println("러시안 룰렛에 오신 것을 환 영 환 영~");
	
	while(true) {
		System.out.println("러시안 룰렛 한판 할래? 1.게임시작 2.게임 종료");
		num = scanuser.nextInt();
		if(num == 1) {
			System.out.println("게임시작");
			System.out.println("당신은 스스로 머리에 총구를 겨냥하고 있습니다. 🤤🔫");
			playRoulette(num, count, bullet, cylinder, scanuser);	//메소드하고 객체들
			break; //브레이크는 왜하는거지
		}else if (num <= 2) {
			System.out.println("넌 못지나간다.");
		} else {
			System.out.println("지나갈까말까 지나갈까 말까 못 지나간다.");
			continue;
		}
	}
}
	//void 함수의 반환(return) 값이 없다는 것을 의미, void 값 return이 없어도 오류가 나지 않음.
	public static void playRoulette(int num, int count, int bullet, int[] cylinder, Scanner scanuser) {
	int i = 0; //i가 0으로 기본값 만듦, 실린더에 들어가는 변수
	while(true) {
		if(count == 0) {	//if안에 들어가는 카운트는 뭔가 다른가 색깔이다른데
			System.out.println("첫 도전 1");
			break;
		}
		System.out.println("1.발사 2.그만");
		num = scanuser.nextInt();			//사용자입력값 = 키보드 스캔 인트값
		if(num == 1) {	//user가 1을 골랐을 때
			if(bullet == cylinder[i]) {
				System.out.println("사망");
				break;
			} else {
				count--;	//카운트 차감
				System.out.println("살아남았다.");
				i++;		//왜 변수가 증감되는거지
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
			System.out.println("1과 2만 누르세요");
			continue;
			}
		}
	}
}

