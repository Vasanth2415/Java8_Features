package streamsAPI.CollectorsExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToUnModifiableListExample {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Agni", "Arya", "Riyan", "Aryan");
		
	List<Integer> length = 	names.stream().map(String::length).collect(Collectors.toUnmodifiableList());

	System.out.println(length);
	
	length.add(5);
	System.out.println(length);
	
	
	}

}
