package chap5; //객체 생성시 생서자 선택!!
public class CarExample5{
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1.company : " +car1.company);
		System.out.println();
		
		Car car2 = new Car();
		System.out.println("car2.company : " +car2.company);
		System.out.println("car2.model : " +car2.model);
		
		Car car3 = new Car();
		System.out.println("car3.company : " +car3.company);
		System.out.println("car3.model : " +car3.model);
		System.out.println("car3.color : " +car3.color);
		System.out.println();
		
		Car car4 = new Car();
		System.out.println("car.company : " +car4.company);
		System.out.println("car.model : " +car4.model);
		System.out.println("car.color : " + car4.color);
		System.out.println("car.maxSpeed : " +car4.maxSpeed);
	}
}