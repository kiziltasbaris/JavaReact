package Lesson2.Homework;

public class InstructorManager extends UserManager {


    public void deleteToName(Instructor instructor) {
        System.out.println("added to name " + instructor.getName());
    }

    public void addMultiple(Instructor[] instructors) {

        for (Instructor instructor : instructors) {
            add(instructor);
        }


    }
}
