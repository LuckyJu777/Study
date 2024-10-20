import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest3_3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Set<Person> set = new HashSet<>();
        Person kim = new Person("유관순",17,"서울");
        set.add(new Person("김",20,"서울"));
        set.add(new Person("홍",23,"전라"));
        set.add(new Person("홍",23,"전라"));
        set.add(kim);
        set.add(kim);

        System.out.println(set);
        Object[] ps1 = set.toArray();
        for (Object o : ps1) {
            System.out.println(((Person)o).getName());
        }

        Iterator<Person> it = set.iterator();
        while(it.hasNext()) {
//			Person psps = it.next().getName();
            System.out.println(">>> "+it.next().getName());

        }
    }

}