package functionExamples;

import java.util.function.Function;

public class MoreFunctionExample {
	
	
	
	public void findSquare() {
		
		Function<Integer, Integer> square=input -> input*input;
		System.out.println(square.apply(4));
		
	}

	public void usingAnonymous() {
		
		Function<Integer, Integer> square = new Function<Integer,Integer>(){

			@Override
			public Integer apply(Integer input) {
				// TODO Auto-generated method stub
				return input*input;
			} 	
		};
		System.out.println(square.apply(6));
	}
	
	public void countTheLetters() {
		
		Function<String,Integer> length =givenString -> givenString.length();
		
		System.out.println(length.apply("Vasanth"));
		
	}
	
	
	public void myAnonymous() {
		
		Function<String, Integer> length = new Function<String, Integer>() {

			@Override
			public Integer apply(String givenString) {
				// TODO Auto-generated method stub
				return givenString.length();
			}
				
			};
		
		System.out.println(length.apply("Mohan"));
			
	}
	
	public void convertToUpperCase() {
		
	Function<String, String>toUpperCase = inputString->inputString.toUpperCase();
	System.out.println(toUpperCase.apply("vasanthan"));
		
	}
	
	public void myAunonymous2() {
		
		Function<String, String> toUpperCase = new Function<String, String>(){

			@Override
			public String apply(String inputString) {
				// TODO Auto-generated method stub
				return inputString.toUpperCase();
			}
			
		};
	System.out.println(toUpperCase.apply("dhhepsai"));
	
	}
	
	public void checkEmpty() {
		
		
		Function<String, Boolean> empty=inputString->inputString.isEmpty()||inputString
				.isBlank()||inputString.equals("");
		System.out.println(empty.apply("Kumar"));
		
	}
	
	public void checkEmptyAnonymous() {
		
		Function<String, Boolean> empty = new Function<String, Boolean>(){

			@Override
			public Boolean apply(String inputString) {
				// TODO Auto-generated method stub
				return inputString.isEmpty()||inputString
						.isBlank()||inputString.equals("");
			}
		};
		System.out.println(empty.apply(" "));
	}
	
	
	public static void main(String[] args) {


		MoreFunctionExample example = new MoreFunctionExample();
		example.findSquare();
		example.usingAnonymous();
		example.countTheLetters();
		example.myAnonymous();
		example.convertToUpperCase();
		example.myAunonymous2();
		example.checkEmpty();
		example.checkEmptyAnonymous();
	}

}
