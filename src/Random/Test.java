package Random;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = new Random().nextInt(5)+9999;
		
		
		System.out.println(a);
		
		int b = (int) (	Math.random()*5)+9999;
		
		System.out.println(b);
	}

}
