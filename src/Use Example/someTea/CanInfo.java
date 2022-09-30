package someTea;

import java.util.ArrayList;

public class CanInfo{
	String name;
	String beerflavor;
	String beerorigin;
	int CC;
	
	ArrayList<String> testbeer = new ArrayList<>();
//	CanInfo(String name, String beerflavor, String beerbrand, int CC){
//		this.name = name;
//		this.beerflavor = beerflavor;
//		this.beerbrand = beerbrand;
//		this.CC = CC;
//	}
//생성자를 생성한 후 그 객체 안에 추가적으로 데이터를 넣고싶음
//생성자를 호출하지 않고도 setter getter를 사용하면 넣을 수 있다.
//하나의 객체를 호출하면 안의 정보를 다 뽑아줄수 있나?
//여기서 배열을 다 정리해야하나?
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

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

	public int getCC() {
		return CC;
	}



	public void setCC(int cC) {
		CC = cC;
	}



	@Override
	public String toString() {
		return "CanInfo [name=" + name + "]";
	}
}