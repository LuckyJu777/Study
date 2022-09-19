package toString;
public class Smart2Phone{
	private String company;
	private String os;
	
	public Smart2Phone(String company, String os) {
		this.company = company;
		
		
				this.os = os;
	}
	@Override
	public String toString() {
		return company + "," + os;
	}
	
}