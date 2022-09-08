import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Sum{
	public static void main(String[] args) {
//		
//				System.out.println("숫자를 입력하세요 하나의 배열안에 인덱스와 데이터값을 넣어드립니다.");
//				Scanner scanner  = new Scanner(System.in);	
//				
//				List<Integer> list = new ArrayList<Integer>();			//Integer classtype(Wrapper) int 원시형변수
//				
//				boolean run = true;
//				while(run) {				//루프
//					int num = scanner.nextInt();	//num을 데이터 값
//					if(num == 0) {					//num 데이터 값을 0 넣어주면
//						run = false;				// 멈춘다
//					}
//					list.add(num);					// num 데이터 추가, 객체 번지 참조하여 리스트가 순차적으로 인덱스 안에 저장	
//				}
//			
//				for(int i = 0; i < list.size(); i++) {	//배열만들기, 저장된 데이터의 수만큼 인덱스를 지정, 루핑하여 배열안에   
//					System.out.println(list.get(i));	//인덱스안의 데이터를 찾기 
//				}
//	}
//	
//
//	static void serve() {
		System.out.println("숫자를 입력하세요 하나의 배열안에 인덱스와 데이터값을 넣어드립니다.");
		Scanner scanner2  = new Scanner(System.in);	//SCANNER
		
			boolean run2 = true;
			int[] chart2;
			while(run2) {
				int num2 = scanner2.nextInt();
				if(num2 == 0) {
					run2 = false;					
				}
			System.out.println(num2);					//number선언에 실패
			for(int i = 0; i < num2.length; i++) {
				System.out.println();
			}
		}
	}				
}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
					
