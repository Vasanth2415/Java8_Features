package methodReferenceExamples;

import java.util.function.Function;

public class ArbitraryObjectOfAnyType {

	public static void main(String[] args) {
	
		// Lambda atyle
		Function<String, String> lambda_lowerCase = input -> input.toLowerCase();
		System.out.println(lambda_lowerCase.apply("VASANTH"));
		
		// Method Reference style
		Function<String, String> metRef_lowerCase = String::toLowerCase;
		System.out.println(metRef_lowerCase.apply("DHEEP"));
		
		
		// lambda style
		Function<String, Integer>  lambda_count = input -> input.length();
		
		System.out.println(lambda_count.apply("DheepSai"));
		
		// Method reference
		Function<String, Integer>  metref_lambda_count = String::length;
		
		System.out.println(metref_lambda_count.apply("SaiDheep"));
		
		
		
	}

}
