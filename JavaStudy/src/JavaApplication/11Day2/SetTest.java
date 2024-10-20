import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Object> set = new HashSet();	//배열 생성(순서 x, 중복x)
        set.add("1");
        set.add("2");
        set.add(3);		//Integer객체
        set.add("4");
        set.add(3.14);		//3.14 wrapper클래스 소숫점 double
        set.add(new Date());

        System.out.println("길이 : "+ set.size());
        System.out.println("포함여부 : "+ set.contains(20));
        System.out.println("empty?: "+set.isEmpty());
        System.out.println(set);

        Object [] xxx = set.toArray();
        for(Object o : xxx) {
            System.out.println(o);
        }
        set.clear();
        System.out.println(set);
    }
}