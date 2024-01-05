
public class Calculator {
    public void plus(int b,int b2) {
        System.out.println("더하기");
        double num = b+b2;
        System.out.println(num);
    }

    public void minus(int b,int b2) {
        System.out.println("빼기");
        double num = b-b2;
        System.out.println(num);
    }

    public void multiplication(int b,int b2) {
        double num = b*b2;
        System.out.println("곱하기");
        System.out.println(num);
    }

    public void divide(int b,int b2) {
        System.out.println("나누기");
        double num = 0.0;
        try {
            num = b/b2;
        }catch (ArithmeticException e) {	//ArithmeticException : 0으로 나누는 경우에 발생됨.
            System.out.println("데이터를 바르게 넣어주십시오.");

        }finally {
            System.out.println(num);
        }

    }
}