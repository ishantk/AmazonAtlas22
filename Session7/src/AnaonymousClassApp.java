
abstract class Notification{
	
	abstract void notfiyUser(String message);
	
}

class ZomatoUser extends Notification{

	void notfiyUser(String message) {
		System.out.println("[ZomatoUser] A New Notification Received: "+message);
	}
	
}

public class AnaonymousClassApp {

	public static void main(String[] args) {
		
		Notification notification = new ZomatoUser();
		notification.notfiyUser("Your Order Has Been Delieved :)");
		
		
		// Anonymous class in Java
		Notification notification2 = new Notification() {
			
			void notfiyUser(String message) {
				System.out.println("[AnonymousClass] A New Notification Received: "+message);
			}
		};
		
		notification2.notfiyUser("Place Your Order on Weekend :)");

		// Anonymous Object
		new ZomatoUser().notfiyUser("This is Awesome :)");
		
	}

}
