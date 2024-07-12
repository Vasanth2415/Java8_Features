package streamsAPI.CollectorsExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToListExample {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Agni", "Arya", "Riya");

		List<Integer> length = names.stream().map(String::length).collect(Collectors.toList());

		
		System.out.println(length);
	}

}
