package chap2;
public class toBinaryTest{
	public static String toBinaryString(int value) {
		string str = Integer.toBinaryString(value);
		while(str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}
}