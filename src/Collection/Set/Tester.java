package Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Set<String> set = new HashSet<String>();
//		
//		set.add("te");
//		set.add("le");
//		set.add("te");
//		
//		System.out.println(set.size());
//		
		
		
		Set<Member> set = new HashSet<>();
		
		set.add(new Member("김규",10));
		set.add(new Member("아무개",20));
		set.add(new Member("김규",10));
		
		System.out.println(set.size());
		
		for(Member e :set) {
			System.out.println(e.name);
		}
		
		Iterator<Member> i = set.iterator();
		
		while(i.hasNext())
		{
			
			if(i.next().name.equals("김규"))
			{
				i.remove();
			}
		}
		System.out.println(set.size());
		
	}

}
