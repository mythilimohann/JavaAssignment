package coreJavaAssignment.pragraAssignment.interfaces.notification;

public class SMSNotificationSender implements SMSNotification{
    private int num;
    @Override
    public void sendNotification(String message) {
        System.out.println("To: "+num);
        System.out.println("Message: "+message);
        System.out.println("SMS notification sent to "+num);
    }

    @Override
    public void setPhoneNumber(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
