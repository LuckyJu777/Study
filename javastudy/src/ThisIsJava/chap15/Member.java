//객체 동등 비교 (equals() 메소드

public class Member{
	public String id;
	public int age;
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals (Object obj) {
		if(obj instanceof Member) {		//매개값이 Mebmer타입인지 확인
			Member member = (Member) obj;	//Member 타입으로 강제타입변환하고 id 필드값이 동일한지 검사 
			return member.name.equals(name) && (member.age==age) ;
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}	//String의 hashCode() 이용
}