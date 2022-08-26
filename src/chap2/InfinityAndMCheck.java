package chap2;
public class InfinityAndMCheck{
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z = x/y;
		//double z = % y;
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		
		System.out.println(z+2); //문제가 되는코드
	}
}