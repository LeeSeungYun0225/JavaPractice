package Stream.Aggregate;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AggregateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//스트림 집계 함수 -최종 처리 기능 
		// 대부분 OptionalXXX타입의 클래스 리턴 
	
		int[] arr=  {1,2,3,4,5,6,7,8,9};
		
		long count = Arrays.stream(arr) 
			.filter(n->n>5)
			.count();
		System.out.println("5보다 큰 숫자의 수 " + count);
		
		
		long sum  = Arrays.stream(arr)
				.filter(n->n>5)
				.sum();
		
		System.out.println("5보다 큰 수의 합 : " + sum);
		
		double avg = Arrays.stream(arr)
				.filter(n->n>5)
				.average()
				.getAsDouble();
		
		System.out.println("5보다 큰 수의 평균 : " + avg);
		
		
		int max = Arrays.stream(arr)
				.filter(n->n>5)
				.max()
				.getAsInt();
		
		
		
		
		// OptionalXXX클래스를 사용하여 집계값이 있을때, 없을때, 별도로 처리하고자 할 때 나누어서 수행 가능
		OptionalDouble opDouble = Arrays.stream(arr).average();
		//isPresent() : 집계값이 있을때 true
		if(opDouble.isPresent())
		{
			System.out.println("평균 : " + opDouble.getAsDouble());
		}
		else
		{
			System.out.println("평균 : "  + 0.0);
		}
		
		
		double avg2 = Arrays.stream(arr).average().orElse(0.0);
		System.out.println("평균 : " + avg2);
		//ifPresent: 집계값이 있을때 처리 방식을 직접 정의 
		Arrays.stream(arr).average().ifPresent(t->System.out.println("평균 : " + t));
		
		
		
	}

}
