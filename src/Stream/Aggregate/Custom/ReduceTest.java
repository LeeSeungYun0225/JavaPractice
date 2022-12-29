package Stream.Aggregate.Custom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Stream.filter.Person;
import Stream.filter.Sex;
import Stream.pipeline.Student;

public class ReduceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//커스터마이징 가능한 집계함수 reduce(매개값은 BinaryOperator<T>)
		// BInaryOperator인터페이스의 apply추상메소드 재정의
		// apply메소드는 매개값 x,y를 이용해 리턴값 R을 리턴함 
		// 람다식에서 (x,y) 앞에 0,(x,y)-> 와 같이 작성하면 집계값이 없는 경우 기본값 0이라는 의미 
		// 기본값이 있는 경우 apply메소드는 OptionalXXX객체를 리턴하지 않고 T/int/long/double 형태로 리턴함
		
		int[] arr = {1,2,6,4,5,6,7};
		
		
		int max = Arrays.stream(arr)
			.reduce((x,y)->{
				if(x>y)
				{
					return x;
				}
				else if(x<y)
				{
					return y;
				}
				else
				{
					return x;
				}
				
			}).getAsInt();
		
		System.out.println("최대값 : " + max );
		
		
		
		List<Person> list = new ArrayList();
		
		list.add(new Person("김개똥",Sex.FEMALE));
		list.add(new Person("김수미",Sex.FEMALE));
		list.add(new Person("안녕송이",Sex.MALE));
		list.add(new Person("허경영",Sex.MALE));
		list.add(new Person("백준표",Sex.FEMALE));
		list.add(new Person("정선미",Sex.FEMALE));
		list.add(new Person("이명박",Sex.FEMALE));
		Person ps = new Person("박근혜",Sex.FEMALE);
		
		Person longNamePerson= list.stream()
				.reduce(ps,(x,y)->x.getName().length()>y.getName().length()? x : y);
		//기본값 ps, 리턴값 x OR y 
		//기본값이 있는 경우 getXXX메소드를 사용하지 않아도 된다 .
		
		System.out.println("이름이 가장 긴 사람은 " + longNamePerson.getName() + " 입니다.");
		
		

	}

}
