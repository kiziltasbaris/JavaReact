package Task2;

public class Instructor  extends User{

    private String experience;

    public Instructor(int id, String fullName, String password, String email, String experience) {
        super(id, fullName, password, email);
        this.experience = experience;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}
