package Task2;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(1, "Baris Kiziltas", "123456", "kiziltasbaris7@gmail.com", "College");

        Instructor instructor1 = new Instructor(2, "Engin Demirog", "78910", "ed@gmail.com", "Advanced");

        StudentManager studentManager = new StudentManager();
        studentManager.add(student1);

        InstructorManager instructorManager = new InstructorManager();

        instructorManager.add(instructor1);
    }
}
