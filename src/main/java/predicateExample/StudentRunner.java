package predicateExample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StudentRunner {

	public static void main(String[] args) {
	
		
		/*
		 * Student riya = new Student("Riya", 100); Student agni = new Student("Agni",
		 * 55.25); Student dheep = new Student("Dheep", 40);
		 * 
		 * List<Student> students = new ArrayList<Student>(); students.add(dheep);
		 * students.add(agni); students.add(riya);
		 */
		

			List<Student> studentlist = new ArrayList<Student>();
			studentlist.add(new Student("Riya", 100));
			studentlist.add(new Student("Agni", 35.25));
			studentlist.add(new Student("Dheep", 30));
			
		
			/*
			 * Predicate<Student> lessThan40 = list -> list.getPercentage()<40;
			 * 
			 * for(Student student : studentlist) {
			 * 
			 * if(lessThan40.test(student)) { System.out.println(student.getName()); }
			 * 
			 * }
			 */
		
		 // studentlist.forEach(input -> System.out.println(input));
		
		 

		Supplier<List<Student>>	studentSupplier = () -> studentlist;
		
		System.out.println(studentSupplier.get());
			
			
	}

}
