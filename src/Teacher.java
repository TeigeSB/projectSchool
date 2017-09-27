/**
 * Created by h205p2 on 9/26/17.
 */
public class Teacher extends Person {

    static int IDt = 0;
    String firstName = "";
    String lastName = "";
    String subject = "";

    static void addID() {

        IDt += 1;
        System.out.println(IDt);

    }

    public Teacher(String firstName, String lastName, String subject) {

        super(firstName, lastName, IDt);

        subject = this.subject;

    }

}
