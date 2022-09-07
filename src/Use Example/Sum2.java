import java.util.Scanner;

public class Sum2{
	public static void main(String[] args) {
		boolean run = true;
		int sum = 0;
		int[] number = null;
		
		while (run) {
			System.out.println("1번을 누르면 배열의 숫자넣기 / 0을 누르면 합산합니다.");			
			Scanner scanner  = new Scanner(System.in);								//사용자 입력값
			int num = scanner.nextInt();											//nextint로 정수로 받아준다.
			
			switch(num) {							//swithch num에서 0을치면 합산을 한다.
			case 0 : 
				System.out.println("합산합니다.");
				for(int element : number) {			//number이 elemnet 조건식이 true일경우 더한다. number증감식에 더해져서
					sum += element;
					}
					System.out.println(sum);
					run = false;
					break;
			case 1 :								//1을 누르면
				System.out.println("배열의 사이즈");	//배열사이즈를 정한다
				int size = scanner.nextInt();		//size 배열의 사이즈 데이터 값을 사영자가 입력한다.
				number = new int[size];				//size 데이터를 umber 배열에 넣어준다.
				System.out.println("들어갈 값을 넣어주세요.");
				for(int i = 0; i<number.length; i++) {	//넘버 배열길이가 i보다 크다면 i증감 
					number[i] = scanner.nextInt();		//i 매개변수를 적어준 두 값을 canner로 받아옴 
				}
			}
		}
	}
}