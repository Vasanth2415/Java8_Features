package streamsAPI;

import java.util.Arrays;
import java.util.List;

public class AllMatchExample {

	public static void main(String[] args) {
		
		List<String> status = Arrays.asList("SILENT","SHOUT","SILENT","SHOUT");
		
		boolean result = status.stream().allMatch(String -> String.equalsIgnoreCase("Silent"));
		
		System.out.println(result);

	}

}
