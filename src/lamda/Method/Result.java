package lamda.Method;

public class Result {
	
	public void getResult(Calculable cal)
	{
		int result = cal.calculate(10,20);
		System.out.println(" Result :: " + result);
	}
}
