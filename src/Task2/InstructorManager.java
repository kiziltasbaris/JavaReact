package Task2;

public class InstructorManager  extends UserManager{

    @Override
    public void add(User user) {
        System.out.println("Tutors : "+user.getFullName() + " added");
    }
}
