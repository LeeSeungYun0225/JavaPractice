
public class MethodTest {
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7};
		
		//System.out.println(sum2(1,2,3,4,5,6,7)); // 컴파일 에러 
		System.out.println(sum(1,2,3,4,5,6,7));
		System.out.println(sum(arr));
		System.out.println(sum2(arr));
		
		System.out.println(StaticTest.sum);
		System.out.println(StaticTest.sum2);
		
		
		
	}

	
	class StaticTest
	{
		static int staticvar = 123;
		static String name = "str";
		static String sum = staticvar+name;
		static String sum2;
		
		static{
			sum2 = staticvar+name;
		}
	}
	
	
	public static int sum(int ... values)
	{
		int sum = 0;
		
		for(int i=0;i<values.length;i++)
		{
			sum+= values[i];
			
		}
		return sum;
	}
	
	public static int sum2(int[] values)
	{
		int sum = 0;
		
		for(int i=0;i<values.length;i++)
		{
			sum+= values[i];
			
		}
		return sum;
	}

}

