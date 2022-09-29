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
		power =! power;
	}
	
	void channelup() {
		channel++;
	}
	
	void channeldown() {
		channel--;
	}
}
