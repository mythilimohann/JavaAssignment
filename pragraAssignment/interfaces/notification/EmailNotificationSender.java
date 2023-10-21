package coreJavaAssignment.pragraAssignment.interfaces.notification;

public class EmailNotificationSender implements EmailNotification{
    private String id;
    @Override
    public void setRecipients(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("To: "+id);
        System.out.println("Message: "+message);
        System.out.println("Email notification sent to "+id);
    }
}
