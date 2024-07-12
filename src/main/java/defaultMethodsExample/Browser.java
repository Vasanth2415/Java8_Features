package defaultMethodsExample;


@FunctionalInterface
public interface Browser {

	void browse();
	default void playMedia() {
		
		System.out.println("Browser media Player");
	}
	
}
