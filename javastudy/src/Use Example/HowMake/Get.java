package how;
public class Get extends Beer {
	String flavor;
	int ABV = 6;
	
	Get(String type, String model, String flavor) {	//생성자 입력
		super(type, model);
		this.flavor = flavor;
	}

	//메서드 입력
	public void flavordrink() {
		System.out.println(model + "맥주의" + flavor + "맛을 마십니다.");
	}
	
	//Getter
	public String getFlavor() {
		return flavor;
	}

}