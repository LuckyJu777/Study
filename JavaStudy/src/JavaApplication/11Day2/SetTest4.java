import java.util.HashSet;
import java.util.Set;

public class SetTest4 {
    public static void change(int num) {
        num = 100;
    }
    public static void change2(int[] num) {
        num[0] = 0;
    }

    public static void change3(HashSet<String> num) {
        num.remove("홍길동");
    }

    public static void change4(Set<String> num) {
        num.remove("홍길동");
    }

    public static Set<String> getSet() {
        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        return set;

    }

    public static void main(String[] args) {
        Set<String> o = getSet();
        for (String string : o) {
            System.out.println(o);
        }

        System.out.println("============");

        int m = 10;
        System.out.println("변경전 : "+m);
        change(m);
        System.out.println("변경후 : "+m);

        int[] m2 = {9,8,7};
        System.out.println(m2);
        System.out.println("변경전 : "+m2[0]);
        change2(m2);
        System.out.println("변경후 : "+m2[0]);
        change(m2[0]);
        System.out.println("변경후 : "+m2[0]);


        HashSet<String> set = new HashSet<String>();
        set.add("홍길동");
        set.add("이수심이 만ㅇ흔 사람");
        set.add("유관순");
        System.out.println("변경전 : "+set);
        change3(set);
        System.out.println("변경후 : "+set);
        change4(set);
    }
}