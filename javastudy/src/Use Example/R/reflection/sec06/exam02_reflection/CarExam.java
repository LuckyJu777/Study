package R.reflection.sec06.exam02_reflection;

public class CarExam{
	public static void main(String[] args) {
		CarExam carExam = new CarExam();	//왜 널값이 여기 들어가지?
		Class clazz1 = carExam.getClass();
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
	
	try {
		Class clazz2 = Class.forName("sec06.exam01_class.Car");
		System.out.println(clazz2.getName());
		System.out.println(clazz2.getSimpleName());
		System.out.println(clazz2.getPackage().getName());
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
		}
	}
}
