package Collection.Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new Hashtable();
		Map<String,Integer> map2 = new HashMap();
		
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<1000;i++)
				{
					map2.put("key"+i, i);
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=1000;i<2000;i++)
				{
					map2.put("key"+i, i);
				}
			}
		});
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(map2.size());
	}

}
