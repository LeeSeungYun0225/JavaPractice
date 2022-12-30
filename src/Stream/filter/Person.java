package Stream.filter;

public class Person {
	private String name;
	private Sex sex;
	
	public Person(String name, Sex sex) {
		this.name = name;
		this.sex = sex;
		// TODO Auto-generated constructor stub
	}
	
	public Sex getSex()
	{
		return this.sex;
	}
	public String getName()
	{
		return this.name;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode()+sex.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Person)
		{
			return ((Person) obj).name.equals(this.name) && ((Person)obj).sex==this.sex ? true : false;
		}
		else
		{
			return false;
		}
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "NAME : " + name + " / SEX : " + sex;
	}
}
