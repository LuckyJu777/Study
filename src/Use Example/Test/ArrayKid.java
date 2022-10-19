package Test;

import java.util.ArrayList;

public class ArrayKid extends ArrayRandom {	//상속 및 내부클래스 Test
	public void arrayKid_call() {
		System.out.println("<arrayKid_call을 호출합니다.>");	
		}
		
	class ArrayKid_List {
		public void call() {
			System.out.println("<ArrayKid 밑 ArrayKid_List를 출력합니다.>");
			ArrayKid test = new ArrayKid();
			System.out.println("<ArrayKid_list > call함수에서 ArrayKid생성자를 생성하였습니다.>");
			arrayKid_call();
		}

		public void call_const() {
			System.out.println("<call_const를 호출합니다.>");
			ArrayKid kid = new ArrayKid();
			ArrayKid.ArrayKid_List kid2 = kid.new ArrayKid_List();
		}
	}
	
	class ArrayKid_odd {
		public void call_odd() {
			System.out.println("<call_odd 호출합니다.>");
			ArrayRandom Test = new ArrayRandom();
			Test.inputNumber();
			Test.getSum();
			
			ArrayKid_List Test1 = new ArrayKid_List();
			Test1.call();
			
		}	
	}
	
	public interface ArrayKid_I {public abstract void Animalstr();}
	interface Inter{
		public static final String ddd = "나비";
		public abstract String Animalstr(String ddd);
	}
	
	class AnimalName implements ArrayKid_I{
		public void Animalstr() {
			ArrayList<DataName> List = new ArrayList<>();
			DataName dataName = new DataName();
			String cat = "고양이";
			String cow = "소";
			String dog = "개";
			String rabbit = "토끼";
			
			System.out.println("<interface ArraySet의 Animalstr 을 호출합니다.>");
		} 
	}
}
