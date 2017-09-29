/**
 * Created by h205p2 on 9/26/17.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    String inp = "";

    static void parseName(boolean teach, String inp) {

        String[] arr = {};

        arr = inp.split(" ");

        String str1 = arr[0];
        String str2 = arr[1];
        int str3 = Integer.valueOf(arr[2]);

        if (!teach) {
            ArrayList<Student> studentList = new ArrayList<Student>();
            studentList.add(new Student(str1, str2, str3));
            System.out.println("Welcome to school, " + str1 + " " + str2 + "in " + str3 + "grade!");
        } else {
            ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
            String teacher = arr[2];
            teacherList.add(new Teacher(str1,str2,teacher));
            System.out.println("Welcome to school, " +str1+" "+str2+ "teaching " +teacher+ "class!");

        }
    }

    public static void main(String arg[]) {
/*      Person Micheal = new Student("Micheal", "Johnson", 11);
        Person Eric = new Teacher("Eric", "Ericson", "English");
        Section English = new Section("English", Eric);
        English.addStudent(Micheal);
        English.sectionSeatsRemaining(); */


        System.out.println("If you would like to add a student, type addT, if you would like to add a teacher, type addTeach, if you would like to add a course, type addC");
        Scanner scanner = new Scanner(System.in);

        String tes = scanner.next();

        switch (tes) {
            case "addT":
                System.out.println("Please enter the Student's first and last name, as well as their grade. (Ex. Michael Johnson 11)");
                parseName(false, scanner.next());
                break;
            case "addTeach":
                System.out.println("Please enter the Teacher's first and last name, as well as the class they teach. (Ex. Eric Ericson English");
                parseName(true, tes);
                break;
            case "addC":
                System.out.println("THIS IS A CLASS");
                break;
            default:
                System.out.println("Nop");
                break;


        }


    }



}

