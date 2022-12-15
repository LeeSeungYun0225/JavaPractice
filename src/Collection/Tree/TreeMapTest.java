package Collection.Tree;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String,Integer> tm = new TreeMap();
		
		tm.put("사과", 20);
		tm.put("파인애플", 15);
		tm.put("딸기",25);
		tm.put("포도", 5);
		
		// 엔트리 출력하기 
		Set<Entry<String,Integer>> es = tm.entrySet();
		for(Entry<String,Integer> e:es){
			System.out.println(e.getKey() + e.getValue());
		}
		
		//특정 키에 대한 값 가져오기 
		Entry<String,Integer> e = null;
		e = tm.firstEntry();
		System.out.println("첫 엔트리 :" + e.getKey() + e.getValue());
		e = tm.lastEntry();
		System.out.println("마지막 엔트리 :" + e.getKey() + e.getValue());
		e = tm.lowerEntry("배");
		System.out.println("배 보다 앞 엔트리 :" + e.getKey() + e.getValue());
		
		//내림차순 정렬하기
		NavigableMap<String,Integer> ds = tm.descendingMap();
		Set<Entry<String,Integer>> dss = ds.entrySet();
		for(Entry<String,Integer> ee:dss)
		{
			System.out.println(ee.getKey() + ee.getValue());
		}
		
		
		// 범위 검색
		NavigableMap<String,Integer> range = tm.subMap("사", true, "하", false);
		for(Entry<String,Integer> ee:range.entrySet())
		{
			System.out.println(ee.getKey()+ee.getValue());
		}
	}

}
