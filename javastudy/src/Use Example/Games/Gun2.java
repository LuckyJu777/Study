package RouletteExample;

import java.util.Random;
import java.util.Scanner;

	public class Gun2{
	static Random random = new Random();										//범위 사이에 임의의 숫자를 생성하는 데 사용한다.
	static int bullet;	
	
	public static void main(String[] args) {
	Scanner scanuser = new Scanner(System.in);									//사용자로부터 시스템 키를 입력받기위해 (System.in)을 사용한다.
	int num;	
	
	int[] cylinder = { 0, 1, 2, 3, 4, 5 };			
	int count = cylinder.length-1;					
	bullet = random.nextInt(cylinder.length); 
	
	System.out.println("러시안 룰렛에 오신 것을 환 영 환 영~");
	
	while(true) {
		System.out.println("러시안 룰렛 한판 할래? 1.게임시작 2.게임 종료");
		num = scanuser.nextInt();												//scanuser로 입력받은 값을 int로 반환.
		if(num == 1) {
			System.out.println("게임시작");
			System.out.println("당신은 스스로 머리에 총구를 겨냥하고 있습니다. 🤤🔫");
			playRoulette(num, count, bullet, cylinder, scanuser);				//num 사용자 입력값, 
			break;																//count 6번의 기회
		}else if (num <= 2) {													//bullet 총알
			System.out.println("넌 못지나간다.");									//cylinder 실린더
		} else {																//scanuer 사용자로부터 입력받은 값
			System.out.println("지나갈까말까 지나갈까 말까 못 지나간다.");
			continue;
		}
	}
} 
	
	public static void playRoulette(int num, int count, int bullet, int[] cylinder, Scanner scanuser) {
	int i = 0;
	
	while(true) {	 
		if(count == 0) {	
			System.out.println("당신은 살아남으셨습니다. You Win!");					//최종적으로 살아남았을 때
			break;
		}
		System.out.println("1.발사 2.그만");
		num = scanuser.nextInt();			
		if(num == 1) {		
			if(bullet == cylinder[i]) {											//실린더가 1이 되고 불렛이 정수 2로 들어왔을 때 사망한다.
				System.out.println("사망");										//실린더와 총알이 일치했을 때 
				break;
			} else {
				count--;	
				System.out.println("살아남았다.");
				i++;		
			}
		}else if (num == 2) {													//사용자가 2를 눌렀을 때
			if(i == 0) { 														
				System.out.println("런~");
				break;
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

