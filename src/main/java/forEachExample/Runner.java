package forEachExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Runner {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 3, 5, 7, 9);

		// before 1.5
		for (int index = 0; index < list.size(); index++) {
			System.out.println(list.get(index));
		}

		System.out.println("========================");
		// from 1.5
		for (Integer listElements : list) {

			System.out.println(listElements);
		}
		System.out.println("========================");

		Consumer<Integer> consumer = input -> System.out.println(input);
		// from 1.8	
		// list.forEach(consumer);
		list.forEach(input -> System.out.println(input));
	}

}
