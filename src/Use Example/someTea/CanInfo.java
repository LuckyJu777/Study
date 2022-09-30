package someTea;

public class CanInfo{
	String name;
	String beerflavor;
	String beerbrand;
	int CC;

//	CanInfo(String name, String beerflavor, String beerbrand, int CC){
//		this.name = name;
//		this.beerflavor = beerflavor;
//		this.beerbrand = beerbrand;
//		this.CC = CC;
//	}

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
	
	public String getBeerbrand() {
		return beerbrand;
	}
	
	public void setBeerbrand(String beerbrand) {
		this.beerbrand = beerbrand;
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