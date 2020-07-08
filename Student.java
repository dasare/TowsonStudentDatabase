import java.util.*;

public class Student {

    private String firstName;
    private String lastName;
    private String studentID;
    private int classification;
    private static int id = 2000;
    private static int courseAmt = 600;
    private String courses;
    private int tuitBalance;

    // prompt user to enter name and classifcation year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student's first name.");
        this.firstName = in.nextLine();

        System.out.println("Enter student's last name");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.classification = in.nextInt();

        setStudentID();

        System.out.println(firstName + " " + lastName + " " + classification + " " + studentID);
        
        
    }
    // generate user id
    private void setStudentID(){
        //grade level + ID
        id++;
        this.studentID = classification + "" + id;
    }

    // enroll in courses

    // view balance

    // pay tuition

    // show status

}