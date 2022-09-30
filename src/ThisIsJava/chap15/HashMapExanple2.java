import java.util.*;

public class HashMapExample2{
	public static void main(Stringp[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1, "행복해지길바래"), 99);
		map.put(new Student(1, "행복해지길바래"), 99);
		
		System.out.println("총 Entry 수 :" + map.size());
	}
}