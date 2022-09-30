package chap6;
public class StudentExample{
	public static void main(String[] args) {
		Student student = new Student("신주형", "123456",1);
		System.out.println("이름:"+student.name);
		System.out.println("ssn:"+student.ssn);  //부모에서 물려받은 필드 출력
		System.out.println("studentNo:"+student.studentNo);
	}
}