package Anonymous;

public class Car {
	private Tire tire1 = new Tire();
	private Tire tire2 = new Tire() {
		@Override
		public void roll() {
			// TODO Auto-generated method stub
			System.out.println("익명 타이어2번 굴러갑니다.");
		}
	};
	
	
	public void run() {
		tire1.roll();
		tire2.roll();
	}
	
	
	public void run1()
	{
		Tire tire = new Tire() {
			@Override
			public void roll() {
				// TODO Auto-generated method stub
				System.out.println("익명 타이어3번 굴러갑니다.");
			}
			
		};
		
		tire.roll();
	}
	
	public void run2(Tire tire)
	{
		tire.roll();
	}
}
