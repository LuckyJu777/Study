package Six;

import java.util.Objects;

public class deepEqul {
	public static void main(String[] args) {
	Integer o1 = 1000;
	Integer o2 = 1000;
	System.out.println(Objects.equals(o1,o2));
	System.out.println(Objects.equals(o1,null));
	System.out.println(Objects.equals(null, o2));
	System.out.println(Objects.equals(null, null));
	}
}
