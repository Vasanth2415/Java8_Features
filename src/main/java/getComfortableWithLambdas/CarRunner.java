package getComfortableWithLambdas;

public class CarRunner {

	
	public void classicalWay() {
		
		Car benz = new Benz();
		benz.start();
	}
	
	public void usingAnonymousInnerClass() { 
		// Starts from Benz class
		 //Benz Starts from inner class
		// start from lambda
		
		Car benz = new Car() {
			@Override
			public void start() {
				
				System.out.println(" Benz Starts from inner class");
			}
	
		};
		benz.start();
	}
	
	public void usingLambdas() {
		
		Car benz= () -> System.out.println("start from lambda");
		benz.start();
	}
	
	
	
	public static void main(String[] args) {
		
		CarRunner carRunner = new CarRunner();
		
		carRunner.classicalWay();
		carRunner.usingAnonymousInnerClass();
		carRunner.usingLambdas();
	}

}
