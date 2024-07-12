package defaultMethodsExample;

public class FireFox implements Browser {

	
	@Override
	public void browse() {
		System.out.println("Firefox browse");
		
	}
	

	
	public static void main(String[] args) {
	
		Browser firefox = new FireFox();
		 firefox.playMedia();
		
		
		
	}

	

}
