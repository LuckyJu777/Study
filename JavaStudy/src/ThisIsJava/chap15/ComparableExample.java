import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("홍시", 23));
		treeSet.add(new Person("자바", 33));//저장될 때 나이순으로 정렬됨
		treeSet.add(new Person("지원", 44));
		
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + ";" + person.age);	//왼쪽 마지막 노드에서 오른쪽 마지막 노드까지 반복해서 가져오기 (오름차순)
		}
	}
}