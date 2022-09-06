import java.util.Scanner;

public class Sum2{
	public static void main(String[] args) {
		boolean run = true;
		int sum = 0;

//		int[] number2 = {number};
		
		while (run) {
			System.out.println("입력하세요.");
			Scanner scanner  = new Scanner(System.in);
			int num = scanner.nextInt();
			
			if( num > 0 ) {
				int [] number = new int[num];	// number 배열에 int배열에  num을 넣어준다.
			} else if( num == 0) {	//0을 치면하면 프로그램 종료하면서, 내가 이때까지 입력한 값을 총합출력		
				System.out.println("프로그램종료");
					for(int element : number) {
						sum += element;
						System.out.println(sum);
						}run = false;	
			} else {
				System.out.println("프로그램종료2");	
				scanner.close();
				break;
			}
		}
	}
}