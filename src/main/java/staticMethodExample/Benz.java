package staticMethodExample;

public class Benz implements Car {

	
public static void start() {
		
		System.out.println("Started from benz method");
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car.start();
		Benz.start();
	}

}
