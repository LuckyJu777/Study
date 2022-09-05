import java.util.Scanner;

public class OddEven{
	public static void main(String[] args) {
		
		System.out.println("홀수일까요 짝수일까요? ");
			
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		int num = scanner1.nextInt();
		String str = scanner2.nextLine();
		
		if(num == 1){					//조건문 홀수이면 => 홀수입니다.
			System.out.println("홀수입니다.");
		}else if() {				//짝수이면 => 짝수입니다.
			System.out.println(str+ "은 숫자가 아닙니다.숫자를 입력해주세요");
		}else {								//숫자말고 문자를 입력하면 나오게 할 수는 없는건가
			System.out.println("짝수입니다.");
		}
	}
}