package Lesson3;

public class CustomerManager {

    public void add(Customer customer){
        System.out.println("added to customer : " + customer.getFirstName());

    }
    public void delete(Customer customer){
        System.out.println("deleted to customer : " + customer.getLastName());

    }

}
