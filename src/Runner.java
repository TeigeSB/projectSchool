/**
 * Created by h205p2 on 9/26/17.
 */

import java.util.Scanner;

public class Runner {



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
                System.out.println("Please enter the Student's first and last name, as well as their grade. (Ex. Michael Johnson 11");

                break;
            case "addTeach":
                System.out.println("Please enter the Teacher's first and last name, as well as the class they teach. (Ex. Eric Ericson English");
                break;
            case "addC":
                System.out.println("THIS IS A CLASS");
                break;
            default:
                System.out.println("Nop");
                break;   


        }


    }

    String inp = "";

    void parseName(Object Person, String inp) {

        String[] arr = {};

        arr = inp.split(" ");

        String str1 = arr[0];
        String str2 = arr[1];
        String str3 = arr[2];

        Person str1 =

    }

}

