package Task1;

public class Main {


    public static void main(String[] args) {

        Course course1 = new Course(1, "JavaScript", "Engin Demiroğ", 0);

        Course course2 = new Course(2, "C# + Angular", "Engin Demiroğ", 0);

        Course course3 = new Course(3, "Java + REACH", "Engin Demiroğ",48);

        Course [] courses = {course1,course2,course3};
        for (Course course : courses) {
            System.out.println(course.id +" "+ course.name + " " + course.mentor+" "+course.progress);
        }

        CourseManager courseManager = new CourseManager();

        courseManager.addToCourse(course1);

        courseManager.deleteCourse(course2);
    }

}
