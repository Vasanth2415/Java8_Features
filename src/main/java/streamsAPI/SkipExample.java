package streamsAPI;

import java.util.ArrayList;
import java.util.List;

public class SkipExample {

	public static void main(String[] args) {

		List<String> countries = new ArrayList<String>();

		countries.add("USSR");
		countries.add("USA");
		countries.add("CHINA");
		countries.add("INDIA");
		
		countries
		.stream()
		.skip(2)
		.forEach(System.out::println);	
	}

}
