public class ReDmbCellPhone{
	int channel;
	
	ReDmbCellPhone(String model, String color, int channel){
		this.model = model;					//CellPhone으로부터 상속받은 필드 인데 왜 빨간줄?
		this.color = color;
		this.channel = channel;
	}
	
	//method
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 Dmb 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel + "번으로 바꿉니다.");
	}
	void turnOff() {
		System.out.println("DMB방송 수신을 멈춥니다.");
	}
}