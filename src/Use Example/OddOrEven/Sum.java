import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sum{
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요 하나의 배열안에 인덱스와 데이터값을 넣어드립니다.");
		Scanner scanner2  = new Scanner(System.in);	//SCANNER
		List<Integer> list = new ArrayList<Integer>();
		List<Integer>odd_list = new ArrayList<Integer>();
		List<Integer>even_list = new ArrayList<Integer>();
		int odd_tot = 0;
		int even_tot = 0;
		
		boolean run = true;

		while(run) {
			int num = scanner2.nextInt();
			if(num == 0) {
				break;
			}						//0을 넣으면 break;
			list.add(num);			//배열안에 데이터 넣어주기
		}	
			System.out.println("총 객체수는? " + list.size());	//1	총객체 수
			
			for(int i = 0; i<list.size(); i++) { 			//2 총 데이터 반환
				int str1 = list.get(i); 
				System.out.println("데이터 반환 - " + str1);	
			  }	
			System.out.println(); 
			
			System.out.println("입력한 홀수의 값을 출력합니다.");	//3 홀수 데이터 반환
			for(int i = 0; i<list.size(); i++) {
				int str2 = list.get(i);
				if(str2%2!=0){
				System.out.println("데이터 반환 - " + str2);
				int str3 = odd_list.get(i);						//홀수를 배열안에 넣어준다.
				odd_tot += str3;									//배열안의 데이터를 += 더하기더하기 해서 다른변수에 넣어주기
				odd_list.add(odd_tot);								//아니 여기서 막히면 어덕해유
				}
			}
			System.out.println("홀수의 총합을 출력합니다." + odd_tot);
			System.out.println(); 
			
			System.out.println("입력한 짝수의 값을 출력합니다.");	//4 짝수 데이터 반환
			for(int i = 0; i<list.size(); i++) {
				int str3 = list.get(i);
				if(str3%2 == 0){
				System.out.println("데이터 반환 - " + str3);	
				} 
			}	
			/*
			 * System.out.println(); //Integer를 빼
			 * System.out.println("입력한 값들 중 홀수값의 총 합계 리스트 출력"); for(int i = 0;
			 * i<list.size(); i++) { int str4 = odd_list.get(i); //일단 배열 넣고 if(str4%2!=0){
			 * //배열안에 홀수면 int num1 = odd_list.get(i); //5 홀수배열안에서 총 합계
			 * 
			 * } } System.out.println("홀수의 값 합계 입니다." + odd_list.size() );
			 * System.out.println();
			 */
		 
		
		
		
		
	
		  }	
	}

