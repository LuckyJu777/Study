import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest3_1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Set set = new HashSet<>();
        Person kim = new Person("유관순",17,"서울");
        set.add(new Person("김",20,"서울"));
        set.add(new Person("홍",23,"전라"));
        set.add(new Person("홍",23,"전라"));
        set.add(kim);
        set.add(kim);

        System.out.println(set);

        //toArray() => 순회 이름만 출력
        Object [] a = set.toArray();
        for(Object o : a) {
//			Person ps = (Person)o;
            System.out.println(((Person)o).getName());
        }
    }

}