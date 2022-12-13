package Collection.List;

import java.util.LinkedList;
import java.util.List;

public class LlTest implements ListTester {
	
	@Override
	public long checkTimes(int n) {
		// TODO Auto-generated method stub
		List<Integer> l = new LinkedList();
		
		
		
		long start = System.currentTimeMillis();
		
		for(int i=0;i<n;i++)
		{
			l.add(0,n);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("LinkedList : " + ( end-start) );
		return end-start;
	}
}
