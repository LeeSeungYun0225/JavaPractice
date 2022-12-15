package Collection.Set;

public class Member {
	
	public String name;
	public int num;
	
	public Member(String name,int num)
	{
		this.name = name;
		this.num = num;
	}
	
	
	@Override
	public int hashCode()
	{
		
		return name.hashCode()+num ;
	}
	
	@Override
	public boolean equals(Object object)
	{
		if(object instanceof Member)
		{
			Member m = (Member) object;
			return (this.name.equals(m.name)) && (this.num == m.num);
		}
		else
		{
			return false;
		}
	}
}
