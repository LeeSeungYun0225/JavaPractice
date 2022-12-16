package lamda.Return;



public class Person {
	public void action(Calculable calculable)
	{
		double result = calculable.calculate(10,5);
		System.out.println(result);
	}
}
