//tv싫지만 tv로 해보자 
package Member;

public class Tvtest {
	public static void main(String[] args) {
		Tv t = new Tv();
		t.channel = 7;
		t.channelup();
		System.out.println("현재 채널은 " + t.channel + "입니다.");
	
	
	}
}