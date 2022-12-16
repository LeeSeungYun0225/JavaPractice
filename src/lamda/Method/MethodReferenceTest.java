package lamda.Method;

public class MethodReferenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Result r = new Result();
		
		r.getResult(Math::max);
		// 둘은 서로 같다. 
		r.getResult((x,y)->Math.max(x, y));
	}

}
