package Lesson1.OopIntroHomework1;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(1,"Baris","Kiziltas",88);

        Tutor tutor1=new Tutor (1,"Engin","Demirog","JavaTutorials");


       Student[]students= {student1};

        for (Student student:students) {
            System.out.println("Student name is :" + student.name);
        }

        Tutor[]tutors={tutor1};

        for (Tutor tutor:tutors) {
            System.out.println("Tutor name is :"+tutor.name);

        }

        StudentManager manager = new StudentManager();
        manager.addToInfo(student1);
        manager.uploadToInfo(student1);

    }
}
