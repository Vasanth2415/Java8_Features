package streamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

	public static void main(String[] args) {
		
		List<String> DC = Arrays.asList("BatMan","SuperMan","Splash");
		List<String> Marvel = Arrays.asList("Captain America","Iron Man","Spider Man");
		List<String> XMen = Arrays.asList("Wolverine","Magneto","Professor X");
		
		List<List<String>> supes =Arrays.asList(DC,Marvel,XMen);
		
		System.out.println(supes);
		
		List<String> singleList =supes.stream().flatMap(List::stream)
		.collect(Collectors.toList());
		
		System.out.println(singleList);
		
 
	}

}
