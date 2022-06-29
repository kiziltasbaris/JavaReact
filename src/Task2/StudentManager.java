package Task2;

public class StudentManager extends UserManager {

    @Override
    public void add(User user) {
        System.out.println("Yeni öğrenci "+user.getFullName() +" eklendi");
    }
}
