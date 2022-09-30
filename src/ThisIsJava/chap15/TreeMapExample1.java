import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(new Integer(86), "요호호");
		scores.put(new Integer(23), "이히히");
		scores.put(new Integer(78), "뿍뿍뿍");
		scores.put(new Integer(99), "뽁뽁뽁");
		scores.put(new Integer(68), "랄라라");
		scores.put(new Integer(40), "자박자박");
		
		Map.Entry<Integer, String> entry = null;
		
		entry = scores.firstEntry();
		System.out.println("가장 낮은 점수: " +entry.getKey()+ "-" +entry.getValue());
		
		entry = scores.lastEntry();
		System.out.println("가장 높은 점수: " +entry.getKey()+ "-" +entry.getValue()+ "\n");
		
		entry = scores.lowerEntry(new Integer(95));
		System.out.println("95점 아래 점수: " +entry.getKey()+ "-" +entry.getValue());
		
		entry = scores.higherEntry(new Integer(95));
		System.out.println("95점 이거나 바로 아래 점수:" + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.higherEntry(new Integer(97));
		System.out.println("85점 이거나 바로 위의 점수: " + entry.getKey() + "-" + entry.Value() + "\n");
		
		while(!socores.isEmpty()) {
			entry = scores.pollFirstEntry();
			System.out.println(entry.getKey() + "-" + entry.getValue() + 
					"(남은 객체 수: " + scores.size() +")");
			
		}
	}
}