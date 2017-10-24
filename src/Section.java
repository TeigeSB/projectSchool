import java.util.ArrayList;

/**
 * Created by h205p2 on 9/26/17.
 */
public class Section {

    public ArrayList<Person> students = new ArrayList<Person>();
    String name = "";
    int maxSize;
    Object teacher;
    int currentSize = students.size();

    public Section (String name, Object teacher, int maxSize) {

        this.name = name;
        this.teacher = teacher;
        this.maxSize = maxSize;

    }



    public void addStudent(Person student) {

        students.add(student);
        currentSize = students.size();

    }

    public void removeStudent(String id) {

        for (int i = 0; i < students.size(); i ++) {
            if (students.get(i).firstName == (id)) {

                students.remove(Student.ID);
            }
        }
        currentSize = students.size();

    }

    public int sectionSeatsRemaining() {

        currentSize = students.size();
        return (maxSize - currentSize);


    }
}
