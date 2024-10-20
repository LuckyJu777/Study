import java.util.Scanner;

public class AllSum{
	public static void main(String[] args) {

		boolean run = true;
		int sum = 0;
		int[] number = null;
		
		//홀수 합
		int odd_tot = 0;
		//짝수 합
		int even_tot = 0;
		
		while (run) {
			System.out.println("1번 : 배열의 숫자넣기 / 2번 : 데이터의 값 반환 / 0 : 종료 후 합산");
			System.out.println("3번 : 홀수합 출력 / 4번 :짝수합 출력 / 5번 : 홀수의 리스트를 출력");
			System.out.println("6번 : 짝수의 리스트 출력 / 7번 : 홀수의 합 짝수의 합을 비교하여 더 큰 값 출력");
			Scanner scanner  = new Scanner(System.in);								//사용자 입력값
			int num = scanner.nextInt();											//nextint로 정수로 받아준다.
			
			switch(num) {							//swithch num에서 0을치면 합산을 한다.
			case 0 : 
				System.out.println("합산합니다.");
				for(int element : number) {			//number 배열에 가져올 값이 존재하는지	-> element값에 저장한다. -> 실행문이 모두 실행되면 루프를 돌아  number에서 가져올 값이 있는지 본다.
					sum += element;				
					}
					System.out.println(sum);
					break;
			case 1 :								//1을 누르면
				System.out.println("배열의 사이즈");	//배열사이즈를 정한다
				int size = scanner.nextInt();		//size 배열의 사이즈 데이터 값을 사용자가 입력한다.
				number = new int[size];				//size 데이터를 number 배열에 넣어준다.
				System.out.println("들어갈 값을 넣어주세요.");
				for(int i = 0; i<number.length; i++) {	//넘버 배열길이가 i보다 크다면 i증감 
					number[i] = scanner.nextInt();		//i 매개변수를 적어준 두 값을 scanner로 받아옴 
				}
				break;
					
			case 2 : 
				System.out.println("입력한 모든 값을 출력합니다.");	//모든 값 출력
				for(int i = 0; i<number.length; i++) {
					int str1 = number[i];		
					System.out.println("데이터 반환 - " + str1);	
					System.out.println();
				}
				System.out.println(number.length);
				break;
			case 3 :
				System.out.println("입력한 값들 중 홀수값의 총 합계 리스트 출력");
					for(int i = 0; i<number.length; i++) {			//for문을 어떻게 고치지
						int str2 = number[i];
					if(str2%2!=0){					//조건문 홀수이면 => 홀수입니다.
						odd_tot += str2;
						}
					}
					System.out.println("홀수의 값 합계 입니다.");
					System.out.println(":" + odd_tot);
					System.out.println();
				break;
			case 4 :
				System.out.println("입력한 값들 중 짝수값의 총 합계 리스트 출력 ");
					for(int i = 0; i<number.length; i++) {			//for문을 어떻게 고치지
						int str3 = number[i];						//안에 중복해서 2번씩 뜬다 for문으로 한번에 연산을 다 할순 없을까?
					if(str3%2 == 0){					//조건문 홀수이면 => 짝수입니다.
						even_tot += str3;
						}
					}
					System.out.println("짝수의 값 합계 입니다.");
					System.out.println(":" + even_tot);
					System.out.println();
					break;
			case 5 :
				System.out.println("입력한 홀수의 값을 출력합니다.");	
				for(int i = 0; i<number.length; i++) {
					int str4 = number[i];
					if(str4%2!=0){
					System.out.println("데이터 반환 - " + str4);	
					}
				}
				System.out.println();
				break;
			case 6 :
				System.out.println("입력한 짝수의 값을 출력합니다.");
				for(int i = 0; i<number.length; i++) {
					int str5 = number[i];
					if(str5%2 == 0){
					System.out.println("데이터 반환 - " + str5);	
					} 
				}	
				System.out.println();	
				break;
				
			  case 7:
                  System.out.println("홀수 합 :" + odd_tot);
                  System.out.println("짝수 합 :" + even_tot);

                  if (odd_tot > even_tot) {
                      System.out.println("홀수가 더큼");
                      break;
                  } else {
                      System.out.println("짝수가 더큼");
                      break;
                 }
			}
		}
	}
}
