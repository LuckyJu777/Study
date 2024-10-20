package car;

import java.util.ArrayList;
import java.util.List;

public interface CarInfo {
	void carList();

}

class TnCar {
	private String carName;	//이름
	private String carManufacturingCompany;	//제조사
	private String carReleaseYear;		//출시년도
	private String carPrice;	//가격

	public TnCar(String carName, String carManufacturingCompany, String carReleaseYear, String carPrice) {
		this.setcarName(carName);
		this.setcarManufacturingCompany(carManufacturingCompany);
		this.setcarReleaseYear(carReleaseYear);
		this.secarPrice(carPrice);
	}

	public String getcarName() {
		return carName;
	}

	public String getcarManufacturingCompany() {
		return carManufacturingCompany;
	}

	public String getcarReleaseYear() {
		return carReleaseYear;
	}

	public String getcarPrice() {
		return carPrice;
	}
	public void setcarName(String carName) {
		this.carName = carName;
	}

	public void setcarManufacturingCompany(String carManufacturingCompany) {
		this.carManufacturingCompany = carManufacturingCompany;
	}

	public void setcarReleaseYear(String carReleaseYear) {
		this.carReleaseYear = carReleaseYear;
	}

	public void secarPrice(String carPrice) {
		this.carPrice = carPrice;
	}

	public void showInfo() {
	System.out.println(carName+","+carManufacturingCompany+","+carReleaseYear+","+carPrice);
	}

}
