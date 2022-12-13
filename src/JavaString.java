
public class JavaString {
	public static void main(String[] args)
	{
		
		StringBuilder strB = new StringBuilder("hello");
		
		
		
		
		String abc = "문자열";
		String str = new String("문자열");
		String bcd = "문자열";
		
		abc+="테스트입니다";
		System.out.println(bcd==abc?"equal":"not equal");
		
		
		System.out.println(bcd.intern()==str.intern()?"equal":"not equal");
	
		System.out.println(bcd==abc?"equal":"not equal");

		
		System.out.println(str==abc?"equal":"not equal");
		System.out.println(str.equals(abc));
		
		str=  str+" Today";
		
		String strr = new String("hello");


		
		StringBuilder strB = new StringBuilder("hello");
		strB=  strB.append(" today");
		
	}
}
