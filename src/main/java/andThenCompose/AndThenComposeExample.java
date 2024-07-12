package andThenCompose;

import java.util.function.Function;

public class AndThenComposeExample {

	public static void main(String[] args) {

		Function<String, String> tenth = study -> {
			System.out.println("finish tenth std first");
			return "";
		};

		Function<String, String> eleventh = study -> {

			System.out.println("study 11 th next");
			return "";
		};

		tenth.andThen(eleventh).apply("study");

		System.out.println("=================");
		tenth.compose(eleventh).apply("study");

	}

}
