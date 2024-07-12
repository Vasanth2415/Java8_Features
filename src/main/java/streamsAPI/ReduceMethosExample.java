package streamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceMethosExample {

	public static void main(String[] args) {
		
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
		
		/*
		 * int sum =0;
		 * 
		 * for (Integer integer : numbers) {
		 * 
		 * sum += integer;
		 * 
		 * } System.out.println(sum);
		 */
		
	int result	= 	numbers
			.stream()
			.reduce(0, (sum,elements)->sum+elements);
		
	System.out.println(result);
		
	Optional<Integer> max =numbers.stream().reduce(Integer::max);
	//Optional<Integer> max =numbers.stream().reduce((num1,num2)->Math.max(num1, num2));
	
	System.out.println(max);
	
	Optional<Integer> min =numbers.stream().reduce(Integer::min);
	//Optional<Integer> min =numbers.stream().reduce((num1,num2)->Math.min(num1, num2));
	
	System.out.println(min);
	
	
	long count =	numbers.stream().count();

	System.out.println(count);
	
	}
	

}
