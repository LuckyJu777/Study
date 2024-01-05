package car;

import java.util.Arrays;

public class CarList implements CarInfo{
	public void carList() {
		System.out.println("저장된 자동차의 정보를 출력합니다.");

		TnCar[] TnCar = new TnCar[3];

		TnCar [0] = new TnCar("아반떼","현대","2015","10000000");
		TnCar [1] = new TnCar("C-Class","Mercedes-Benz","2022","55000");
		TnCar [2] = new TnCar("911","Porsche","2020","100000");

		for(int i=0; i<TnCar.length; i++) {
			//System.out.println(TnCar[i]);
			TnCar[i].showInfo();
		}
	}
}