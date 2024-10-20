package Member.TestExample;

class Fish {
	private String name;	//물고기이름
	private int width; 		//가로cm
	
	public Fish (String iname, int iwidth) {
		name = iname;
		width = iwidth;
		catch(iname, iwidth);
	}
	
	public void catch() {
		System.out.println(name+"의 물고기를 낚았습니다." + width + "cm");
	}
}

public class Test3{
	public static void main(String[] args) {
		//물고기를 낚습니다. 어떤 물고기를 낚나요?
		Fish a = new Fish("참돔",23);
	}
}