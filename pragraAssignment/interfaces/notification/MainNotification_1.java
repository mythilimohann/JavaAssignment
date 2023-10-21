package coreJavaAssignment.pragraAssignment.interfaces.notification;

import java.util.Scanner;

public class MainNotification_1 {
    public static void main(String[] args) {
        String mailId;
        String message;
        int mobNum;
        EmailNotification mail = new EmailNotificationSender();
        Scanner scan = new Scanner(System.in);
        //if(mail.getClass().getSimpleName().equalsIgnoreCase("EmailNotificationSender")) {
            System.out.print("Enter mail ID of recipients in the comma seperated format: ");
            mailId = scan.next();
            System.out.print("Enter the message: ");
            message = scan.next();
            mail.setRecipients(mailId);
            mail.sendNotification(message);
        //}

        SMSNotification sms = new SMSNotificationSender();
        //if (sms.getClass().getSimpleName().equalsIgnoreCase("SMSNotificationSender")) {
            System.out.print("Enter the phone number of the recipient: ");
            mobNum = scan.nextInt();
            System.out.print("Enter the message: ");
            message = scan.next();
            sms.setPhoneNumber(mobNum);
            sms.sendNotification(message);
        //}

        PushNotification push = new PushNotificationSender();
        push.pushNotification("Laptop");
    }
}
