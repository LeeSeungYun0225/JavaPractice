package AnonymousInterface;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Home home = new Home();
		
		
		home.turnOnTv();
		
		home.turnOnRadio();
		
		home.turnOnAircon(new RemoteControl() {
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("에어컨을 끕니다");
				
			}@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("에어컨을 끕니다.");
			}
		});
	}

}
