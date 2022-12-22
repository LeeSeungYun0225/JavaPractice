package Stream.pipeline;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PipelineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> list = new ArrayList();
		
		for(int i=0;i<100;i++)
		{
			list.add(new Student(i));
		}
		
		
		// 전체 평균
		Stream<Student> stream = list.stream();
		IntStream istream = stream.mapToInt((student) -> student.getScore()); //return문임을 인지 
		
		double avg = istream.average().getAsDouble();
		
		System.out.println(avg);
		
		
		//위와 동일 메소드 체이닝 
		double avg2 = list.stream().mapToInt(student->student.getScore()).average().getAsDouble();
		System.out.println(avg2);
//		Stream<Student> stream2 = list.stream();
//		IntStream istream2 = stream2.mapToInt((student) -> 
//		{
//			int result = student.getScore();	
//			
//			if(result>50)
//			{
//				return result;
//			}
//			else
//			{
//				return 50;
//			}
//		});
//		
//		double avg2 = istream2.average().getAsDouble();
//		
//		System.out.println(avg2);
		
		
		
		//김씨만 필터링해 출력 
		List<Person> list2 = new ArrayList();
		
		list2.add(new Person("김홍도"));
		list2.add(new Person("김성주"));
		list2.add(new Person("이무개"));
		list2.add(new Person("변사또"));
		list2.add(new Person("안혜영"));
		list2.add(new Person("김귤"));
		
		Stream<Person> st = list2.stream();
		st.forEach((person)->{
			if(person.getName().charAt(0) == '김')
			{
				System.out.println(person.getName());
			}
		});
		
		
		//배열을 이용한 스트림
		int[] arr = {0,1,2,3,4,5};
		
		IntStream ist = Arrays.stream(arr);
		// ist = IntStream.of(arr);
		ist.forEach(i -> System.out.println(i));
		
		
		//범위 스트림
		IntStream ist2 = IntStream.range(0, 6);
		ist2.forEach(i->System.out.println(i));
		
		IntStream ist3 = IntStream.rangeClosed(0, 6);
		ist3.forEach(i->System.out.println(i));
		
		
		
		
		//파일로 부터 스트림 가져오기
		try {
			Path path = Paths.get(PipelineTest.class.getResource("price.txt").toURI());
			Stream<String> stream4  = Files.lines(path,Charset.defaultCharset());
			stream4.forEach(line -> System.out.println(line));
			stream4.close();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
