package interfaces;

public interface RemoteControl {
	//추상 메소드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	public void turnOn();
	void turnOff();
	void setVolume(int in);
	
	default void setMute(boolean mute)
	{
		if(mute)
		{
			
			System.out.println("무음처리");
			setVolume(MIN_VOLUME);
		}
		else
		{
			System.out.println("무음해제");
		}
		
	}
}
