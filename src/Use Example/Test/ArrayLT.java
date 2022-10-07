package Test;

public class ArrayLT{
	private String first;
	private int second;
	private char third;
	private boolean fourth;
	
	ArrayLT(){
		
	}
	
	ArrayLT(String first){
		this();
	}
	public String getMain() {	
		return first;
	}
	
	public int getServe() {
		return second;	//스트링으로 second 반환
	}
	
	public char getthird() {
		return third;
	}
	
	public boolean getfourth() {
		return fourth;
	}
	
	public void setMain(String first) {
		this.first = first;
	}
	public void setServe(int second) {
		this.second = second;
	}
	public void setthird(char third) {
		this.third = third;
	}
	public void setfourth(boolean fourth) {
		this.fourth = fourth;
	}
}