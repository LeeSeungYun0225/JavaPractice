package Collection.Tree;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts = new TreeSet();
		
		ts.add(77);
		ts.add(100);
		ts.add(20);
		ts.add(15);
		ts.add(52);
		ts.add(64);
		
		for(Integer i:ts)
		{
			System.out.println(i);
		}
		
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.lower(88));
		System.out.println(ts.higher(50));
		System.out.println(ts.floor(77));
		System.out.println(ts.ceiling(75));
		System.out.println();
		
		// 내림차순 정렬 
		NavigableSet<Integer> des = ts.descendingSet();
		for(Integer s:des)
		{
			System.out.println(s);
		}
		
		System.out.println();
		
		// 범위 검색 tailSet / headSet 
		NavigableSet<Integer> range = ts.tailSet(50,true);//50이상의 요소만(true/false는 50을 포함하는지) 
		for(Integer i:range)
		{
			System.out.println(i);
		}
		
		System.out.println();
		
		//범위 검색 
		range = ts.subSet(50, true, 90, false);//50보다 같거나 크고, 90보다 작은 것들 
		for(Integer i:range)
		{
			System.out.println(i);
		}
		
	}

}
