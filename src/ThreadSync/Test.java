package ThreadSync;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shared sharedObject = Shared.getInstance();
		
		
		
		Thread t1 = new Thread() {
			
			public void run()
			{
				while(true)
				{
					sharedObject.getNum();
					sharedObject.setNum2();
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
				
			}
		};
		
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				while(true)
				{
					sharedObject.getNum();
					sharedObject.setNum1();
					
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			
			}
		});
		
		t1.start();
		t2.start();
		
		while(true)
		{
			System.out.println(t1.getState() + " / " + t2.getState());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
