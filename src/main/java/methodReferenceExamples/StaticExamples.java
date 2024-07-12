package methodReferenceExamples;

@FunctionalInterface
interface IAdd{
	
	public void add(int num1,int num2);
}

public class StaticExamples {
	
	public static void sum(int val1,int val2) {
		
		System.out.println(val1+val2);
	}
	
	public static void main(String[] args) {
	
	//	StaticExamples.sum(1, 4);
		
		IAdd iAdd = StaticExamples::sum;
		iAdd.add(2, 4);		
	}

}
