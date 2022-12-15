package Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new HashMap();
		
		map.put("김수지", 20);
		map.put("김규동", 22);
		map.put("기무동", 44);
		
		System.out.println(map.get("김수지"));
		
		map.put("김수지",500);
		
		System.out.println(map.get("김수지"));
		System.out.println(map.size());
		
		Set<String> keySet = map.keySet();
		
		Iterator<String> keyI = keySet.iterator();
		
		while(keyI.hasNext())
		{
			String temp;
			temp = keyI.next();
			System.out.println(temp + " " + map.get(temp));
		}
		
		
		Set<Entry<String,Integer>> eSet = map.entrySet();
		
		Iterator<Entry<String,Integer>> entryI = eSet.iterator();
		
		while(entryI.hasNext())
		{
			Entry<String,Integer> e = entryI.next();
			System.out.println(e.getKey() + e.getValue());
		}
		
	}

}
