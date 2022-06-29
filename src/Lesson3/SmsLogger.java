package Lesson3;

public class SmsLogger implements Logger {


    @Override
    public void log(String message) {

        System.out.println("Sent to Sms : "+ message);
    }


}
