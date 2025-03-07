package factoryDesign2;

public class NotificationFactory {

	public static Notification getNotify(String getType) {

		if (getType == null || getType.isEmpty()) {
			return null;
		}

		switch (getType.toLowerCase()) {
		case "email": {
			return new EmailNotification();
		}
		case "sms": {
			return new SMSNotification();
		}
		case "push": {
			return new PushNotification();
		}
		default:
			throw new IllegalArgumentException("Unexpected Type: " );
		}
	}
}
