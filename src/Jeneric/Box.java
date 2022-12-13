package Jeneric;

public  class Box <T> {
	
	
	private T t;
	
	public T get()
	{
		return t;
		
	}
	
	public void set(T t)
	{
		this.t = t;
	}
	
	public <T> Box<T> boxing(T t)
	{
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}	
}
