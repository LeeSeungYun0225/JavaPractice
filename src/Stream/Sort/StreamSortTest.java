package Stream.Sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import Stream.Map.Student;
import Stream.filter.Person;
import Stream.filter.Sex;


public class StreamSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> list = new ArrayList();
		
		list.add(new Student("김기유",Sex.MALE,15));
		list.add(new Student("이수용",Sex.MALE,20));
		list.add(new Student("진달래",Sex.FEMALE,17));
		list.add(new Student("전영우",Sex.MALE,19));
		
		Stream<Student> stream = list.stream();
		
		stream.sorted(Comparator.reverseOrder()).forEach(t->System.out.println(t.getName()+ " / " + t.getAge()));
		// Student클래스에 Comparator 인터페이스를 상속하여 compareTo메소드를 재정의했기 때문에 비교 가능 
		
		List<Person> list2 = new ArrayList();
		
		list2.add(new Person("김가윤",Sex.FEMALE));
		list2.add(new Person("이을동",Sex.MALE));
		list2.add(new Person("연성규",Sex.FEMALE));
		list2.add(new Person("홍대광",Sex.MALE));
		list2.add(new Person("아이유",Sex.FEMALE));
		list2.add(new Person("손흥민",Sex.MALE));
		
		Stream<Person> stream2 = list2.stream();
		
		stream2.sorted((o1,o2)->o1.getName().compareTo(o2.getName())).forEach(t->System.out.println(t.getName()));
		// Comparable 인터페이스를 상속하지 않은 클래스의 경우
		// Comparator(함수형 인터페이스)를 람다식으로 재정의 하여 사용 
		
		
	}

}
