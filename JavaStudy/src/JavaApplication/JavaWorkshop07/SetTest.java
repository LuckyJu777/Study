import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        String str="Javaprogramming";
        char chars[] = str.toCharArray();

        Set<Character> s = new HashSet<>();
        for(int i = 0; i<chars.length; i++) {
            s.add(chars[i]);
        }
        System.out.println(s);
    }
}