package lamda;

import javax.swing.Action;

public class LamdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		action(new Calculable() {
			@Override
			public void calculate(int x, int y) {
				// TODO Auto-generated method stub
				System.out.println(x+y);
			}
		});
		
		action((x,y)->{
			System.out.println(x-y);
		});
		// 람다식은 일종의 익명 구현 객체
		// 함수형 프로그래밍을 위해 제공되는 기능
		// 데이터는 고정이고 데이터 처리부에 람다식을 어떻게 정의하느냐에 따라 결과가 달라져 다형성 발현 
		
		
		show(()->System.out.println("show"));
		show(()->{
			System.out.println("show2");
			System.out.println("show3");
		});
	}
	
	
	public static void show(Showable s)
	{
		s.show();
	}
	
	public static void action(Calculable cal)
	{
		int x=10;
		int y = 4;
		cal.calculate(x, y);
	}

}
