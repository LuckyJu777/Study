import java.util.ArrayList;
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
			list.add(num);
		}						//0을 치면 멈춘다.
								//홀수의 총합 짝수의 총합 위의 리스트에서 걸러서 적용 
								//break문 없이
		int num = list.size();	//저장된 총 객체수 얻기 , 홀수와 짝수의 총 갯수 리스트 출력 
		System.out.println("총 객체수는? " + list.size());
		System.out.println(list.add(num));
		
		
		for(int i = 0; i<list.size(); i++) {
			int str = list.get(num);		// i 정의 해줬는데 왜 말안들어?
			System.out.println("총 합계는?" + str);
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
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
					
