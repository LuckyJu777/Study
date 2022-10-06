package Test;	//아니 삭제하는법 몰라서 예제보러왔습니다

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1{
	public static void main(String[] args){
	ArrayList<Integer> L1 = new ArrayList<Integer>(10);
	L1.add(4);
	L1.add(2);
	L1.add(2);
	L1.add(7);
	L1.add(8);
	L1.add(9);
	L1.add(3);
	L1.add(1);
	L1.add(2);
	L1.add(5);
	
	ArrayList<Integer> L2 = new ArrayList<Integer>(L1.subList(1, 3));
	print(L1,L2);
	
	Collections.sort(L1);
	Collections.sort(L2);
	//아이고 집중 하나도 안댄다 ~
	
	System.out.println("L1.contatinsAll(L2): " + L1.containsAll(L2));
	
	L2.add(4);
	print(L1, L2);
	
	L2.set(3, 2);
	
	L2.set(4, 2);
	print(L1,L2);
	
	System.out.println("list.retainAll(L2):"
			+L1.retainAll(L2));
	
	for(int i=L2.size()-1; i>=0; i--) {
		if(L1.contains(L2.get(i)))
			L2.remove(i);
	}
	System.out.println(L2);
	
	}
	
	static void print(ArrayList<Integer> L1, ArrayList<Integer> L2) {
		System.out.println("L1: " + L1);
		System.out.println("L2: " + L2);
	}
}