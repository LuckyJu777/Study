package chap4;
public class ArrayReferenceObject{
	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println( strArray[0] == strArray[1]);
		System.out.println( strArray[0] == strArray[2]); //같다면 true , 동일한 string 객체참조
		System.out.println(strArray[0].equals(strArray[2]) ); //0과 2 배열항목을 ==연산하면 false나온다.
	}
}