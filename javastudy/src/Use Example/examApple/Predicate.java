package examApple;

import java.util.ArrayList;
import java.util.List;

//참 또는 거짓을 반환하는 함수
public interface ApplePredicate{
	boolean test (Apple apple);
}

public class AppleHeavyWeightPredicate implements ApplePredicate {
	public boolean test (Apple apple) {
		return apple.getWeight() >= 150;
	}
}

public class AppleGreenColorPredicate implements ApplePredicate {
	@Override
	public boolean test(Apple apple) {
		return Apple.Colors.GREEN.equals(apple.getColor());
	}
}

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Apple {

    public enum Colors {
        GREEN, RED, BLACK
    }

    private Colors color;
    private Integer weight;

    public static List<Apple> filterApplesCustomPredicate(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
               result.add(apple);
            }
        }
        return result;
    }

    public static boolean isGreenApple(Apple apple) {
        return Colors.GREEN.equals(apple.getColor());
    }

}
class Ch2BehaviorParamizeTest {

    List<Apple> inventory = new ArrayList();

    @BeforeEach
    void setUp() {
        inventory.add(new Apple(Apple.Colors.RED, 150));
        inventory.add(new Apple(Apple.Colors.GREEN, 100));
        inventory.add(new Apple(Apple.Colors.BLACK, 50));
    }

    @Test
    void predicateTest() {
    	//작성한 필터메소드에 조건에 따라 predicate를 다르게 사용하면 
        //파라미터에 따라 다른 동작을 수행한다
        //아래 코드에서 동작파라미터화에서 말하는 코드블록은 Apple...Predicate()이다
        Apple.filterApplesCustomPredicate(inventory, new AppleGreenColorPredicate());
        Apple.filterApplesCustomPredicate(inventory, new AppleHeavyWeightPredicate());
        
        //predicate 굳이 안하고 람다로 하는게 좋을듯
        Apple.filterApples(inventory, apple -> Apple.Colors.RED.equals(apple.getColor()));
    }
}
