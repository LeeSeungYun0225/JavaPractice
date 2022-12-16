package lamda.Constructor;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		
		Member m = person.getMember2((x,y)->{
			return new Member(x,y);
		});
		
		Member m2 = person.getMember1(Member::new);
		
		
		System.out.println(m.id+m.name);
		System.out.println(m2.id);
		
	}

}
