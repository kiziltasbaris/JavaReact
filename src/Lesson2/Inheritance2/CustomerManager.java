package Lesson2.Inheritance2;

public class CustomerManager {


    public void add(Logger logger){

        System.out.println("Added to customer");


    }

    public void addMultiple(Logger[]loggers){
        for (Logger logger:loggers) {
            add(logger);
        }
    }
}
