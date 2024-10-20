package chap5;
public class PersonExampel{
public static void main(String[] args) {
	Person p1= new Person("123456-123456", "계백");
	
	System.out.println(p1.nation);
	System.out.println(p1.ssn);
	System.out.println(p1.name);
	
	p1.name = "을지문덕";
	
	}
}