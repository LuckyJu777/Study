package someTea;

public class CanInfo {
	String name;
	String beerflavor;
	String beerorigin;

	CanInfo() {

	}

	CanInfo(String name) {
		this(name, "");
	}

	CanInfo(String name, String beerflavor) {
		this(name, beerflavor, "");
	}

	CanInfo(String name, String beerflavor, String beerorigin) {

		this.setName(name);
		this.setBeerflavor(beerflavor);
		this.setBeerorigin(beerorigin);
		this.getName();
		this.getBeerflavor();
		this.getBeerorigin();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	//같은 클래스의 다른 생성자 호출 사용

	public String getBeerflavor() {
		return beerflavor;
	}

	public void setBeerflavor(String beerflavor) {
		this.beerflavor = beerflavor;
	}

	public String getBeerorigin() {
		return beerorigin;
	}

	public void setBeerorigin(String beerorigin) {
		this.beerorigin = beerorigin;
	}

//	this.name = name;
//	this.beerflavor = beerflavor;
//	this.beerorigin = beerorigin;

//	@Override
//	public String toString() {
//		return "toString / 이름" + name + "맛" + beerflavor + "생성지" + beerorigin;

// 생성자를 생성한 후 그 객체 안에 추가적으로 데이터를 넣고싶음
// 생성자를 호출하지 않고도 setter getter를 사용하면 넣을 수 있다.

}