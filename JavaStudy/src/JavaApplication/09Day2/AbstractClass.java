public abstract class AbstractClass {
    private int num;

    //추상 메서드 - 자식에서 오버라이딩 필수
    public abstract void a();
    public abstract int b();
    public abstract void c(int x);
    //

    public AbstractClass() {
        super();
    }

    public AbstractClass(int num) {
        super();
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }



}