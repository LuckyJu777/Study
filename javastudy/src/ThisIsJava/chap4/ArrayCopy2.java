package chap4; //배열을 복사시킨다 복사되지 않은 항목
public class ArrayCopy2{ //배열의 기본 초기값 null이 그대로 유지
	public static void main(String[] args) {
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy( oldStrArray, 0 , newStrArray, 0, oldStrArray.length);
	for(int i=0; i<newStrArray.length; i++) {
		System.out.print(newStrArray[i] + ", ");
	}
  }
}