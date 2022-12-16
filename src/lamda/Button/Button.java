package lamda.Button;

public class Button {


	private ClickListener cl;
	
	@FunctionalInterface
	public static interface ClickListener{
		void onClick();
	}
	
	public void setClickListener(ClickListener clickListener)
	{
		this.cl = clickListener;
	}
	
	public void click()
	{
		this.cl.onClick();
	}
	
}
