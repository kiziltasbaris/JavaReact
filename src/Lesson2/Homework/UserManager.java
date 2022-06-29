package Lesson2.Homework;


public class UserManager {

    public void add(User user){
        System.out.println("Added ");
    }

    public void addMultiple(User[]users){

        for (User user:users) {
            add(user);
        }
    }
}
