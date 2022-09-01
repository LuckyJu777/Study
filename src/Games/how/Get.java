package how;
public class Hoegaarden extends Beer {
	
	String flavor;	//필드입력
	int ABV = 6;
	
	Hoegaarden(String model, String flavor) {	//생성자 입력
		super("밀맥주", model);
		this.model = model; //model은 상위 Beer클래스로부터 상속받음
		this.flavor = flavor;
	}
	
	//생성자 오버로딩(ABV)
	Hoegaarden(String model, String flavor, int ABV){
		super("밀맥주", model);
		this.model =  model;	//model은 상위 Beer클래스로부터 상속받음
		this.flavor = flavor;
		this.ABV = ABV;
	}
	
	//메서드 입력
	public void flavordrink() {
		System.out.println(model + "맥주의" + flavor + "맛을 마십니다.");
	}
	
	//Getter
	public String getFlavor() {
		return flavor;
	}
	
	public int getABV() {
		return ABV;
	}
}