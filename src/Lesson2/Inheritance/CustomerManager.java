package Lesson2.Inheritance;

import Lesson2.Inheritance.Customer;

public class CustomerManager {

    public void add(Customer customer){

        System.out.println(customer.customerNumber + "Saved");

    }


    //bulk insert
    public void addMultiple(Customer[]customers){
        for (Customer customer :customers){
            add(customer);
        }

    }

    // SOLID- Open Closed Principle

}
