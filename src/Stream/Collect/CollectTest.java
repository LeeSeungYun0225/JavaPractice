package Stream.Collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Stream.filter.Person;
import Stream.filter.Sex;

public class CollectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> list = new ArrayList();
		
		list.add(new Person("김미미",Sex.FEMALE));
		list.add(new Person("김홍홍",Sex.MALE));
		list.add(new Person("얌얌이",Sex.FEMALE));
		list.add(new Person("녕녕이",Sex.MALE));
		
		list.add(new Person("암무무",Sex.MALE));
		
		
		
		// 리스트 필터링 & 수집 
		List<Person> maleList = list.stream()
				.filter(t->t.getSex()==Sex.MALE)
				.collect(Collectors.toList());
		
		
		System.out.println(maleList);
		
		
		// 리스트를 맵으로 수집 
		Map<String,Sex> map = list.stream()
				.collect(Collectors.toMap(
						t->t.getName(),
						t->t.getSex()
					
		));
		
		System.out.println(map);
		
		
		// 리스트를 리스트로 필터링 & 수집 
//		List<Person> femaleList = list.stream().filter(t->t.getSex() == Sex.FEMALE).toList();
		//자바16부터 제공되는 기능 
		
		
		Map<Sex,List<Person>> map2 = list.stream().collect(Collectors.groupingBy(t->t.getSex()));
		
		System.out.println(map2.get(Sex.FEMALE));
		
		
		System.out.println(list.stream()
				.collect(Collectors.groupingBy(t->t.getSex(),Collectors.counting())));
	}

}
