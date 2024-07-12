package streamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyVsFindFirst {

	public static void findFirstExample() {
		
	List<String> elements =	Arrays.asList("one","two","three","four","five");
	
Optional<String>  firstElement = elements.parallelStream().findFirst();
		
	System.out.println(firstElement.get());	
	}
	
	
 public static void findAnyExample() {
		
	 List<String> elements =Arrays.asList("one","two","three","four","five");
		
	 Optional<String>  firstElement =	elements.parallelStream().findAny();
	 		
	 	System.out.println(firstElement.get());	
	 	}
		
		
	
	
	
	
	public static void main(String[] args) {
		
		findFirstExample();
		findAnyExample();
	}

}
