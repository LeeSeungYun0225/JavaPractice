package lamda.Parameter;

import lamda.Parameter.Person.Speakable;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person();
		
		person.speak(new Speakable() {
			@Override
			public void speak(String name, String saying) {
				// TODO Auto-generated method stub
				System.out.println(name + "이 \"" + saying + "\"이라 말한다.");
			}
		});
		
		person.work((name,working)->{
			System.out.println(name+"가 " + working + "을 합니다.");
		});
	}

}
