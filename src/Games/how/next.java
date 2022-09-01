package how;

import java.util.Scanner;

/*
*next() 공백을 기준으로 입력받는다. 띄워쓰기를 기준으로 입력 받음
*nextLine() 한 라인 기준으로 입력을 받는다. 개행문자를 기준으로 입력을 받는다.
*개행문자 =줄넘김 =\n을 기준으로 입력받는다.
*띄워쓰기 =s\\ 을 기준으로 입력받는다.
*hasNext()메서드는 입력된 토큰이 이으면 true 없으면 false를 반환시키는 메서드
*약, 토큰 개행문자만 남은 경우 false를 반환하지만 개행문자는 그대로 남아있다. 
*/

class backback
{
	public static void main(String[] args)
	{	String str1;
		String str2;
		
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt());
			str1 = scan.next();
			System.out.println(str1);
			
			str2 = scan.nextLine();
			System.out.println(str2);
	}
}
/*
 *hasNext()는 역할이 입력된 토큰이 있다면, true! 
 *새로운 입력이 있을 때 까지 무한정 기다린다.
 *hasNextInt() 같은경우는 값을 출력할 때 정수가 들어오면 true! 이다.
*static void main을 선언하고 그 이후에는 클래스를 만들 때 main을 한번 했으니까
*더 안써도 되는건지 아니면.. 이유가 무엇인지??
*/