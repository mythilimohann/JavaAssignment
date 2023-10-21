package coreJavaAssignment.pragraAssignment.interfaces.notification;

import java.util.Scanner;

public class MainNotification {
    public static void main(String[] args) {
        EmailNotification mail = new EmailNotificationSender();
        mail.setRecipients("mm@gmail.com");
        mail.sendNotification("Happy birthday!!!");
        System.out.println();

        SMSNotification sms = new SMSNotificationSender();
        sms.setPhoneNumber(1234567890);
        sms.sendNotification("Hello, How are you?");
        System.out.println();

        PushNotification push = new PushNotificationSender();
        push.pushNotification("Laptop");
    }
}
