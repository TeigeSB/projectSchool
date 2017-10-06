import java.util.ArrayList;

/**
 * Created by h205p2 on 9/26/17.
 */
public class Person {

    String firstName = "";
    String lastName = "";
    static int ID = 0;

    public Person(String firstName, String lastName, int ID) {

        firstName = this.firstName;
        lastName = this.lastName;
        ID = this.ID;

    }


    public static ArrayList<Student> studentList = new ArrayList<Student>();
    public static ArrayList<Teacher> teacherList = new ArrayList<Teacher>();

    public void idAdd() {

        ID += 1;
        System.out.println(ID);


    }



}
