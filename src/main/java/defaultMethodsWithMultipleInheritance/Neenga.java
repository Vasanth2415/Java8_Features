package defaultMethodsWithMultipleInheritance;

public class Neenga implements IThagappar,IAalu {

	
	public void joinCollege() {
		
		IThagappar.super.joinCollege();
	}

	
	public static void main(String[] args) {
		
		IThagappar neenga = new Neenga();
		neenga.joinCollege();
		
		
	}

}
