package interfaces;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl re = Television.getInstance();
		re.turnOn();
		re.turnOff();
		re.setVolume(5);
		
		
		re.setMute(true);
		re.setMute(false);
	}

}
