
package RouletteExample;

import java.util.Random;
import java.util.Scanner;

	public class Try{
	static Random random = new Random();	
	static int bullet;	
	
	public static void main(String[] args) {
	Scanner scanuser = new Scanner(System.in);	
	int num;	
	
	int[] cylinder = { 0, 1, 2, 3, 4, 5 };			
	int count = cylinder.length-1;					//
	bullet = random.nextInt(cylinder.length); 
	System.out.println(count);

	System.out.println("러시안 룰렛에 오신 것을 환 영 환 영~");
	
	while(true) {
		System.out.println("러시안 룰렛 한판 할래? 1.게임시작 2.게임 종료");
		num = scanuser.nextInt();
		if(num == 1) {
			System.out.println("게임시작");
			System.out.println("당신은 스스로 머리에 총구를 겨냥하고 있습니다. 🤤🔫");
			playRoulette(num, count, bullet, cylinder, scanuser);	
			break;
		}else if (num <= 2) {
			System.out.println("넌 못지나간다.");
		} else {
			System.out.println("지나갈까말까 지나갈까 말까 못 지나간다.");
			continue;
		}
	}
}
	
	static void playRoulette(int num, int count, int bullet, int[] cylinder, Scanner scanuser) {
	int i = 0;
	while(true) {
		if(count == 0) {	
			System.out.println("당신은 살아남으셨습니다. You Win!");
			break;
		}
		System.out.println("1.발사 2.그만");
		num = scanuser.nextInt();			
		if(num == 1) {	
			if(bullet == cylinder[i]) {
				System.out.println("사망");
				break;
			} else {
				count--;	
				System.out.println("살아남았다.");
				i++;		
			}
		}else if (num == 2) {	
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


	}
	}