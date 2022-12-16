package lamda.Return;

public class ReturnTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person();
		
		p.action((x,y)->{
			
			return x+y;
		});
		
		Compute com = new Compute();
		
		p.action(Compute::staticAdder);
		p.action(com::instanceX);
	}

}
