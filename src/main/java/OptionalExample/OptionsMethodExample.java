package OptionalExample;

import java.util.Optional;

import org.testng.annotations.Test;

public class OptionsMethodExample {
	@Test
	public void isPresentExample() {

		Optional<String> optional = Optional.of("Vasanth");

		System.out.println("Is Present example : " + optional.isPresent());

	}

	@Test
	public void isEmptyExample() {

		Optional<String> optional = Optional.of("Vasanth");

		System.out.println("Is Empty example : " + optional.isEmpty());

	}

	@Test
	public void ifPresentExample() {

		Optional<String> optional = Optional.of("vasanth");
		optional.ifPresent(str -> System.out.println("If present example :" + str.length()));
	}

	@Test
	public void orElseExample() {
		String name = null;
		String result = Optional.ofNullable(name).orElse("Vasanth");
		System.out.println("orElse Example :" + result);

	}

	@Test
	public void getExample() {

		Optional<String> optional = Optional.of("Vasanth");
		optional.ifPresent(ster -> System.out.println("Example of get" + optional.get()));
	}

	@Test
	public void orElseGetExample() {

		String name = "or Else GetExample Agni";
		name = null;
		String result = Optional.ofNullable(name).orElseGet(() -> "Agni is not present, so iam getting returned");
		System.out.println(result);
	}

	@Test
	public void orElseThrowExample() {

		String name = null;

		String result = Optional.ofNullable(name).orElseThrow(() -> new IllegalArgumentException());

		System.out.println(result);
	}

}
