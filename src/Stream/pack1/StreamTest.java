package Stream.pack1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new HashSet();
		
		for(int i=0;i<1000;i++)
		{
			set.add("홍길동"+i);
		}
		
		
		
		
		// 내부 반복자 :: Stream 
		Stream<String> stream = set.stream();
		
		stream.forEach(name -> System.out.println(name));
		
		// 내부반복자는 병렬 처리에 유리함 
		
		
		//내부 반복자 내부에서 여러 스레드를 이용해 병렬 처리 가능
		Stream<String> stream2 = set.parallelStream();
		stream2.forEach(name -> System.out.println(name + ": " + Thread.currentThread().getName()));
		// 코어의 갯수만큼 스레드가 생성됨
		// 요소의 수가 적을 때는 단일 스레드가 유리,
		// 요소의 수가 많아질 수록 멀티 스레드 환경에서 병렬 처리하는 것이 유리 :: 스레드를 생성하는 데 자원 소모되기 때문 
		// 순서대로 처리해야 할 경우에도 병렬 처리 X 
		
		
		// 외부반복자 :: for문 
//		for(String item : set)
//		{
//			System.out.println(item);
//		}
		
		
		// 외부 반복자 :: Iterator 클래스 
//		Iterator<String> iter = set.iterator();
//		
//		while(iter.hasNext())
//		{
//			String item = iter.next();
//			System.out.println(item);
//		}
	}

}
