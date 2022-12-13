package Thread;

public class Task extends Thread{
	
	
	Task()
	{
		this.setName("Task Thread");
	}
	
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println(this.getName() + " >> " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
