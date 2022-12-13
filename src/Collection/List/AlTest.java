package Collection.List;

import java.util.ArrayList;
import java.util.List;

public class AlTest implements ListTester{
	
	
	
	
	
	public long checkTimes(int n)
	{
		List<Integer> l = new ArrayList();
		long start = System.currentTimeMillis();
		
		for(int i=0;i<n;i++)
		{
			l.add(0,n);
		}
		
		long end = System.currentTimeMillis();
		
		
		System.out.println("ArrayList : " + ( end-start) );
		return end-start;
	}
	
	
}
