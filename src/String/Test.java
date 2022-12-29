package String;

public class Test {
	public static void main(String[] args) {
		String str = new String("테스트");
		String strr = new String("테스트");
		String strr2 = "테스트".intern();
		
		System.out.println(str==strr);
		System.out.println(str==strr2);
		System.out.println(strr==strr2);
		
		System.out.println("strr & strr2는 서로 같은가? " + (strr.equals(strr2) && strr.hashCode()==strr2.hashCode()));
		System.out.println(strr.hashCode());
		System.out.println(strr2.hashCode());
		System.out.println("str & strr2는 서로 같은가? " + (str.equals(strr2) && str.hashCode() == strr2.hashCode()));
		
		System.out.println(str.hashCode());
		System.out.println(strr2.hashCode());
		
		StringBuilder stb = new StringBuilder("테스터~~");
		
		StringBuilder stb2 = stb;
		
		stb = stb.append("추가본");
		
		System.out.println("stb :" + stb);
		System.out.println("stb :" + stb2);
	}
	
	
	
}
