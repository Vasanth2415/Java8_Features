package streamsAPI;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExample {

	public static void main(String[] args) {
		
		List<String> status = Arrays.asList("SILENT","SHOUT","SILENT","SHOUT");
				
				boolean result = status.stream().anyMatch(String -> String.equalsIgnoreCase("Shout"));
				
				System.out.println(result);
			

	}

}
