
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import data.test.Animal;
import data.test.Car;

public class JavaGeneric {
	
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		show(list);
		
		ArrayList<Number> list2 = new ArrayList<Number>();
		
		show(list2);
		
		
	}
	
	public static void show(ArrayList<?> list)
	{
		System.out.println(list.toString());
	}
	
}
