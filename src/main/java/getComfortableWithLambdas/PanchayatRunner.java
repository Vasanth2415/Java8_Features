package getComfortableWithLambdas;

public class PanchayatRunner {

	public void usingClassicalWay() {
		
		IPanchayat panchayat = new PanchayatImpl();
		System.out.println("Classical Way :"+ 
		panchayat.interrogate("ponna kaiya pudichi iluthiya"));
	}
	
	public void usinganonymousClass() {
		
		IPanchayat  panchayat = new IPanchayat() {
			
			@Override
			public String interrogate(String question) {
				
				return "Enna" +question;
			}
		};
		System.out.println("Anonymous Class: "
		+panchayat.interrogate("ponna kaiya pudichi iluthiya?"));
	
	}
	
	public void usingLambdas() {
		
		IPanchayat panchayat = question -> "Enna "+ question;
		System.out.println(panchayat.interrogate("ponna kaiya pudichi iluthiya?"));
	}
	
	public static void main(String[] args) {
	
		PanchayatRunner panchayatRunner = new PanchayatRunner();
		panchayatRunner.usinganonymousClass();
		panchayatRunner.usingClassicalWay();
		panchayatRunner.usingLambdas();
		
	}

}
