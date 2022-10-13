package Test;

public class ArrayLT{
	private int Enter1;
	private int Enter2;
	
	private int second;
	
	ArrayLT(){
	//얘네는 여기 안에 넣어두면 그냥 호출이 되버린다.
	}
	
	void ArrayLT1(int Eneter1){
		this.setMain(Eneter1);
	}
	void ArrayLT2(int Enter2){
		this.setMain(Enter2);
	}

	public int getMain() {	
		System.out.println("getter의 메인" + Enter1);
		return Enter1;
	}
	
	public int getMain2() {	
		System.out.println("getter2의 메인" + Enter2);
		return Enter2;
	}
	
	public int getServe() {
		System.out.println("geeter의 서브");
		return second;	//스트링으로 second 반환
	}
	
	public void setMain(int Enter1) {
		this.Enter1 = Enter1;
		System.out.println("Setter의 메인" + Enter1);
	}
	
	public void setMain2(int Enter2) {
		this.Enter2 = Enter2;
		System.out.println("Sette2의 메인" + Enter2);
	}
	
	public void setServe(int second) {
		this.second = second;
		System.out.println("Setter의 서브");
	}

}