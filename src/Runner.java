/**
 * Created by h205p2 on 9/26/17.
 */
public class Runner {

    public void main (String arg[]) {

        Person Micheal = new Student("Micheal", "Johnson", 11);
        Person Eric = new Teacher("Eric", "Ericson", "English");
        Section English = new Section("English", Eric);
        English.addStudent(Micheal);
        System.out.println(English.currentSize);


    }

}
