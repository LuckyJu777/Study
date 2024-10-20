public class Rectangle extends Shape implements Mobable{
    int x;
    int y;
    int width;  //길이
    double area;    //area
    double round;   //Circumference

    public Rectangle() {
        // TODO Auto-generated constructor stub
    }

    public Rectangle(int x, int y, int width) {
        //3개의 클래스 변수를 입력받는 생성자 x,y좌표를 이용하여 point 객체 생성
        this.x = x;
        this.y = y;
        this.width = width;
    }

    public double getArea() {
        //도형 넓이 리턴
        area = x*y;
        return area;
    }
    public double setArea(){
        area = x*y;
        return area;
    }
    public double getCircumference() {
        //도형의 둘레 리턴
        round = (x+y)*2;
        return round;
    }

    @Override
    public void move(int x, int y) {
        //좌표를 변경
        int mx = x+2;
        int my = y+2;
        System.out.println("이동합니다.");
    }

    @Override
    public String toString(){
        return " 길이 : " +width+ " \tx : "+x+"\t y : "+y+" \t area : "+area + "\t Circumference : "+round;
    }
}
