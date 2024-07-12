package defaultMethodsExample;

public class Chrome implements Browser{

	
	@Override
	public void browse() {
		System.out.println("Chrome browse");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Browser chrome = new Chrome();
		 chrome.playMedia();
		
		
	}








	

}
