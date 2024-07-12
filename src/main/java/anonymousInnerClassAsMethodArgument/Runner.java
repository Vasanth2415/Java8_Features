package anonymousInnerClassAsMethodArgument;

public class Runner {

	public static void main(String[] args) {
		
		Friend friend = new Friend();
		friend.canManage(new IManageable() {
			
			@Override
			public void manage() {
				System.out.println("Kalla vilunthuduven !!!");
				
			}
		});

	}

}
