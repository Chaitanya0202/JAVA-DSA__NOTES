package factoryDesign2;

public class Driver {

	public static void main(String[] args) {
	    Notification email = NotificationFactory.getNotify("email");
        email.notifyUser();
        
        Notification sms = NotificationFactory.getNotify("sms");
        sms.notifyUser();
	}
}
