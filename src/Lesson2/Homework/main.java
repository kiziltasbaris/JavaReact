package Lesson2.Homework;

public class main {

    public static void main(String[] args) {

        Student student1=new Student();
        student1.setId(1905);
        student1.setName("Baris");
        student1.setSurname("Kiziltas");
        student1.setClas('B');
        student1.setScore(95);

        Student[]students={student1};

        for (Student student:students) {
            System.out.println(student1.getName() + student1.getSurname());

        }

        Instructor instructor1=new Instructor("Math");

        Instructor[]instructors={instructor1};

        for (Instructor instructor:instructors) {
            System.out.println("Tutor department : " + instructor.getDepartment());
        }


        UserManager manager = new UserManager();
        manager.addMultiple(students);
        manager.addMultiple(instructors);





    }
}
