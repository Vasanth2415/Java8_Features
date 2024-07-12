package streamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDistinct {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Vasanth","Loga","Dheep","Vasanth","Jaya");
		
		
	//names =	names.stream().distinct().collect(Collectors.toList());
		
		//System.out.println(names);
		
		names.stream().distinct().forEach(System.out::println);

	}

}
