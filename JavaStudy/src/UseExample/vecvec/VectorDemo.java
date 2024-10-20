package vecvec;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> V = new Vector<String>();
		
		V.add("저에게도 꿈은 있었습니다"+"\n");
		
		V.add("..."+"\n");
		V.add("분분한 낙화"+"\n");
		V.add("결별이 이룩하는 축복에 싸여");
		
		System.out.println(V);
		
		V.remove(0);
		
		System.out.println(V);
	}
}