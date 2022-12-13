package ThreadSync;

public  class Shared {
	private  static Shared s = new Shared();
	private int num = 0;
	
	public synchronized int getNum() {
		
		notify();
		Thread t = Thread.currentThread();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(t.getName() + " >>> " + num);
		
		try
		{
			wait();
		}catch(InterruptedException e)
		{
			
		}
		return num;
	}
	
	public synchronized void setNum(int num) {
		this.num = num;
	}
	
	public static Shared getInstance()
	{
		
		return s;
	}
	
	
	public void setNum1()
	{
		num=100;
	}
	
	public void setNum2()
	{
		num=200;
	}
}
