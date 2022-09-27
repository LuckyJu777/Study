//처음부터 다시 짠다.
package OddOrEven;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sum{
	public static void main(String[] args) {
		System.out.println("숫자 입력, 0 입력시 종료");
		Scanner scanner2 = new Scanner(System.in);	//scanner 넣어주기
		
		List<Integer>list = new ArrayList<Integer>();
		List<Integer>odd_list = new ArrayList<Integer>();
		List<Integer>even_list = new ArrayList<Integer>();
		int odd = 0;
		int even = 0;	//각각 int로 배열 정의
		
		boolean run = true;
		
		while(run) {
			int num = scanner2.nextInt();	//num에 넣어주기, scanner2에
			if(num == 0) {
				break;
			}
			list.add(num);
		}
		System.out.println("총 객체수는 " + list.size() + "\n");	//1.총 객체수 사이즈
		
		int sum = 0; 	//int sum 은 0
		int Arraylist = list.size();
		for(int i = 0; i<Arraylist; i++) {
			int str1 = list.get(i);
			System.out.println("데이터 반환 : " + str1);
			sum += str1;
			
			if(str1%2 != 0) {
				odd += list.get(i);
				odd_list.add(str1); //odd리스트로 넣어준다.
			} else {
				even += list.get(i);
				even_list.add(str1);	//아닐시에는 짝수로 even데이터를 리스트 안에 넣어준다.
			}
		}
		System.out.println("\n데이터의 총 합 : " + sum +"\n");
		System.out.println("홀수의 총합을 출력 : " + odd +"\n");
		System.out.println("\n짝수의 총 합 :" + even +"\n");
		System.out.println("홀수의 총합과 짝수의 총합을 비교하여 큰 수를 출력합니다.");
		if (odd > even) {
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		}
		System.out.println();
		
		//생성자
		Sum sum1 = new Sum();
		sum1.All(even_list, 2);
		sum1.All(odd_list, 1);
		
		System.out.println("\n짝수의 총합을 출력합니다. : " + even + "\n");
		System.out.println("홀수의 총합과 짝수의 총합을 비교하여 큰 수를 출력합니다.");
		if(odd > even) {
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		}
	}
	
	public void All(List<Integer> num_list, int print_type) {	//void는 리턴값이 없다. 리턴값이 있고 없는거 예제 만들어보자!
	
		String print_str = "";	//String으로 아무것도 넣어주지않았다.
		
		if(print_type == 1) {	//만약 프린트 타입이 1이라면 홀수로 넣어줘라
		print_str = "홀수";
		}else if(print_type == 2) {	//만약 프린트타입이 2라면 짝수를 넣어줘라
		print_str = "짝수";
		}
	
		int size = num_list.size();	//위에서 먼저 선언 밑에서 두번 일하는 것을 줄여줌.
		for(int i = 0; i<size; i++) {
			int str1 = num_list.get(i);	//받아옴
			System.out.println(print_str + " : " + str1);	//출력해줌
		}
	}	
}

	
