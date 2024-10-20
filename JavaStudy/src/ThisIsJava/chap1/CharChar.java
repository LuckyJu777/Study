package chap1;
public class CharChar {
	public static void main(String[] args) {
		char c1 = 'A'; //문자를 직접 저장
		char c2 = 65;	//10진수로 저장
		char c3 = '\u0041'; //16진수로 저장
	
		char c4 = '가'; //문자를 직접 저장
		char c5 = 44032; //10진수로 저장
		char c6 = '\uac00'; //16진수로 저장
		
		int uniCode = c1; //유니코드 얻기 
		
		char var1 = 'A';
		char var2 = 'B';
		char var3 = '가';
		char var4 = '각';
		
		char a = 65;
		char b = '\u0041';
		char c = 'A';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(uniCode);
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

/**
String 변수 선언, 큰 따옴표로 감싼 문자열 리터럴을 대입
char변수에 작은 따옴표로 감싼 문자가 아니라 직접 유니코드 정수값 저장 
특정 문자의 유니코드를 안다면 10진수 또는 16진수로 저장하면 되는데, A는 10진수 65
16진수로 0x41이므로 다음과 같이 char 변수에 저장할 수 있다. 16진수로 저장할 경우는 유니코드라는 의미에서
char c = '(공백1칸)'; 해줘야 에러가 안뜬다
string str = ""; 공백없어도 갠춘타.
short 2byte로 표현되는 정수값을 저장할 수있는 데이터 타입. C언어와 호환을 위해 사용되며 비교적 자바에서는 잘 사용되지 않는다.
int타입은 자바에서 정수연산을 하기 위한 기본 타입이다.!
byte, short 를 연산(+)하면 >>> int 값이 나온다. int타입으로 변수를 선언한 것의 성능차이는 거의 없다. 
**/