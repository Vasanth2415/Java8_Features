package OptionalExample;

import java.util.Arrays;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
		Person adam = new Person ("Adam", 20,new Car("Civic", new Insurance("Geiko")));
		
		System.out.println(adam.getCarInsurance(adam));
		
		
		Person john = new Person("John", 30,null);
		
		System.out.println(john.getCarInsurance(john));
		
		
		List<Person> listOfPersons = Arrays.asList(adam,john);
		
	int result	= listOfPersons.stream().reduce(0,(total,person)-> total+person.getAge(),Integer::sum);

	
	System.out.println(result);
	}

}
