package chap3;
public class ForFloatCounter{		//중첩된 for문 지정된 횟수만큼 반복해서 돌다가 다시 바깥쪽 for문으로 돌아간다.
	public static void main(String[] args) {
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
		}
	}
}

//for(float z=0.1f; x<=1f; y+=0.1f)