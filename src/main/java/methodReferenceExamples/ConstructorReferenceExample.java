package methodReferenceExamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class ConstructorReferenceExample {

	public static void main(String[] args) {

		// Batman, superman,Batman

		List<String> herosList = new ArrayList<String>();
		herosList.add("Batman");
		herosList.add("Superman");
		herosList.add("Splash");
		herosList.add("Batman");

		System.out.println(herosList);

		Set<String> herosSet = new HashSet<String>(herosList);

		System.out.println(herosSet);

		// lambda
		Function<List<String>, Set<String>> lambda_listToSet =

				list -> new HashSet<String>(list);

		System.out.println(lambda_listToSet.apply(herosList));

		// method referece with constructor
		Function<List<String>, Set<String>> mr_listToSet = HashSet::new;

		System.out.println(mr_listToSet.apply(herosList));

	}

}
