package chap5;		//생성자의 오버로딩 
public class Car3{
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car3(){
		//생성자
	}
	
	Car3(String model){
		this.model = model;
	}
	
	Car3(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	Car3(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}