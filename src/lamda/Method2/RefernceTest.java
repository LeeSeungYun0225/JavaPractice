package lamda.Method2;

public class RefernceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person();
		
		person.order((x,y)->x.compareToIgnoreCase(y));
		person.order(String::compareToIgnoreCase);
	}

}
