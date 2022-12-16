package lamda.Parameter;

public class Person {
	
	public void speak(Speakable speakable)
	{
		speakable.speak("김김","먼저 퇴근함세");
	}
	
	public void work(Workable workable)
	{
		workable.work("이이","야근");
	}
	
	@FunctionalInterface
	interface Speakable{
		public void speak(String name,String saying);
	}
	
	@FunctionalInterface
	interface Workable{
		public void work(String name,String working);
	}
}
