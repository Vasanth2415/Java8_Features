package biPredicateExample;

import java.util.function.BiPredicate;

public class Runner {

	public static void main(String[] args) {
		
		// lastname should not be empty 
		
		BiPredicate<String, String> pred1 = (firstName,lastName) -> {
			return lastName.length()>0;
			
		};
		System.out.println(pred1.test("Vasan", "Kumar"));
		
		// check equality of given two strings
		
		BiPredicate<String, String> pred2 = (String1,String2) ->{
			
			return String1.equals(String2);
		};
		System.out.println(pred2.test("vas", "VAS"));
		
		
		// check equality ignore case
		
		BiPredicate<String, String> pred3 = (input1,input2) ->{
			
			return input1.equalsIgnoreCase(input2);
		};
		
		System.out.println(pred3.test("Vasa", "VASA"));
	}

}
