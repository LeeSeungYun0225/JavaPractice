package Collection.Tree;

import java.util.Comparator;

public class FoodComparator implements Comparator<Food>{
	@Override
	public int compare(Food o1, Food o2) {
		// TODO Auto-generated method stub
		return o1.price<o2.price ? -1 : o1.price == o2.price ? 0 : 1;
	}
}
