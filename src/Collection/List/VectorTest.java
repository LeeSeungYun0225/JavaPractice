package Collection.List;

import java.util.List;
import java.util.Vector;

public class VectorTest implements SyncTestable{
	@Override
	public int getResult() {
		
		Vector<Integer> v = new Vector();
		
		Thread t1 = new Thread() {
			
			public void run()
			{
				for(int i=0;i<1000;i++)
				{
					v.add(i);
				}
			}
		};
		Thread t2 = new Thread() {
			
			public void run()
			{
				for(int i=1000;i<2000;i++)
				{
					v.add(i);
				}
			}
		};
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		// TODO Auto-generated method stub
		return v.size();
	}
	
}
