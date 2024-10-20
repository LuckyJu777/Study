package RouletteExample;

import java.util.Random;	//난수를 생성하는 클래스로 객체를 생성하고 사용함
import java.util.Scanner;	//사용자 키보드에서 입력값 받는 모듈

public class Roulette {
	static Random random = new Random();	//아 랜덤 총알
	static int bullet;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int[] cylinder = { 0, 1, 2, 3, 4, 5 };		//실린더 6개
		int count = cylinder.length-1;				//총알은 랜덤총알 실린더의 배열만큼
		bullet = random.nextInt(cylinder.length);	//불렛은 랜덤값.넥스트인트에 실린더 배열 연결?
		int num;					//num 객체 만들어주기 
		
		System.out.println("        |\\___________________,");
		System.out.println("       |    ===== _______)___) ==========|||)");
		System.out.println("      |	   ||----||");
		System.out.println("   __/___   ====/");
		System.out.println("  (O___)\\\\_(_/");
		System.out.println(" (O___)");
		System.out.println("(O___)");
		System.out.println("러시안 룰렛에 오신 것을 환영합니다.");
		while (true) {
			System.out.println("1.게임 시작     2.게임 종료");
			num = scan.nextInt();			//num 은 스캔 넥스트인트 배열과 주소참조..
			if (num == 1) {					//num사용자 값이 1
				System.out.println("★☆★☆★☆★게임을 시작하겠습니다★☆★☆★☆★");
				System.out.println("당신은 스스로 머리에 총을 겨냥하고 있습니다.");
				playRoulette(num, count, cylinder, scan);	//밑에 클래스 
				break;
			} else if (num == 2) {
				System.out.println("해보지도 않고.. 겁쟁이! 넌 못 나가!");
				continue;
			} else {
				System.out.println("1 또는 2를 눌러주세요");
				continue;
			}
		}
	}
	
	public static void playRoulette(int num, int count, int[] cylinder, Scanner scan) {
		int i = 0;
		int money = 20;
		
		while(true) {
			if(count == 0) {
				System.out.println("대단한 배짱이군요! 당신은 살아남으셨습니다! 획득 머니 : "+(double)money/10000+"억원");
				break;
			}
			System.out.println("1.발사   2.여기서 그만");
			num = scan.nextInt();		//사용자입력값 = 아까 위에 스캔 인트값 
			if (num == 1) {					//아니이게 어디서 랜덤이 된다는거야
				if(bullet == cylinder[i]) {		//불렛안에 실린더가 랜덤 
					System.out.println("빵! 사망하셨습니다.");
					break;				
				} else {
					count--;			//차감
					money *= 5;
					if(money >= 10000) {
						System.out.println("찰칵... lucky! 운이 좋으시군요. 남은 기회 : "+count+", 획득 머니 : "+(double)money/10000+"억원");
					}else {						
						System.out.println("찰칵... lucky! 운이 좋으시군요. 남은 기회 : "+count+", 획득 머니 : "+money+"만원");
					}
					i++;
				}
			} else if (num == 2) {
				if(i == 0) {
					System.out.println("들어온 이상 한 발은 쏴야합니다..😈");
					continue;
				}else {					
					System.out.println("잘 생각하셨습니다. 목숨은 소중하니까요. 획득 머니 : "+money+"만원");
					break;
				}
			} else {
				System.out.println("1 또는 2를 눌러주세요");
				continue;
			}
		}
	}
}