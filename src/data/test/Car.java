package data.test;

public class Car<T extends StringBuilder> {
	
	private T car_name;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public Car(T in) {
		// TODO Auto-generated constructor stub
		car_name = in;
		
		
	}
	
	public void setCar_name(T car_name) {
		this.car_name = car_name;
	}
	
	public T getCar_name() {
		return car_name;
	}
	
	public void append(T in)
	{
		car_name = (T) car_name.append(in);
	}

}
