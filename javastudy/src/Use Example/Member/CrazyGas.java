package Member;

public class CrazyGas{
	int gas;
	
	void setGas(int gas){
	this.gas = gas;
	}
	
	boolean isLeftGas() {
	if(gas == 0 ) {
		System.out.println("gas가 없습니다.");
		return false;	//false를 리턴
		}
		
		System.out.println("gas가 있습니다");
		return true; //true를 리턴
	}
}