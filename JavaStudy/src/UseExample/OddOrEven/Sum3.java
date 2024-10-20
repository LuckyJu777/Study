//배열입력 > 데이터입력 > 데이터 합산
import java.util.Scanner;

public class Sum3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇개의 숫자를 넣을것인지 입력해주세요.");
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		
		System.out.println("숫자를 입력해주세요.");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int element : arr) {
			sum += element;
		}
		
		sc.close();
		
		System.out.println(sum);
	}
}

//배열입력 > 데이터입력 > 배열합산
//배열합산을 어떻게 해, 배열은 그냥 정하면 끝인 배열인데.