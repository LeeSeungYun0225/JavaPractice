package Anonymous;

public class test {

	public static void main(String[] args) {
	
		
		Car car1 = new Car();
		car1.run();
		
		car1.run1();
		car1.run2(new Tire() {
			@Override
			public void roll() {
				// TODO Auto-generated method stub
				System.out.println("익명 타이어 4번 굴러갑니다");
			}
		});
		
}}