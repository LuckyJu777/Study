public class Main {
    public static void main(String[] args) {

        ConcreteClass y = new ConcreteClass(100);
        System.out.println("출력>>> "+y.getNum());
        y.a();
        int n = y.b();
        y.c(100);

        ConcreteClass2 y2 = new ConcreteClass2();
        System.out.println("출력2>>> "+y.getNum());
        y.a();
        int n2 = y.b();
        y.c(100);

        //배열의 타입 AbstractClass타입으로 선언
        //for문을 돌려서 a로 호출하면 관리하기 편해진다.

        AbstractClass[] arr = {
                y, y2
        };
        for (AbstractClass t : arr) {
            t.a();
        }

    }
}