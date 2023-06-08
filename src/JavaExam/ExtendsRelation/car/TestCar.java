package car;

public class TestCar {

	public static void main(String[] args) {
		Car c =
				new Car(new Engine("A010", "2001"),"g80");
		Engine e = c.getEngine();
		System.out.println(c);
	}

}