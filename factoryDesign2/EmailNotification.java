package factoryDesign2;

public class EmailNotification implements Notification{
	public void notifyUser() {
		 System.out.println("Sending an Email Notification...");
	}
}
//Concrete class for SMS notification
class SMSNotification implements Notification {
 public void notifyUser() {
     System.out.println("Sending an SMS Notification...");
 }
}
//Concrete class for Push notification
class PushNotification implements Notification {
  public void notifyUser() {
      System.out.println("Sending a Push Notification...");
  }
}
