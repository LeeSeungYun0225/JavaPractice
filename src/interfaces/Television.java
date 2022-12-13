package interfaces;

public class Television implements RemoteControl {
	
	private static Television tv = new Television();
	private int volume=0;
	private int volumeTemp;
	public static Television getInstance()
	{
		return tv;
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV 켜기");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV 끄기");
	}

	@Override
	public void setVolume(int in) {
		// TODO Auto-generated method stub
		if(in <=RemoteControl.MAX_VOLUME && in >= RemoteControl.MIN_VOLUME)
		{
			volume = in;
			System.out.println("현재 볼륨 : " + volume);
		}
		
	}
	
	@Override
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		if(mute)
		{
			volumeTemp = volume;
			RemoteControl.super.setMute(mute);
		}
		else
		{
			volume = volumeTemp;
			RemoteControl.super.setMute(mute);
			setVolume(volume);
			
		}
		
	}

}
