package OddOrEven;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sum1{
	
	private List<Integer> list = null;
	private List<Integer>odd_list = null;
	private List<Integer>even_list = null;
	private Scanner scanner2  = null;
	
	private int odd_tot = 0;
	private int even_tot = 0;
	
	private int sum = 0;
	
	Sum1() {
		list = new ArrayList<Integer>();
		odd_list = new ArrayList<Integer>();
		even_list = new ArrayList<Integer>();
		scanner2  = new Scanner(System.in);	//SCANNER
	}
	
	public void input_number() {
		
		boolean run = true;

		while(run) {
			int num = scanner2.nextInt();
			if(num == 0) {
				break;
			}						//0을 넣으면 break;
			list.add(num);			//배열안에 데이터 넣어주기
		}	
		System.out.println("총 객체수는? " + list.size()+"\n");	//1	총객체 수
	}
	
	public void find_odd_even() {
		
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
	}
	
	public void print_total() {
		System.out.println("\n데이터의 총 합 : " + sum + "\n");
	}
	
	public void print_odd() {
		System.out.println("입력한 홀수의 값을 출력합니다.");	//3 홀수 데이터 반환
		run(odd_list , 1);
		System.out.println("\n홀수의 총합을 출력합니다. :  " + odd_tot+ "\n");
	}
	
	public void print_even() {
		System.out.println("입력한 홀수의 값을 출력합니다.");	//3 홀수 데이터 반환
		run(even_list , 2);
		System.out.println("\n짝수의 총합을 출력합니다. :  " + even_tot+ "\n");
	}
	
	public int find_big_num() {
		int rtn_num = 0;
		System.out.println("홀수의 총합과 짝수의 총합을 비교하여 큰 수를 출력합니다.");
		if (odd_tot > even_tot) {
			System.out.println("홀수");
			rtn_num = odd_tot;
		} else {
			System.out.println("짝수");
			rtn_num = even_tot;
		}
		
		return rtn_num;
	}
	
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
			}
		}
	}
