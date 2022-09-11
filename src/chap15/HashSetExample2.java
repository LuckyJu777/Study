package chap15;

import java.lang.reflect.Member;
import java.util.HashSet;
import java.util.Set;

public class HashOSetExample2{
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("금태훈", 25));
		set.add(new Member("금태훈", 25));
		
		System.out.println("총 객체수 : " + set.size());
	}
}