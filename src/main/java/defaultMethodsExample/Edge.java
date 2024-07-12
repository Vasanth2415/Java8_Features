package defaultMethodsExample;

public class Edge implements Browser {

	
	@Override
	public void browse() {
		System.out.println("Edge browse");
		
	}
	
	
	public static void main(String[] args) {

		Browser edge = new Edge();
		 edge.playMedia();
		
		
	}

	

}
