package lamda.Method2;

public class Person {

	
	public void order(Comparable comparable)
	{
		String x=  "홍길동";
		String y = "김홍도";
		
		int result = comparable.compare(x, y);
		
		if(result >0)
		{
			System.out.println(x + "는 " + y +"보다 " + "뒤에 옵니다.");
		}
		else if(result ==0)
		{
			System.out.println(x + "는 " + y + " 와 같습니다" );
		}
		else
		{
			System.out.println(x + "는 " + y +"보다 " + "앞에 옵니다.");
		}
	}
	
}
