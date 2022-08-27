package chap3; //continue를 사용한 구문
public class Continue{
	public static void main(String[] args) {
		for(int i = 1; i<=10; i++) {
			if(i%2 != 0) {
				continue;	//2로 나눈 나머지가 0이 아닌 경우 홀수일 경우
			}
		System.out.println(i); //홀수는 실행되지 않는다.
		}
	}
}