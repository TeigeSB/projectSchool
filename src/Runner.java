/**
 * Created by h205p2 on 9/26/17.
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Runner {


    public static ArrayList<Student> studentList = new ArrayList<Student>();
    public static ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
    public static ArrayList<Section> sectionList = new ArrayList<Section>();

    static Section A = null;
    static Section B = null;
    static Section C = null;

    static void parseName(boolean teach, String inp) {

        String[] arr = inp.split(" ");
        String str1 = arr[0];
        String str2 = arr[1];
        if (!teach) {
            int str3 = Integer.valueOf(arr[2]);
            Student Tes = new Student(str1,str2,str3);
            System.out.println(Tes + " HEY TES");
            studentList.add(Tes);
            System.out.println(studentList.size());
            System.out.println("Welcome to school, " + str1 + " " + str2 + " in " + str3 + " grade!");

        } else {
            String teacher = arr[2];
            teacherList.add(new Teacher(str1,str2,teacher));
            System.out.println("Welcome to school, " +str1+" "+str2+ " teaching " +teacher+ " class!");


        }
    }

    static void addStudents (String inp) {

        int bop = Integer.valueOf(inp);
        Scanner stin = new Scanner(System.in);
        String nextLin = stin.nextLine();

        for (int i = 0; i < bop; i++) {

            System.out.println("Please type the name of the student you would like to add! (i.e Michael Johnson 11)");
            parseName(false, stin.nextLine());

        }

    }

    static void parseState (String inp) {

        Section.count++;
        String[] arr = inp.split(" ");
        String str1 = arr[0];
        String str2 = arr[1];
        String str3 = arr[2];
        int str4 = Integer.valueOf(arr[3]);
        for (int i = 0; i < sectionList.size(); i++) {

            if (sectionList.get(i).name == str1 || sectionList.get(i).teacher == str2 + " " + str3) {

                System.out.println("Sorry, either that class has already been made, or a teacher is already teaching! Try making another one!");
                parseState(inp);

            }

        }
        if (Section.count == 1) {
            A = new Section(str1, str2 + " " + str3, str4);
            sectionList.add(A);
        } else if (Section.count == 2) {
            B = new Section(str1, str2 + " " + str3, str4);
            sectionList.add(B);
        }else if (Section.count == 3) {
            C = new Section(str1, str2 + " " + str3, str4);
            sectionList.add(C);
        }
    }

    public static void main(String arg[]) {
/*      Person Micheal = new Student("Micheal", "Johnson", 11);
        Person Eric = new Teacher("Eric", "Ericson", "English");
        Section English = new Section("English", Eric);
        English.addStudent(Micheal);
        English.sectionSeatsRemaining(); */


        while (true) {
            System.out.println("Welcome to 'Class Creator 2000'! To add a course, type addSect");
            Scanner scanner = new Scanner(System.in);

            String tes = scanner.next();
            scanner.nextLine();

            switch (tes) {
                case "addSect":
                    System.out.println("Enter name of the Section you would like to make, with the name, the teacher, and the class size. (i.e English Eric Ericson 20)");
                    parseState(scanner.nextLine());
                    System.out.println("Sweet! Now that you've made a class, would you like to add students to it?");
                    String set = scanner.next();
                    switch (set.toLowerCase()) {
                        case "yes":
                            System.out.println("Awesome! How many? (Warning: You will have to type out first name, last, and grade for each student.");
                            scanner.nextLine();
                            addStudents(scanner.nextLine());
                            System.out.println("Sweet. Now you have students, want to add a teacher to teach them?");
                            break;
                        case "no":
                            System.out.println("Ok, want to add a teacher instead?");
                    }
                    break;
                default:
                    System.out.println("That's not a valid command");
                    break;


            }


        }


    }
}

