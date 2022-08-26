package chap3;	//1~100까지 총 합
public class ForSumFrom1To100{
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i =1; i<=100; i++) {
			sum += i;
		}
	System.out.println("1~100까지의 총 합:" + sum);
	}
}