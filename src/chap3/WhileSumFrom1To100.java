package chap3;
public class WhileSumFrom1To100{
	public static void main(String[] args) {
		int sum = 0; //총합을 담아놓을 변수
		
		int i = 1;	//카운터변수
		
		while(i<=100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~"+ (i-1) +"합 : "+ sum);
	}
}