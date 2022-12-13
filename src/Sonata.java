
public class Sonata extends Abstraction{

	private int carNumber;
	private String carColor;
	private int carSpeed;
	
	@Override
	public void acclerater() {
		// TODO Auto-generated method stub
		
		carSpeed++;
		System.out.println("carSpeed : " + carSpeed);
	}

	@Override
	public void brake() {
		
		carSpeed--;
		System.out.println("carSpeed : " + carSpeed);
		// TODO Auto-generated method stub
		
	}
	

}
