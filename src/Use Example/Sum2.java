import java.util.Scanner;

public class Sum2{
	public static void main(String[] args) {
		System.out.println("입력하세요.");
		Scanner scanner = new Scanner(System.in); //입력받기
		int scanner2 = scanner.nextInt();			//입력받은 값을 scanner 변수에 넣기 
		int[] number = new int[100];				//입력받은 값을 100번 담을 수 있는 배열통을 만들었다.
		int size = number.length;					//size를 number배열로 인식 .
		
		boolean run = true;					
		
		for(int i = 0; i<size; i++){	//i = 0 i가 사이즈보다 높다면 i가 증감 루프 완성		
			number[i] = scanner.nextInt();		//넘버백개까지 담을 수 있는데 입력한 값이 예를들어 3개면 i안에 3이라고 담긴다.
			
			if(run) {	//만약 
				number[i] = scanner.nextInt(0);
				System.out.println("멈춰");
			}else {
				System.out.println("멈춰2");
			}

		}
	}
}