package chap1;
public class GarbageValueExample {
	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
	// byte int 변수를 각각 125로 초기화하고 5회에 걸쳐 1씩 더하기한 다음 출력한 결과
		for(int i=0; i<5; i++) {
			var1++; //증감
			var2++;	//증감
			System.out.println("var1:" + var1 + "\t" + "var2:" + var2); // \t는 tab만큼 칸을 띄워주는 역할을 한다.
		}
	}
}