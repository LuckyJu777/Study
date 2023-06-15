//TODO 근데 널값 뜸 
public class Circle extends Shape implements Mobable{
    int x;
    int y;
    int radius; //길이
    double area;
    double round;

    public Circle() {
        // TODO Auto-generated constructor stub
    }

    public Circle(int x, int y){

    }

    public Circle(int x, int y, int radius) {
        //3개 클래스 변수를 입력받는 생성자 x,y좌표를 이용하여 point객체 생성
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getArea() {
        //도형의 넓이 리턴

        return area;
    }

    public double getCircumference() {
        //도형의 둘레 리턴
        return round;
    }

    @Override
    public void move(int x, int y) {
        //좌표를 변경
        int mx = x+1;
        int my = y+1;
        System.out.println("이동합니다.");
    }



    @Override
    public String toString(){
        return " 길이 : "+ radius+ "\tx : "+x+"\t y : "+y+"\t area : "+area + "\t Circumference : "+round;
    }
}