import java.util.ArrayList;

/**
 * Created by h205p2 on 9/26/17.
 */
public class Section {

    ArrayList<Person> students = new ArrayList<Person>();
    String name = "";
    int maxSize = 20;
    int currentSize = students.size();

    public Section (String name, Object teacher) {



    }



    public void addStudent(Person student) {

        students.add(student);

    }

    public void removeStudent(int id) {

        students.remove(Student.ID);

    }

    public void sectionSeatsRemaining() {

        System.out.println(maxSize - currentSize);

    }
}
