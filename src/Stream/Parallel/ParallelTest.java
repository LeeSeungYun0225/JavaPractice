package Stream.Parallel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> scores = new ArrayList();
		
		for(int i=0;i<10000000;i++)
		{
			scores.add((int)(Math.random()*100));
		}
		
		double avg = 0.0;
		
		long startTime = 0;
		long endTime = 0;
		long time = 0;
		
		
		Stream<Integer> stream = scores.stream();
		
		startTime = System.currentTimeMillis();
		avg = stream.mapToInt(t->t.intValue()).average().getAsDouble();
		
		endTime = System.currentTimeMillis();
		
		System.out.println("avg : " + avg + " 소모 시간 : " + (endTime-startTime));
		
		Stream<Integer> stream2 = scores.parallelStream();
		
		startTime = System.currentTimeMillis();
		
		avg = stream2.mapToInt(t->t.intValue()).average().getAsDouble();
		endTime = System.currentTimeMillis();
		System.out.println("avg : " + avg + " 소모 시간 : " + (endTime-startTime));
		
		
	}

}
