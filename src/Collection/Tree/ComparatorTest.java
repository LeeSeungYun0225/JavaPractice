package Collection.Tree;

import java.util.TreeSet;

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Food> ts = new TreeSet<Food>(new FoodComparator());
		
		ts.add(new Food("파스타",11000));
		ts.add(new Food("리조또",9000));
		ts.add(new Food("피자",20000));
		
		
		for(Food f :ts)
		{
			System.out.println(f.name + f.price);
		}
	}

}
