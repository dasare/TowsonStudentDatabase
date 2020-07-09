import java.util.*;

//import sun.tools.jstat.SymbolResolutionClosure;

public class Student {

    private String firstName;
    private String lastName;
    private String studentID;
    private int classification;
    private static int id = 2000;
    private static int courseAmt = 600;
    private String courses = " ";
    private int tuitBalance = 0;

    // prompt user to enter name and classifcation year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student's first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student's last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.classification = in.nextInt();

        setStudentID();

    }

    // generate user id
    private void setStudentID() {
        // grade level + ID
        id++;
        this.studentID = classification + "" + id;
    }

    // enroll in courses
    public void enroll() {
        // Enter loop. User hits zero to exit.
        do {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter course to enroll (Q to quit): ");
            String course = in.nextLine();

            // prompt user for courses until Q is selected
            if (!course.equals("Q")) {
                courses = courses + "\n " + course;
                tuitBalance = tuitBalance + courseAmt;
            } else {
                break;
            }
        } while (1 != 0);
        System.out.println();

        // System.out.println("Tuition Amt: " + tuitBalance);
    }

    // view balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitBalance);
    }

    // pay tuition
    public void payTuition() {
        viewBalance();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your payment amount $");
        int payment = in.nextInt();
        tuitBalance = tuitBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    // show status
    public String acctInfo() {
        return "Name: " + firstName + " " + lastName + "\nGrade Level: " + classification + "\nStudent ID: " + id + "\nCourses Enrolled:" + courses + "\nBalance: $" + tuitBalance;
    }
}