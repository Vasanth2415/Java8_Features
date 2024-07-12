package functionExamples;

import java.util.function.Function;

public class Runner {

	public void lambdaStyle() {
		
	Function<Integer, Double> usd2Inr =	usd -> usd*81.5;
	System.out.println(usd2Inr.apply(11));
	
	
	}
	
	public void usingAnonymous() {
		
		Function<Integer, Double> usd2Inr = new Function<Integer, Double> (){

			@Override
			public Double apply(Integer usd) {
				
				return usd*81.5;
			}
		};
		System.out.println(usd2Inr.apply(13));
	}
	
	
	public void askRockyLambdaAStyle() {
		
	Function<String, String> askRocky=question -> "intha ulagam";
	System.out.println(askRocky.apply("Enna Thanda Venum Unakku"));
		
		
	}
	
	
	public static void main(String[] args) {
		
		/*
		 * RockyBhai bhai = new RockyBhai(); String answer =
		 * bhai.ask("Enna thanda venum unakku"); System.out.println(answer);
		 */
		Runner runner = new Runner();
		runner.lambdaStyle();
		runner.usingAnonymous();
		runner.askRockyLambdaAStyle();
		

	}

}
