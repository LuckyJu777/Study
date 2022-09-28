package Member;

public class Tv{
	int screen;
	int channel;
	int remotecontrol;
	boolean power;
	
	void poweron() {
		//screen on
		if(power) {
			power = false;
		} else {
			power = true;
		}
	}
	
	void poweroff() {
		//screen off
	}
	
	void channelup() {
		//channel change
	}
	
	void channeldown() {
		//down
	}
}
