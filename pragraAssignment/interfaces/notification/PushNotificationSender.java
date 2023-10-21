package coreJavaAssignment.pragraAssignment.interfaces.notification;

public class PushNotificationSender implements PushNotification{
    @Override
    public void sendNotification(String message) {

    }

    @Override
    public void pushNotification(String device) {
        System.out.println("Notification pushed to "+device);
    }
}
