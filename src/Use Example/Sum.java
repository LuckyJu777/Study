import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sum{
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요 하나의 배열안에 인덱스와 데이터값을 넣어드립니다.");
		Scanner scanner2  = new Scanner(System.in);	//SCANNER
		List<Integer> list = new ArrayList<Integer>();
			
		boolean run = true;
		while(run) {
			int num = scanner2.nextInt();
			if(num == 0) {
				run = false;
			}
			list.add(num);			//배열안에 데이터 넣어주기
		}						

		
		int num = list.size();		//총 객체수
		System.out.println("총 객체수는? " + list.size());
		
		int sum2 = 0;
		int[] number2 = null;
		for(int element : number2) {			//number 배열에 가져올 값이 존재하는지	-> element값에 저장한다. -> 실행문이 모두 실행되면 루프를 돌아  number에서 가져올 값이 있는지 본다.
			sum2 += element;				
			}
			System.out.println(sum2);

		for(int i = 0; i<list.size(); i++) {
			int str = list.get(i);		
			System.out.println("데이터 반환 - " + str);			//객체타입반환
		}
		
			if(num % 2 == 1){					//조건문 홀수이면 => 홀수입니다.
				System.out.println("홀수입니다.");
				int i = 0;
				int str1 = list.get(i);
				System.out.println(":" + str1);
				
			}else {				//짝수이면 => 짝수입니다.
				System.out.println("짝수입니다");
				
		}

	
		
		//입력한 값들 중 홀수 리스트 출력
		
		
		
	
	}	
}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*switch(1) {
		case 0 :
			int num = list.size();	//저장된 총 객체수 얻기 , 홀수와 짝수의 총 갯수 리스트 출력 
			System.out.println("총 객체수는? " + list.size());
			System.out.println();
			
			int sum = list.get(num);
			for(int i = 0; i<list.size(); i++) {
				String str = list.get(i);		// i 정의 해줬는데 왜 말안들어?
			}
			System.out.println("총 합계는?" + sum);
		
		case 2 :	//입력한 값들 중 홀수 리스트 출력
			
		case 3 :	//입력한 값들 중 짝수 리스트 출력
		
		case 4 :  	//홀수의 총 갯수
			
		case 5 : 	//짝수의 총 갯수
			
		case 6 :	//홀수들의 총 합
		
		case 7 : 	//짝수들의 총 합
			
		case 8 : 	//홀수의 총합과 짝수의 총합을 비교하여 큰 수 출력
			
		}
		
			
		}
	}				
				
				*/
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
					
