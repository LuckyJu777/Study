import java.util.Arrays;
import java.util.Scanner;

public class Sum3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇개의 숫자를 넣을것인지 입력해주세요.");
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		int[] sum;
		
		System.out.println("숫자를 입력해주세요.");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	
		for(int element : arr) {
			sum += element;
		}
		
		sc.close();
		
		System.out.println(sum);
		System.out.println(Arrays.toString(sum));
	}
}