import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[9];
        int aa = 0;
        int max = 0;

        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();

            if(a[i]>max) {
                max = a[i];
                aa = i;
            }
        }
        System.out.println(max);
        System.out.println(aa+1);
    }
}