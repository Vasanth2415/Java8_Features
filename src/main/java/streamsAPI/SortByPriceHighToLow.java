package streamsAPI;

import java.util.Comparator;

public class SortByPriceHighToLow implements Comparator<Mobile2> {

	@Override
	public int compare(Mobile2 o1, Mobile2 o2) {
		
		return o2.getPrice()-o1.getPrice();
	}

	

}
