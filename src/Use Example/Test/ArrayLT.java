package Test;

public class ArrayLT{
	private int first;
	private int second;
	
	ArrayLT(){
		
	}
	
	ArrayLT(int first){
		this();
	}
	public int getMain() {	
		return first;
	}
	
	public int getServe() {
		return second;	//스트링으로 second 반환
	}
	
	public void setMain(int first) {
		this.first = first;
	}
	public void setServe(int second) {
		this.second = second;
	}
}