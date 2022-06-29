package Lesson2.Inheritance2;

public class EmailLogger extends Logger {


    @Override
    public void log(){

        System.out.println("Sent to Email");
    }
}
