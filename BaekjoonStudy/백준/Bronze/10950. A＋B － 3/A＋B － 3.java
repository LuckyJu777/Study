import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i<T; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();   //각 테스트마다 A+B를 출력한다
            System.out.println(A+B);
        }
    }
}