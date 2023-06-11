public class ConcreteClass extends AbstractClass{

    public ConcreteClass() {

    }

    public ConcreteClass(int num) {
        super(num);
    }

    @Override
    public void a() {
        System.out.println("출력 ConcreteClass A >>> ");
    }

    @Override
    public int b() {
        System.out.println("출력 ConcreteClass B >>> ");
        return 0;
    }

    @Override
    public void c(int x) {
        System.out.println("출력 ConcreteClass C >>> " + x);

    }

}