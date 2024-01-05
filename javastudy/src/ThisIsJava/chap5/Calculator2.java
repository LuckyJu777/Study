package chap5;
public class Calculator2{
	//정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	//직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
}		//메소드를 오버로딩해서 매개값이 한 개 면 정사각형의 넓이를, 
		//계산하여 리턴하도록 했다.