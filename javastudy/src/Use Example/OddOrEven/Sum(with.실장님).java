package OddOrEven;

import java.util.ArrayList;
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
		System.out.println("총 객체수는? " + list.size()+"\n");	//1	총객체 수
			
		int sum = 0;
		for(int i = 0; i<list.size(); i++) { 			//2 총 데이터 반환
			int str1 = list.get(i); 
			System.out.println("데이터 반환 - " + str1);	
			sum += str1;
			
			if(str1%2!=0){
				odd_tot += list.get(i);							//홀수를 배열안에 넣어준다.
				odd_list.add(str1);							
			} else {
				even_tot += list.get(i);
				even_list.add(str1);
			}
		}
		System.out.println("\n데이터의 총 합 : " + sum + "\n");
		System.out.println("입력한 홀수의 값을 출력합니다.");	//3 홀수 데이터 반환
//		for(int i = 0; i<odd_list.size(); i++) {
//			int str1 = odd_list.get(i);
//			System.out.println(i+ " 번째 홀수 = " + str1);	
//		}
		
		System.out.println("\n홀수의 총합을 출력합니다. :  " + odd_tot+"\n");
//		for(int i = 0; i<even_list.size(); i++) {
//			int str1 = even_list.get(i);
//			System.out.println(i+ " 번째 짝수 = " + str1);
//		}					//
		//Sum.run(even_list , 2);	//1. sum클래스 생성 2. static 붙여서 하는 방법 
		//Sum.run(odd_list , 1);
		// 1번 
		Sum sum1 = new Sum();
		sum1.run(even_list, 2);
		sum1.run(odd_list, 1);
		
		System.out.println("\n짝수의 총합을 출력합니다. :  " + even_tot+ "\n");
		System.out.println("홀수의 총합과 짝수의 총합을 비교하여 큰 수를 출력합니다.");
		if (odd_tot > even_tot) {
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		}	
	}
	//2번
	public void run (List<Integer> num_list , int print_type) {
		
		String print_str = "";
		
		if(print_type == 1) {
			print_str = "홀수";
		} else if(print_type == 2) {
			print_str = "짝수";
		}
		
		int size = num_list.size();
		//위에서 먼저 선언 밑에서 두번 일하는것을 줄여줌
		for(int i = 0; i<size; i++) {	
			int str1 = num_list.get(i);		//받아옴
			System.out.println(print_str + " : "+ str1);	//출력해줌
//			if(str1%2!=0){														//
//				System.out.println("홀수 : "+ str1);								//짝수와 홀수를 걸러주는 함수
//			}else {
//				System.out.println("짝수 : " +str1);
//			}
		}
	}
}
