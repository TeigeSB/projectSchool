/**
 * Created by h205p2 on 9/26/17.
 */
public class Teacher extends Person {

    static int ID = 0;
    String firstName = "";
    String lastName = "";
    String subject = "";

    public Teacher(String firstName, String lastName, String subject, int ID) {

        super(firstName, lastName, this.ID);
        subject = this.subject;

    }

    static void addID() {

        ID += 1;

    }

}
