import java.util.navigableSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(98));
		scores.add(new Integer(94));
		scores.add(new Integer(91));
		scores.add(new Integer(95));
		scores.add(new Integer(66));
		
		NavigableSet<Integer> descendingSet = descendingSet.descendingSet();
		
		for(Integer score : ascendingSet) {
			System.out.print(score + "");
		}
	}
}