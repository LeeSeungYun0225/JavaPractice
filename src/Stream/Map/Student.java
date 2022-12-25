package Stream.Map;

import Stream.filter.Person;
import Stream.filter.Sex;

public class Student extends Person implements Comparable<Student>{

	private int age;
	
	public Student(String name,Sex sex,int age)
	{	
		super(name,sex);
		this.age = age;	
	}
	

	public int getAge() {
		return age;
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub

			if(this.age < o.age)
			{
				return 1;
			}
			else if(this.age == o.age)
			{
				return 0;
			}
			else
			{
				return -1;
			}
		

	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름 : " + this.getName() + " 성별 : " + this.getSex() + " 나이 : " + this.getAge();
	}
	
}
