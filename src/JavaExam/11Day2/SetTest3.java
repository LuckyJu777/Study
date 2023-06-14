import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Set<Person> set = new HashSet<>();
        Person kim = new Person("유관순",17,"서울");
        set.add(new Person("김",20,"서울"));
        set.add(new Person("홍",23,"전라"));
        set.add(new Person("홍",23,"전라"));
        set.add(kim);
        set.add(kim);

        //toString
        for (Person person : set) {
            System.out.println(person);
        }

        System.out.println("================");

        //person 타입으로 받아서 받은 변수.getName()해주기
        Iterator<Person> it = set.iterator();
        while(it.hasNext()) {
            Person m = it.next();
            System.out.println(">>"+m.getName());
        }
    }

}