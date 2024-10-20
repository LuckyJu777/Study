import java.util.Scanner;

public class Test01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();	//line으로 받기
        int b = Integer.parseInt(String.valueOf(a.charAt(0)));
        char operator = a.charAt(1);
        int b2 = Integer.parseInt(a.charAt(2)+"");

//		System.out.println(b);
//		System.out.println(b2);

        Calculator c = new Calculator();

        if(a.indexOf("+")>0) {
            c.plus(b,b2);
        }

        if(a.indexOf("-")>0) {
            c.minus(b, b2);
        }

        if(a.indexOf("*")>0) {
            c.multiplication(b, b2);
        }

        if(a.indexOf("/")>0) {
            c.divide(b, b2);
        }
    }
}