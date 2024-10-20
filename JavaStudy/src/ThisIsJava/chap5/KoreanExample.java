package chap5;
public class KoreanExample{
public static void main(String[] args) {
	Korean k1 = new Korean("자박자박", "123456789");
	System.out.println("k1.name : " +k1.name);
	System.out.println("k1.ssn : " +k1.ssn);
	
	Korean k2 = new Korean("김자바", "123456789010");
	System.out.println("k2name :" +k2.name);
	System.out.println("k2ssn : " +k2.ssn);
}
}

/**
public Korean(String name, String ssn) {
	this.name = name;
		(필드)   (매개변수)
	this.ssn = ssn;
	    (필드)  (매개변수)
**/