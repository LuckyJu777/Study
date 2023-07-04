import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		int i = 0;
		Scanner sc = new Scanner(System.in);
		String aa = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(aa," ");
		System.out.println(st.countTokens());
	}
	
}