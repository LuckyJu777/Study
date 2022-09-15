import java.sql.Array;
import java.util.Scanner;

public class AllSum{
	public static void main(String[] args) {
		boolean run = true;
		int sum = 0;
		int[] number = null;
		
		while (run) {
			System.out.println("1번을 누르면 배열의 숫자넣기 / 0을 누르면 합산합니다.");			
			Scanner scanner  = new Scanner(System.in);								//사용자 입력값
			int num = scanner.nextInt();											//nextint로 정수로 받아준다.
			
			switch(num) {							//swithch num에서 0을치면 합산을 한다.
			case 0 : 
				System.out.println("합산합니다.");
				for(int element : number) {			//number 배열에 가져올 값이 존재하는지	-> element값에 저장한다. -> 실행문이 모두 실행되면 루프를 돌아  number에서 가져올 값이 있는지 본다.
					sum += element;				
					}
					System.out.println(sum);
					run = false;
					break;
			case 1 :								//1을 누르면
				System.out.println("배열의 사이즈");	//배열사이즈를 정한다
				int size = scanner.nextInt();		//size 배열의 사이즈 데이터 값을 사용자가 입력한다.
				number = new int[size];				//size 데이터를 number 배열에 넣어준다.
				System.out.println("들어갈 값을 넣어주세요.");
				for(int i = 0; i<number.length; i++) {	//넘버 배열길이가 i보다 크다면 i증감 
					number[i] = scanner.nextInt();		//i 매개변수를 적어준 두 값을 scanner로 받아옴 
				}
				
		
				
			
			case 2 : 
				
			}
		}
	}
}