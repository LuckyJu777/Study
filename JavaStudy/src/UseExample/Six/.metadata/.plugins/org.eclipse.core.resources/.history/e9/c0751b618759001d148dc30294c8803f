package Six;

public class Member {
	public static void main(String[] args) {
		Memberlogin membercontroller = new Memberlogin();
		
		boolean result = membercontroller.login("hong", "12345");
		
		if(result){
			System.out.println("로그인 되었습니다.");
			membercontroller.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지않습니다.");
		}
	}
}