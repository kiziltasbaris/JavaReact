package Lesson2.Homework;

public class StudentManager {

    public void add(Student student) {
        System.out.println("Added to studentManager");
    }

    public void removeToPoint(Student student) {
        System.out.println("remove to point " + student.getScore());

    }

    public void addMultiple(Student[] students) {

        for (Student student : students) {
            add(student);
        }


    }
}
