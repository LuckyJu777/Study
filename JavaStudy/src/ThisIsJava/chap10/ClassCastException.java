public class ClassCastException{
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDong(dog);
		
//		Cat cat = new Cat();
//		changeDog(cat); //cat객체를 매개값으로 주기
//	}
	
	public static void changeDong(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog)animal;
		}	
	}
}

class Animal{}
class Dog extends Animal {}
class Cat extends Animal {}