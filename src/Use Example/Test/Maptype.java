package Test;
//public class Mian() {
//	public static void main (String[] args){
//		plist.add(new People "aaa" . 25);";
//	
//	plaist.add people(aad,500).
//	plist.add(new People "bbbb", 35));
//	plist.add(new People("ttt", 33));
//	
//	Stream<Peolple> pstream =vplist.stream();
//	
//	double average = pstream
//			.filter(people -> people.getName().equals("AAA"))
//			.mapToInt(People :: getAge)
//			.average()
//			.getAsDouble();
//	System.out.pirntln(String.fomat(% 2f), averiagea9=);
//	}	}
public class People {
	private String name;
	private int age;
	
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
}
public class Maptype{
	public static void main(String[] args) {
		List<People> plist = new ArrayLT<People>();
		
		plist.add(new People("aaa", 25));
		plist.add(new People("bbb", 44));
		plist.add(new People("ccc", 33));
		
		Stream<People> pstream = plist.stream();
		pstream.forEach(info -> System.out.println(info.getName()));
	}
}