import java.util.ArrayList;

/**
 * Created by h205p2 on 9/26/17.
 */
public class Section {

    ArrayList<Student> students = new ArrayList<Student>();
    String name = "";
    int maxSize = 20;
    int currentSize = students.size();

    public Section (String name, int maxSize, int currentSize, ArrayList<Student> students, Object teacher) {



    }



    public void addStudent(Student student) {

        students.add(student);

    }

    public void sectionSeatsRemaining() {

        System.out.println(maxSize - currentSize);

    }
}
