package Stream.Loop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import Stream.Map.Student;
import Stream.filter.Sex;

public class LoopStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> list = new ArrayList();
		
		list.add(new Student("김기유",Sex.MALE,15));
		list.add(new Student("이수용",Sex.MALE,20));
		list.add(new Student("진달래",Sex.FEMALE,17));
		list.add(new Student("전영우",Sex.MALE,19));
		
		Stream<Student> stream = list.stream();
		
		IntStream ist = stream.filter(t->{
			return t.getAge()>10 ? true : false;
		})
		.peek(t->System.out.println(t.getName())).peek(t->System.out.println(t.getSex()))
		.peek(t->System.out.println(t.getAge())).mapToInt(t->t.getAge());;
		
		
		ist.forEach(t->System.out.println("AGE " + t));
		
		
		
		
	}

}
