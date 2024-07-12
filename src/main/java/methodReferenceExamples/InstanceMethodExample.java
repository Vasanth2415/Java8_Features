package methodReferenceExamples;

@FunctionalInterface
interface IVanakkam{
	
	public void vanakkam(String name);
}


public class InstanceMethodExample {
	
	public void greet(String name) {
		
		System.out.println("Vanakkam "+name);
	}

	public static void main(String[] args) {
		
		//IVanakkam iVanakkam = (name)-> System.out.println("Vanakkam :"+ name);
		
		InstanceMethodExample example = new InstanceMethodExample();
	IVanakkam iVanakkam =	example::greet;
	iVanakkam.vanakkam("Vasanthan");	
	
	}

}
