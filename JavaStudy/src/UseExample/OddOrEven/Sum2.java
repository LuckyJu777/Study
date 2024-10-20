package OddOrEven;

import java.util.Scanner;

public class Sum2{
	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하세요 하나의 배열안에 인덱스와 데이터값을 넣어드립니다.");
		
		Sum1 sum1 = new Sum1();
		sum1.input_number();
		sum1.find_odd_even();
		sum1.print_total();
		sum1.print_even();
		sum1.print_odd();
		int big_num = sum1.find_big_num();
		
		System.out.println("big_num = " + big_num);

	}
}