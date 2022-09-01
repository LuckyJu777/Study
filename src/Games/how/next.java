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
	{
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			String value = scan.next();
			System.out.println(value);
		}
	}
}

	class serve {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			String value = scan.nextLine();
			System.out.print(value);
		}
	}

/*
*static void main을 선언하고 그 이후에는 클래스를 만들 때 main을 한번 했으니까
*더 안써도 되는건지 아니면.. 이유가 무엇인지??
*/