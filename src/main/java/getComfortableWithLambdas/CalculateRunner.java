package getComfortableWithLambdas;

public class CalculateRunner {


	public void usingClassicalWay() {
		
		Calculate calculate = new CalculatorImpl();
		System.out.println("Classical way :"+ calculate.add(5, 10));
				
	}
	 public void usingAnonymousClass() {
		 
		 Calculate calculate = new Calculate() {
			
			@Override
			public int add(int num1, int num2) {
				
				return num1+num2;
			}
		};
	System.out.println("using anonymous class: "+calculate.add(6, 3));
	 }
	
	 
	 public void usingLambdas() {
		 
	Calculate calc	=(int val1, int val2) -> {return val1 + val2;}; 
	System.out.println("From lambdas: "+ calc.add(6, 8));
	 }
	 
	
	
	public static void main(String[] args) {
		
		CalculateRunner calculateRunner = new CalculateRunner();
		calculateRunner.usingClassicalWay();
		calculateRunner.usingLambdas();
		calculateRunner.usingAnonymousClass();
		
		
		
	}

}
