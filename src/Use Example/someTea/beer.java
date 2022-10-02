package someTea;

public class Beer{
	String name;
	String flavor;
	String origin;
	int CC;
	
	
	
//	CanInfo(String name, String beerflavor, String beerbrand, int CC){
//		this.name = name;
//		this.beerflavor = beerflavor;
//		this.beerbrand = beerbrand;
//		this.CC = CC;
//	}
//생성자를 생성한 후 그 객체 안에 추가적으로 데이터를 넣고싶음
//생성자를 호출하지 않고도 setter getter를 사용하면 넣을 수 있다.
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
	public String getOrigin() {
		return origin;
	}
	
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public int getCC() {
		return CC;
	}

	public void setCC(int cC) {
		CC = cC;
	}

	@Override
	public String toString() {
		return "Beer [name=" + name + ", flavor=" + flavor + ", origin=" + origin + ", CC=" + CC + "]";
	}

	
	
	//하나의 객체를 호출하면 안의 정보를 다 뽑아줄수 있나?
	//여기서 배열을 다 정리해야하나?
	
	
}