import java.util.ArrayList;

/**
 * Created by h205p2 on 9/26/17.
 */
public class Section {

    ArrayList<Person> students = new ArrayList<Person>();
    String name = "";
    int maxSize = 20;
    Object teacher;
    int currentSize = students.size();

    public Section (String name, Object teacher) {

        this.name = name;
        this.teacher = teacher;

    }



    public void addStudent(Person student) {

        students.add(student);
        currentSize = students.size();

    }

    public void removeStudent(int id) {

        students.remove(Student.ID);
        currentSize = students.size();

    }

    public void sectionSeatsRemaining() {

        System.out.println("There are " + currentSize + " students in the class, and " + (maxSize - currentSize) + " spots remaining.");


    }
}
