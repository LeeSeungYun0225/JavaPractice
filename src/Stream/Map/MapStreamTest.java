package Stream.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import Stream.filter.Sex;

public class MapStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Student> list = new ArrayList();
		
		list.add(new Student("김기유",Sex.MALE,15));
		list.add(new Student("이수용",Sex.MALE,20));
		list.add(new Student("진달래",Sex.FEMALE,17));
		list.add(new Student("전영우",Sex.MALE,19));
		
		IntStream ageStream = list.stream().mapToInt(t->t.getAge());
		
		
		
		Stream<Integer> integerStream = ageStream.boxed();
		integerStream.forEach((t)->System.out.println("BOXED" + t));
		// 한번 사용한 스트림은 자동으로 closed되므로 참조하지 못함

	
		LongStream ageLongStream = list.stream().mapToLong(t->t.getAge());
		ageLongStream.forEach((t)->System.out.println(t));
		
		
		
		// 문자열을 분리하여 스트림으로 
		List<String> strList = new ArrayList();
		strList.add("hi hello bye");
		strList.add("today yesterday tommorow");
		
		String str = "hello";
		
		strList.stream().flatMap(t->Arrays.stream(t.split(" ")))
		.forEach(w->{
			if(w.equals(str))
			{
				System.out.println(w);
			}
		});
		
		
		// 문자열을 분리하여 숫자 스트림으로 
		List<String> strList2 = Arrays.asList("10 , 20, 30","40, 50");
		strList2.stream().flatMapToInt((t)->{
			String[] arr = t.split(",");
			for(int i=0;i<arr.length;i++)
			{
				System.out.println("문자열" +  arr[i].trim());
			}
			
			int[] intArr = new int[arr.length];
			for(int i=0;i<intArr.length;i++)
			{
				intArr[i] = Integer.parseInt(arr[i].trim());
			}
			return Arrays.stream(intArr);
			
		}).forEach(n->System.out.println(n));;
		
		
		
//		List<Person> list2 = new ArrayList();
//		list2.add(new Person("김기유",Sex.MALE));
//		list2.add(new Person("이수용",Sex.MALE));
//		list2.add(new Person("진달래",Sex.FEMALE));
//		list2.add(new Person("전영우",Sex.MALE));
//		list2.add(new Person("규현",Sex.FEMALE));
//		list2.add(new Person("성연",Sex.MALE));
//		
//		Stream<Student> nameStream = list2.stream().map((t,r)->
//		{
//			r= t;
//			return r;
//		});
	}

}
