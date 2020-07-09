import java.util.*;

public class DatabaseMenu {
    public static void main(String[] args) {
        int numStudents;
        /*
         * Student student1 = new Student(); //Ask how many users to add
         * student1.enroll(); System.out.println(); student1.payTuition();
         * System.out.println(); System.out.println(student1.acctInfo());
         */

        // Ask how many users to add

        System.out.println("Enter number of students to enroll");
        Scanner in = new Scanner(System.in);

        // Array of objects(students)
        numStudents = in.nextInt();
        Student[] students = new Student[numStudents];

        // create x number of new users
        for (int i = 0; i < numStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].acctInfo());

        }
    }

}