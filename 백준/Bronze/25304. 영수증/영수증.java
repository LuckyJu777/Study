import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();   //총금액
        int N = sc.nextInt(); //종류 수

        int C = 0;

        for(int i=0; i<N; i++){
            int a =  sc.nextInt(); //물건가격
            int b =  sc.nextInt(); //개수
            C +=a*b;
        }

        if(X == C){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}