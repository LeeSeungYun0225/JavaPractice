package AnonymousInterface;

public class Home {
	
	private RemoteControl rc = new RemoteControl() {
		public void turnOn() {
			System.out.println("티비를 켭니다.");
		}

		@Override
		public void turnOff() {
			// TODO Auto-generated method stub
			System.out.println("티비를 끕니다.");
		}
		
	};
	
	public void turnOnTv()
	{
		rc.turnOn();
		rc.turnOff();
	}
	
	
	public void turnOnRadio() {
		RemoteControl rc1 = new RemoteControl() {
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("라디오를 끕니다");
				
			}@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("라디오를 켭니다.");
			}
		};
		
		rc1.turnOn();
		rc1.turnOff();
	}
	
	public void turnOnAircon(RemoteControl rc2)
	{
		rc2.turnOn();
		rc2.turnOff();
	}
}
