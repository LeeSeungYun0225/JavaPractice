package Collection.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest implements SyncTestable{
	@Override
	public int getResult() {
		// TODO Auto-generated method stub
		
		List<Integer> l = new ArrayList();
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<1000;i++)
				{
					l.add(i);
				}
			}
			
		});
		
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=1000;i<2000;i++)
				{
					l.add(i);
				}
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join(); //메인 스레드가 먼저 종료되는 것을 방지 
			t2.join();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return l.size();
	}
}
