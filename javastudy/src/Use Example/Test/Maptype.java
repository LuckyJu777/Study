package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Maptype{
	
	private List<Integer> list = null;
	private List<Integer> odd_list = null;
	private List<Integer> even_list = null;
	private Scanner scanner2 = null;
	
	private int odd_tot = 0;
	private int even_tot = 0;
	private int sum = 0;
	
	void Sum1() {
		list = new ArrayList<Integer>();
		odd_list = new ArrayList<Integer>();
		even_list = new ArrayList<Integer>();
		scanner2 = new Scanner(System.in);
	}
	
	public void input_number() {
		
		boolean run = true;
		
		while(run) {
			int num = scanner2.nextInt();
			if(num == 0) {
				break;
			}
			list.add(num);
		}
		System.out.println("총 객체수는?" + list.size() +"\n");
	}
	
	public void find_odd_even() {
		for(int i = 0; i<list.size(); i++) {
			int str1 = list.get(i);
			sum += str1;
			
			if(str1%2!=0) {
				odd_tot += list.get(i);
				odd_list.add(str1);
			} else {
				even_tot += list.get(i);
				even_list.add(str1);
			}
		}
	}
	
	public void print_total() {
		System.out.println("\n 데이터의 총 합 :" + sum + "\n");
	}
	
	public void print_odd() {
		System.out.println("입력한 홀수의 값을 출력합니다.");
		run(odd_list, 1);
		System.out.println("\n홀수의 총합을 출력한다. : " + odd_tot + "\n");
	}
	
	public void print_even() {
		System.out.println("입력한 짝수의 값을 출력합니다.");
		run(even_list, 2);
		System.out.println("\n 짝수의 총합을 출력합니다. : " + even_tot +"\n");
	}
	
	public int find_big_num() {
		int rtn_num = 0;
		System.out.println("홀수의 총합과 짝수의 총합을 비교하여 큰 수를 출력");
		if(odd_tot > even_tot) {
			System.out.println("홀수");
			rtn_num = odd_tot;
		} else {
			System.out.println("짝수");
			rtn_num = even_tot;
		}
		
		return rtn_num;
	}
	
	public void run(List<Integer> num_list, int print_type) {
		String print_str = "";
		
		if(print_type == 1) {
			print_str = "홀수";
		} else if(print_type == 2) {
			print_str = "짝수";
		}
		
		int size = num_list.size();
		for(int i = 0; i<size; i++) {
			int str1 = num_list.get(i);
			System.out.println(print_str + " : " + str1);
		}
	}
}