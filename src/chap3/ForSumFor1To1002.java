package chap3;	//1~100까지 총 합
public class ForSumFor1To1002{
	public static void main(String[] args) {
		int sum = 0;
		
		int i = 0;
		for(i=1; i<=100; i++) {
			sum += i;
		}
	System.out.println("1~100까지의 총 합:" + sum);
	}
}		
