package Jeneric;

public class NumberCom {
	
	public static <T extends Number> boolean compare(T t1,T t2)
	{
		
		System.out.println("compare " + t1.getClass().getSimpleName() + " & " + t2.getClass().getSimpleName());
		
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return v1==v2;
	}
}
