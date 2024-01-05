import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int students = 30;
        int[] out = new int[students];
        for(int i=0; i<28; i++)
        {
            int n = sc.nextInt();
            out[n-1] = n;
        }

        for(int i=0; i<30; i++){
            if(out[i] == 0){
                System.out.println(i+1);
            }
        }
    }
}