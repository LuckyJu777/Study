import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Resum{
	
	public static List<Array> filterCustomPredicate(List<Array> inventory, SumPredicate p){
		List<Array> result = new ArrayList();
		for(Resum resum: inventory) {
			if(p.test(resum)) {
				result.add(resum);
			}
		}
		return result;
	}
	
	public static boolean 
}