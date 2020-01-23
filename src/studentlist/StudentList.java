package studentlist;

import java.util.Scanner;

/**
 * This class our first Example class for review modified on jan 23
 *
 * @author Paul Bonenfant
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // removed the code

        // add a blank line
        System.out.println();

        System.out.println("Now we create our Students");

        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Student Name");
            String name = input.nextLine();
            Student student = new Student(name);
            students[i] = student;
        }

        System.out.println("Let's print them back");

        for (Student student : students) {
            System.out.println(student.getName());
        }

    }

}
