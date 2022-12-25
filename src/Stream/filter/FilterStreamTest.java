package Stream.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> list = new ArrayList();
		list.add(new Person("김승규",Sex.MALE));
		list.add(new Person("김승규",Sex.FEMALE));
		list.add(new Person("김승규",Sex.MALE));
		list.add(new Person("전태일",Sex.MALE));
		list.add(new Person("한상규",Sex.MALE));
		list.add(new Person("아무이",Sex.FEMALE));
		list.add(new Person("김승이",Sex.FEMALE));
		
		Stream<Person> stream = list.stream().filter((t)->t.getName().charAt(0)=='김').distinct();
		
		stream.forEach(t->System.out.println(t.getName() + " / " + t.getSex()));
		System.out.println();
		Stream<Person> stream2 = list.stream().filter((t)->{
			if(t.getSex()==Sex.MALE)
			{
				return true;
			}
			else
			{
				return false;
			}
		});
		
		stream2.forEach(t->System.out.println(t.getName() + " / " + t.getSex()));
	}

}
