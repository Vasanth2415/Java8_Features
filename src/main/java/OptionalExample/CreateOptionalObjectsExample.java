package OptionalExample;

import static org.testng.Assert.assertTrue;

import java.util.Optional;

import org.testng.annotations.Test;

public class CreateOptionalObjectsExample {

	@Test
	public void testUsingEmpty() {
		
	Optional<String> empty = Optional.empty();
	assertTrue(empty.isEmpty());
	
		 
	}
	
	@Test(enabled = false)
	public void testUsingOf() {
		
		String name ="Vasanth";

		
	Optional<String> nonNullable =	Optional.of(name);
	assertTrue(nonNullable.isPresent());
	
	}

	@Test
	public void usingOfNullable() {
		String name = "Agni";
		name = null;
	Optional<String> nonNullable	= Optional.ofNullable(name);
	assertTrue(nonNullable.isEmpty());
	}
}
