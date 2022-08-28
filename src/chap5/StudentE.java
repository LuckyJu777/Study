package chap5;
public class StudentE{
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 변수가 Student객체를 참조한다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조한다.");
	}
}