package Member.TestExample;

class Car{
	String color;
	String gearType;	//변속기 종류 - 자동, 수동
	int door;

	Car() {
		this("white", "auto", 4);	//Car(String color, String gearType, int door)를 호출
	}

	Car(String color) {
		this(color, "auto", 4);
	}
	
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

class CarTest2 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("blue");
		
		System.out.print("c1의 color " + c1.color + "\t gearType= " + c1.gearType );
	}
}
