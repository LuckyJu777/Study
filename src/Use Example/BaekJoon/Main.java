package BaekJoon;

import java.io.*;
import java.util.*;

import java.util.Scanner;

    public class Main {
        public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int CookTime = sc.nextInt();    //요리하는데 주어진 시간
        sc.close();
        //        1. A(시)와 B(분)을 하나의 분으로 변환한 뒤, C를 더하고 나온 결과 값을 다시 시와 분 으로 변환하는 방법
        int min = H * 60 + M;
        min = min + CookTime;

        int hour = (min / 60) % 24;    //시
        int minute = min % 60;      //분

        System.out.println(hour +" "+ minute);
    }
}
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            final int N = sc.nextInt();
//
//            for(int i = 1; i <= N ; i++) {
//                for(int j = 0; j < N-i; j++)
//                    System.out.print(" ");
//                for(int j = 0; j < i*2-1; j++)
//                    System.out.print("*");
//                System.out.println();
//            }
//
//            for(int i = N-1; i >= 0 ; i--) {
//                for(int j = 0; j < N-i; j++)
//                    System.out.print(" ");
//                for(int j = 0; j < i*2-1; j++)
//                    System.out.print("*");
//                System.out.println();
//            }
//        }
//                    Scanner sc = new Scanner(System.in);
//                    int H = sc.nextInt(); //시
//                    int M = sc.nextInt(); //분
//                    sc.close();
//                    int B = 45;
//
//                    if(M<45){
//                        M += 15;
//                        if(H == 0){
//                            H = 23;
//                        } else {
//                            H -= 1;
//                        }
//                    } else {
//                        M -= 45;
//                    }
//                    System.out.println(H +" "+ M);
//                }
//            Scanner sc = new Scanner(System.in);
//
//            int total =  sc.nextInt();
//            int count = sc.nextInt();
//
//            for(int i = 0; i< count; i++){
//                int price = sc.nextInt();
//                int num = sc.nextInt();
//
//                total = total - (price * num);
//            }
//
//            if(total == 0) System.out.println("Yes");
//            else System.out.println("No");
//        }
}
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//
//        for (int i = 0 ; i < N ; i++) {
//            String a = sc.next();
//            int l = a.length();
//            String f_c = String.valueOf(a.charAt(0));
//            String l_c = String.valueOf(a.charAt(l-1));
//            System.out.println(f_c+l_c);
//        }
//    }

//public class Main {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String s = br.readLine();  //단어 입력받기
//		System.out.print(s.length());
//	}
//}

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


