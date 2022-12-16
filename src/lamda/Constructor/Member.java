package lamda.Constructor;

public class Member {

	public String id;
	public String name;
	
	
	public Member(String id)
	{
		this.id = id;
		
	}
	
	public Member(String id,String name)
	{
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = "id : " + id + " / name : " + name;
		return str;
	}
}
