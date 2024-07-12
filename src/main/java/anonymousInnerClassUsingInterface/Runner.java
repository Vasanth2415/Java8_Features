package anonymousInnerClassUsingInterface;

public class Runner {

	public static void main(String[] args) {
		
		IParent object = new IParent() {

			@Override
			public void findPartner() {
				// TODO Auto-generated method stub
			System.out.println("I will find my partner from inner class");	
			}	
		};
	object.findPartner();
	
	}
}
