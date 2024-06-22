package com.core.Factorydesign.Pattern.Demo;

public class NotificationService {
	public static void main(String[] args)
	{
		NotificationFactory notificationFactory = new NotificationFactory();
		Notification notification = notificationFactory.createNotification("SMS");
		//Notification notificationEmail = notificationFactory.createNotification("EMAIL");
		notification.notifyUser();
		//notificationEmail.notifyUser();
	}
}

