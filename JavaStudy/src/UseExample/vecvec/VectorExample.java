package vecvec;

import java.util.Arrays;
import java.util.Vector;

public class VectorExample{
	Vector V = new Vector();
	Vector<VectorDemo> demo = new Vector<VectorDemo>();
	Vector<Integer> i = new Vector<Integer>() ;
	Vector<Integer> i2 = new Vector<Integer>(10);
	Vector<Integer> i3 = new Vector<Integer>(Arrays.asList(1,2,3,4));
	
	Vector<String> s = new Vector<String>();	//String타입 사용
	Vector<Character> ch = new Vector<Character>();	//char 타입 사용

}
