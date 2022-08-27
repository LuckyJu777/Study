package chap4;
public class StringEquals{
	public static void main(String[] args) {
		String strVar1 = "주형";
		String strVar2 = "주형";
		
		if(strVar1 == strVar2) {
			System.out.println("참조가 같습니다.");
		}else {
			System.out.println("참조가 다릅니다.");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("문자열이 같습니다.");
		}
		
		String strVar3 = new String("주형");
		String strVar4 = new String("주형");
		
		if(strVar3 == strVar4) {
			System.out.println("참조가 같습니다.");
		}else {
			System.out.println("참조가 다릅니다.");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("문자열이 같습니다.");
		}
	}
} 