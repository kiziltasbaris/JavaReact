package Task2;

public class Student extends User{

    private String education;

    public Student(int id, String fullName, String password, String email, String education) {
        super(id, fullName, password, email);
        this.education = education;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

}
