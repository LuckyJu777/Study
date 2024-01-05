package chap15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1{
	public static void main(String[] args) {
		Set<String> set  = new HashSet<String>();
		
		set.add("자바");
		set.add("자바1");
		set.add("자바2");
		set.add("자바");
		set.add("자바3"); 	//중복된 데이터는 한번만 저장된다.
		
		int size = set.size();
		System.out.println("총객체수: " + size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		set.remove("자바1");	//객체삭제
		set.remove("자바친구");	//한개의 객체삭제
		
		System.out.println("총 객체수 : " + set.size());
		
		iterator = set.iterator(); //반복자얻기
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);		
		}
		
		set.clear();
		if(set.isEmpty() ) {System.out.println("비어있음");	}
	}
}