package lamda.Button;

import lamda.Button.Button.ClickListener;

public class ButtonTest {
	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setClickListener(new ClickListener(){
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("버튼이 클릭되었습니다");
			}
		});
		
		Button btn2 = new Button();
		
		btn2.setClickListener(()->System.out.println("버튼2번이 클릭되었습니다."));
		
		btn2.click();
		btn.click();
		
	}
}
