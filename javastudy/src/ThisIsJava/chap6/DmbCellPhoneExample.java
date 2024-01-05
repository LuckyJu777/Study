package chap6;
public class DmbCellPhoneExample{
	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰","black",10);
		
		System.out.println("모델 : " +dmbCellPhone.model);
		System.out.println("컬러 : " +dmbCellPhone.color);
	
		System.out.println("채널 : " +dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("신주형입니다.");
		dmbCellPhone.receiveVoice("신주형입니다.");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.turnChannalDmb();
		dmbCellPhone.turnOffDmb();
	}
}