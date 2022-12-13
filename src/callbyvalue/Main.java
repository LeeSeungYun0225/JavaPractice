package callbyvalue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test test = new Test();
		changeClass(test);
		test.printField();
	}
	
	
	public static void changeClass(Test test)
	{
		test.testfield = 4;
		test = new Test();
	}
}
