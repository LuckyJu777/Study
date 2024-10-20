package chap6;
public class DmbCellPhone extends CellPhone{	//자식클래스
	int channel;
	
	DmbCellPhone(String model, String color, int channel){
		this.model = model;	//셀폰으로부터 상속받은 필드
		this.color = color;
		this.channel = channel;
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 dmb 방송 수신을 시작합니다.");
	}
	void turnChannalDmb() {
		System.out.println("채널" +channel+ "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("Dmb 방송 수신을 멈춥니다.");
	}
}