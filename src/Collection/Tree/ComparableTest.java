package Collection.Tree;

import java.util.TreeSet;

public class ComparableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeSet<Person> t = new TreeSet();
		
		t.add(new Person("이승윤",30));
		t.add(new Person("김수지",26));
		t.add(new Person("홍길동",99));
		t.add(new Person("김송이",15));
		t.add(new Person("이순신",120));
		
		for(Person p :t)
		{
			System.out.println(p.name + p.age);
		}
	}

}
