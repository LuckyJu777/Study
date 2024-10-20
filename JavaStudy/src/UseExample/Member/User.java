package Member;
public class User{
	private String id;
	private String pass;	//왜 프라이빗?
	
	public String getId() {	//string 라턴타입 getid
		return id;			
	}
	
	public void setId(String id) {	//리턴타입이 없는 setId
		this.id = id;				//
	}
	
	public String getPass() {
		return pass;
	}
	
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public User(String id, String pass) {
	    this.id = id;
	    this.pass = pass;
	}
}