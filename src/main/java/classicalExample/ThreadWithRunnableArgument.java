package classicalExample;

public class ThreadWithRunnableArgument {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable()
		{

		
			public void run() {
				
				for(int i=0;i<5;i++) 
					
					System.out.println("anonymous inner class method argument example");
			}	
			
		});
		thread.start();
	}

}
