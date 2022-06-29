package Lesson2.Inheritance;

public class main {

    public static void main(String[] args) {


        IndividualCustomer customer = new IndividualCustomer();
        customer.customerNumber="1324";



        CorporateCustomer customer1= new CorporateCustomer();
        customer1.customerNumber="123432";


        unionCustomer customer2=new unionCustomer();
        customer2.customerNumber="1234";


        CustomerManager manager = new CustomerManager();

      /*  manager.add(customer);
        manager.add(customer1);
        manager.add(customer2);
      */

        Customer[]customers={customer,customer1,customer2};

        manager.addMultiple(customers);



    }
}
