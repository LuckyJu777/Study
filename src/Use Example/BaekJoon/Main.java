package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();  //단어 입력받기
		System.out.print(s.length());
	}
}

//public class Main{
//	public static void main(String[] args) {
//      String s = "         ,r'\"7" +
//    		     "r`-_   ,'  ,/ "+
//    		     "  \\. \". L_r'"+
//    		   	 "   `~\\/ "+
//    		     "      |"+
//    		  	 "      |";
//	System.out.println(s);
//	}
//}

//1001번
//import java.util.Scanner;
//
//public class Main{
//	public static int A;
//	public static int B;
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	Main main = new Main();
//	main.A = sc.nextInt();
//	main.B = sc.nextInt();
//	System.out.println(A-B);
//	}	
//enum main{
//	A, B
//	}
//}

//사칙연산
//public class AB{
//	public static void main(String[] args) {
//	int a = 23;
//	int b = 181;
//	System.out.println(a+b);
//	System.out.println(a-b);
//	System.out.println(a*b);
//	System.out.println(a/b);
//	System.out.println(a%b);
//	}
//}

//준하 ??!
//import java.util.Scanner;
//public class AB{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println(sc.next()+"??!");
//	}
//}

//1998년생인 내가 태국에서는 2541년생?!
//import java.util.Scanner;
//
//public class Main{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int y = sc.nextInt();
//		System.out.println(y + 543);
//	}
//}

//10807번 - N개의 정수, 정수 v가 몇개인지 구하는 프로그램
//import java.util.ArrayList;
//import java.util.Scanner;
//public class Main{
//	public static void main(String[] args) {
//		ArrayList<Integer> A = new ArrayList<>();
//		ArrayList<Integer> B = new ArrayList<>();
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();	//배열입력
//		for(int i = 0; i<N; i++) {
//			int number = sc.nextInt();
//			A.add(number);
//			}
//		int findNum = sc.nextInt();
//		if(findNum==A.get(N)) {
//			System.out.println(B.add(findNum));
//		}sc.close();
//		System.out.println(B.size());
//	}
//} 	대미친실패~~~~

////10871번 - n개의 수열 A, 정수 x가 주어짐.

//public class Main{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int N = sc.nextInt();
//		int X = sc.nextInt();
//		int arr[] = new int[N];
//		
//		for(int i = 0; i<N; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		sc.close();
//		
//		for(int i = 0; i<N; i++) {
//			if(arr[i] < X) {
//				System.out.println(arr[i] + "");
//			}
//		}
//	}
//}


