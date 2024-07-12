package biFunctionExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class Runner {

	public static void main(String[] args) {

		// firstname, lastname -> fullname

		BiFunction<String, String, String> fullName = (firstName, lastName) -> firstName + " " + lastName;
		System.out.println(fullName.apply("Vasanth", "kumar"));

		// number 1,number 2 -> average

		BiFunction<Integer, Integer, Number> average = (number1, number2) -> (number1 + number2) / 2.0;

		System.out.println(average.apply(4, 3));

		// Bat , Super, Wonder
		// man , man , woman
		// batman, superman,wonderwoman

		List<String> list1 = Arrays.asList("Bat", "Super", "Wonder");
		List<String> list2 = Arrays.asList("Man", "Man", "Woman");

		List<String> supers = new ArrayList<String>();

		BiFunction<List<String>, List<String>, List<String>> justiceLeague =

				(n1, n2) -> {
					for (int index = 0; index < list1.size(); index++) {

						supers.add(list1.get(index) + list2.get(index));
					}
					return supers;
				};
		System.out.println(justiceLeague.apply(list1, list2));

	}
}
