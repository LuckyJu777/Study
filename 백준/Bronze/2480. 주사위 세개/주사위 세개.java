import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dis1 = sc.nextInt();
        int dis2 = sc.nextInt();
        int dis3 = sc.nextInt();

        int[] data = {dis1, dis2, dis3};

        int bigN = data[0];

        for(int i =0; i<data.length; i++){
            if(data[i]>bigN){
                bigN=data[i];
            }
        }

        if (dis1 == dis2 && dis1 == dis3 && dis2 == dis3) {
            System.out.println(10000 + (dis1) * 1000);
        } else if (dis1 == dis2 || dis1 == dis3 ) {   //3개중 2개가 같은눈인지 어떻게 알아
            System.out.println(1000 + dis1 * 100);
        } else if (dis2 == dis3) {
            System.out.println(1000 + dis2 * 100);
        } else if (dis1 != dis2 && dis1 != dis3 && dis2 != dis3) {    //3개의 수 중 가장 큰걸 도출할 때는 다 값이 다름. : 다 대조하는걸 적어야하나?
            System.out.println(bigN * 100);
        }
    }
}