import java.util.TreeSet;

public class TreeSetExample1 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(98));
		scores.add(new Integer(88));
		scores.add(new Integer(85));
		scores.add(new Integer(94));
		scores.add(new Integer(79));
		scores.add(new Integer(91));
		
		Integer score = null;
		
		score = scores.first();
		System.out.println("가장 낮은 점수: " +score);
		
		score = scores.last();
		System.out.println("가장 높은 점수: " +score +"\n");
		
		score = scores.lower(new Integer(87));
		System.out.println("96점 아래 점수: " +score);
		
		score = scores.higher(new Integer(96));
		System.out.println("95점 위의 점수: " + score + "\n");
		
		score = scores.floor(new Integer(95));
		System.out.println("85점 이거나 바로 위의 점수: " + score + "\n");
		
		while(!scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println(score + "(남은 객체 수:" + scores.size() + ")");
		}
	}
}