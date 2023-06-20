
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int i = sc.nextInt();
		char c = ' ';
		for (int j = 0; j < s.length(); j++) {
			if (j == i-1) {
				c = s.charAt(j);
			}
		}
		sc.close();
		System.out.println(c);	
	}
}
