import java.util.LinkedList;
import java.util.Scanner;

public class Sum{
	public static void main(String[] args) {
			// int 배열을 해보았지만 불규칙적인것은 어떻게 하지 못했따...
			boolean run = true;
			int sum = 0;
			number
				switch(run)
				case 0 :
					System.out.println("프로그램종료");
					for(int i =0; i<number2.length; i++) {
						sum += number2[i];
						System.out.println(sum);
				break;
				
				case 1 :
				System.out.println("총 숫자를 넣을 갯수를 입력해주세요");
				Scanner scanner  = new Scanner(System.in);	//배열 몇개 만들것인가?
				int number = scanner.nextInt();
				
				System.out.println("숫자를 입력하세요.");
				for(int i = 0; i<number; i++) {	//i가 증감
				int[] arr = new int[number]; 	//틀만들기 i가 올라가면 
				
				Scanner scanner2  = new Scanner(System.in);	//데이터넣어주는 값
				int number2 = scanner2.nextInt();	
				arr[i] = number2;		//배열 안 데이터 넣어주기
				System.out.println("arr[" +i+ "] =" + number2); 	//배열만보여주기
				break;
			}
		}
	}
				//0을 치면하면 프로그램 종료하면서, 내가 이때까지 입력한 값을 총합출력	
//				System.out.println("프로그램종료");
//				break;
//				for(int i =0; i<number2.length; i++) {
//					sum += number2[i];
//					System.out.println(sum);
//				}
				
	


//				
//			} else {
//				System.out.println("프로그램종료2");	
//				scanner.close();
//				break;
//			}
//		}
//	}
