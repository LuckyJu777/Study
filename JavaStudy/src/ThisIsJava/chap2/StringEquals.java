package chap2;
public class StringEquals{
	public static void main(String[] args) {
	String strVar1 = "민철이";	//string 클래스의 한 종류이다. 같은 string의 문자열이면 같은 똑같은 객체번지를 참조
	String strVar2 = "민철이";
	String strVar3 = new String("민철이");	//new String을 넣어주었기때문에 다른 객체번지를 참조 
	
	System.out.println( strVar1 == strVar2);
	System.out.println( strVar1 == strVar3);
	System.out.println();
	System.out.println( strVar1.equals(strVar2)); //문자열이 같은지 다른지 비교한다
	System.out.println( strVar1.equals(strVar3)); //비교한다~
	}
}