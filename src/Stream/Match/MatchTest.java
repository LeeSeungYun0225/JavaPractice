package Stream.Match;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import Stream.Map.Student;
import Stream.filter.Sex;

public class MatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList();
		
		list.add(new Student("김기유",Sex.MALE,15));
		list.add(new Student("이수용",Sex.MALE,20));
		list.add(new Student("진달래",Sex.FEMALE,17));
		list.add(new Student("전영우",Sex.MALE,19));
		
		Stream<Student> st = list.stream();
		
		
		boolean bool = false;
		bool = st.anyMatch(t->t.getAge()>19);
		System.out.println("19세를 넘는 사람이 하나라도 있는가? " + bool);
		
		st = list.stream();
		
		bool = st.noneMatch(t->t.getAge()>20);
		System.out.println("20세를 아무도 넘지 않는가?" + bool);
		
		st = list.stream();
		bool = st.allMatch(t->t.getAge()>20);
		System.out.println("모두 20세를 넘는가?" + bool);
		
		
	}

}
