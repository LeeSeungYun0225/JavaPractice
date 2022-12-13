import java.util.Calendar;

public class EnumTest {
	public static void main(String[] args)
	{
		Os os2 = Os.UNIX;
		Os os3 = Os.valueOf("UNIX");
		
		System.out.println(os3);
		
	}
	
	public enum Os{
		WINDOW("윈도우"),
		LINUX("리눅스"),
		UNIX("유닉스");
		
		private final String osName;
		
		Os(String string) {
			osName = string;
			// TODO Auto-generated constructor stub
		}
		
		public String getOsName() {
			return osName;
		}
	}
}
