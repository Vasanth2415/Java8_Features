package predicateChainingExamples;

import java.util.function.Predicate;

public class PredicateChainingExamples {

	Predicate <String> campusInterviewSelected;
	Predicate <String> degreeCompleted;
	Predicate <Boolean> opposite;
	
	public void orExample() {
		
		campusInterviewSelected = interviewInput -> interviewInput.equalsIgnoreCase("Yes");
		degreeCompleted = degreeInput -> degreeInput.equalsIgnoreCase("no");
		
		System.out.println("or Example can i join the company ?" +
		
		campusInterviewSelected.or(degreeCompleted).test("no"));
		
		
	}
	
	public void andExample() {
	
		campusInterviewSelected = interviewInput -> interviewInput.equalsIgnoreCase("Yes");
		degreeCompleted = degreeInput -> degreeInput.equalsIgnoreCase("Yes");
		
		System.out.println("And Example can i join the company ?" +
		
		campusInterviewSelected.and(degreeCompleted).test("yes"));
		
	}
	
	public void negateExample() {
		
		opposite = input -> input;
		
		System.out.println(opposite.negate().test(true));
	}
	
	
	public static void main(String[] args) {
		
		PredicateChainingExamples predicateChainingExamples = new PredicateChainingExamples();
		
		//predicateChainingExamples.andExample();
		
		predicateChainingExamples.orExample();
		
		

	}

}
