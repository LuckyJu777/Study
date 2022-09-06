import java.util.Scanner;

public class OddEven{
	public static void main(String[] args) {
		
		System.out.println("홀수일까요 짝수일까요? ");
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		
		int num = scanner1.nextInt();
		if(num % 2 == 1){					//조건문 홀수이면 => 홀수입니다.
			System.out.println("홀수입니다.");
		}else {				//짝수이면 => 짝수입니다.
			System.out.println("짝수입니다");
	}
}
}

//하고싶은것 : 문자입력하면 숫자가 아니라고 띄워주기 하고 싶은데 문자열과 숫자열을 한객체에 입력 받을 순 없는걸까??