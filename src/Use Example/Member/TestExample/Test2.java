package Member.TestExample;

class Tv{static String channel = "0번";
}

class Ap{
	String channel = "9번";
}

public class Test2{
	public static void main(String[] args) {
		Ap ap;
		ap = new Ap();
		System.out.println(ap.channel);
		ap.channel = "1번";
		
		Ap p = new Ap();
		p.channel = "2번";
		
		System.out.println(Tv.channel);
		System.out.println(ap.channel);
		System.out.println(p.channel);
	}
}
