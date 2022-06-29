package Lesson2.Homework;

import Lesson2.Homework.User;

public class Instructor extends User {

  private   String department;

  public Instructor(){

  }

    public Instructor(String department) {
        this.department = department;
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
