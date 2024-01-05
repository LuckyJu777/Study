import java.util.Scanner;

public class Main { //알람설정 45분 일찍
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