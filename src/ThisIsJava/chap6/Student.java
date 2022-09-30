package chap6;
public class Student extends People{	//people상속
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);	// 부모생성자 호출
		this.studentNo = studentNo;
	}
}