package Thread;

import java.awt.Toolkit;

public class Test {
	
	public static void main(String[] args) {
		
		Thread cur = Thread.currentThread();
		
		System.out.println(cur.getName());
		
		
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				

				for(int i=0;i<100;i++)
				{
					System.out.println("t1 >> " + i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
			
		});
		
		Thread t2 = new Thread() {
			public void run()
			{
				for(int i=0;i<100;i++)
				{
					System.out.println("t2 >> " + i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		
		Thread t3 = new Thread(new Work());
		Thread t4 = new Task();
		
		
		t.start();
		t2.start();
		t3.start();
		t4.start();
		for(int i=0;i<100;i++)
		{
			
			try {
				t.join();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			System.out.println("t1 : >> " + t.getState());
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
