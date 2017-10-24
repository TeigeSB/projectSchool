/**
 * Created by h205p2 on 9/26/17.
 */

import com.sun.org.apache.xpath.internal.operations.Bool;

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


    static void parseName(boolean teach, String inp, Section section) {

        String[] arr = inp.split(" ");
        String str1 = arr[0];
        String str2 = arr[1];
        Scanner ok = new Scanner(System.in);
        if (!teach) {
            int str3 = Integer.valueOf(arr[2]);
            for (int i = 0; i < studentList.size(); i ++) {

                if (studentList.get(i).firstName.equals(str1) && studentList.get(i).lastName.equals(str2)) {

                    System.out.println("Sorry! At this school we like being unique, so only one UNIQUE name is allowed, no duplicates!");
                    parseName(false, ok.nextLine(), section);
                    return;

                }

            }
            Student Tes = new Student(str1,str2,str3);
            studentList.add(Tes);
            section.students.add(Tes);

        }
    }

    static Student searchStud (String name) {

        String[] arr = name.split(" ");
        String first = arr[0];
        String last = arr[1];

        for(int i = 0; i < studentList.size(); i ++) {

            if (studentList.get(i).firstName.equals(first) && studentList.get(i).lastName.equals(last)) {

                System.out.println(studentList.get(i).firstName +  " " + studentList.get(i).lastName);

                for (int j = 0; j < sectionList.size(); j ++) {
                    System.out.println("check sectionlist");
                    for (int l = 0; l < sectionList.get(j).students.size(); l++) {
                        System.out.println("check sectionlist students");
                        if (sectionList.get(j).students.get(l).firstName.equals(first) && sectionList.get(j).students.get(l).lastName.equals(last)) {

                            System.out.println("This student is in " + sectionList.get(l).name + " with " + sectionList.get(l).teacher + " as their teacher.");
                            return studentList.get((i));
                        }

                    }

                }
                return studentList.get((i));

            }

        }

     return null;
    }

    static void addStudents (String inp, Section section) {

        int bop = Integer.valueOf(inp);
        Scanner stin = new Scanner(System.in);

        for (int i = 0; i < bop; i++) {

            System.out.println("Please type the name of the student you would like to add! (i.e Michael Johnson 11)");
            parseName(false, stin.nextLine(), section);

        }

    }

    static Section parseState (String inp) {

        Scanner scanme = new Scanner(System.in);
        String[] arr = inp.split(" ");
        String str1 = arr[0];
        String str2 = arr[1];
        String str3 = arr[2];
        int str4 = Integer.valueOf(arr[3]);
        for (int i = 0; i < sectionList.size(); i++) {

            System.out.println(sectionList.get(i).name + " AND " + str1);

            if (sectionList.get(i).name.equals(str1) || sectionList.get(i).teacher.equals(str2 + " " + str3)) {

                System.out.println("Sorry, either that class has already been made, or a teacher is already teaching! Try making another one!");

                parseState(scanme.nextLine());

            }

        }

        sectionList.add(new Section(str1, str2 + " " + str3, str4));
        for(int i = 0;i < sectionList.size(); i ++) {

            if (sectionList.get(i).name.equals(str1)) {

                return sectionList.get(i);

            }

        }
        return null;
    }

    static Section checkClass(String name) {

        for (int i = 0; i < sectionList.size(); i ++) {

            if(sectionList.get(i).name.equals(name)) {

                System.out.println("The class is " + sectionList.get(i).name + " and it currently has " + sectionList.get(i).currentSize + " students in it with " + sectionList.get(i).sectionSeatsRemaining() + " spots left.");
                return sectionList.get(i);

            }

        }
        return null;
    }

    public static void main(String arg[]) {
/*      Person Micheal = new Student("Micheal", "Johnson", 11);
        Person Eric = new Teacher("Eric", "Ericson", "English");
        Section English = new Section("English", Eric);
        English.addStudent(Micheal);
        English.sectionSeatsRemaining(); */

        Boolean frue = true;

        while (frue) {
            System.out.println("Welcome to 'Class Creator 2000'! To add a course, type addSect, if you already have a course, type viewCourse. If you want to find a student already in the system, type findStud. To end the program, type endProg.");
            Scanner scanner = new Scanner(System.in);

            String tes = scanner.next();
            scanner.nextLine();

            switch (tes) {
                case "addSect":
                    System.out.println("Enter name of the Section you would like to make, with the name, the teacher, and the class size. (i.e English Eric Ericson 20)");
                    Section okthen = parseState(scanner.nextLine());
                    System.out.println("Sweet! Now that you've made a class, would you like to add students to it?");
                    String set = scanner.next();
                    switch (set.toLowerCase()) {
                        case "yes":
                            System.out.println("Awesome! How many? (Warning: You will have to type out first name, last, and grade for each student.)");
                            scanner.nextLine();
                            addStudents(scanner.nextLine(), okthen);
                            System.out.println("Sweet. Now you have students and there are " + okthen.sectionSeatsRemaining() + " spaces left, do you want to do anything else? (Yes to return to main menu, no to end program.)");
                            switch(scanner.next().toLowerCase()) {
                                case "yes":
                                    break;
                                case "no":
                                    frue = false;
                                    break;
                            }
                            break;
                        case "no":
                            System.out.println("Ok then, a class with no students? Anything else?");
                            switch(scanner.next().toLowerCase()) {
                                case "yes":
                                    break;
                                case "no":
                                    frue = false;
                                    break;
                            }
                            break;
                    }
                    break;
                case "viewCourse":

                    for (int i = 0; i < sectionList.size(); i ++) {
                        System.out.println(sectionList.get(i).name);
                    }
                    System.out.println("Which class would you like to interact with?");
                    Section wowok = checkClass(scanner.nextLine());
                    System.out.println("Would you like to add or remove students?");
                    switch (scanner.next().toLowerCase()) {

                        case "remove":
                            System.out.println("What's the name of the student you would like to remove?");
                            wowok.removeStudent(scanner.next());
                            break;
                        case "add":
                            System.out.println("Awesome! How many? (Warning: You will have to type out first name, last, and grade for each student.)");
                            addStudents(scanner.next(), wowok);
                            break;

                    }

                case "findStud":
                    System.out.println("What's the first and last name of the student that you would like to find? (i.e Michael Johnson)");
                    searchStud(scanner.nextLine());

                    break;
                case "endProg":
                    frue = false;
                    break;

                default:
                    System.out.println("That's not a valid command");
                    break;


            }


        }


    }
}

