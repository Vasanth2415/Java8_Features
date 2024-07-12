package streamsAPI.CollectorsExample;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ToCollectionExample {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Agni", "Arya", "Riyan", "Aryan");

		List<String> result = names.stream().filter(name -> name.length() > 4)
				.collect(Collectors.toCollection(LinkedList::new));
		
		System.out.println(result);

	}

}
