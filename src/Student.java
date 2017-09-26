/**
 * Created by h205p2 on 9/26/17.
 */
public class Student extends Person {

    String firstName = "";
    String lastName = "";
    int grade;

    public Student(String firstName, String lastName, int ID, int grade) {

        super(firstName, lastName, ID);
        grade = grade;

    }

}
