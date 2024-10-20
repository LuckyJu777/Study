import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest2 {
    public static void main(String[] args) {
        Set<String> set2 = new HashSet<>();	//위에꺼나 밑에꺼 써주기~
        Set<String> set = new HashSet();	//배열 생성(순서 x, 중복x)
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        set.add("6");

        //1.toString();
        System.out.println(set);

        //2.foreach
        for(String o : set) {
            System.out.println(o);
        }

        //3.  Iterator 이용
        Iterator<String> it = set.iterator();
        while(it.hasNext()) {
            String n = it.next();
            System.out.println(">>> "+n);
        }
    }
}