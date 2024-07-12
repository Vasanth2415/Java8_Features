package anonymousInnerClassUsingConcreteClass;

public class Runner {

	public static void main(String[] args) {
		
		
		Parent child = new Parent() {
			
			public void findPartner() {  // anonymous inner class
				
				System.out.println("My life my rules from anonymous inner class!!!");	
			}	
			};
	
	child.educate();
	child.findPartner();
	child.leaveAssets(); 
	
	Parent parent = new Parent();
	parent.findPartner();
	}
}
