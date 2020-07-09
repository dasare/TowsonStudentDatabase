//import java.util.*;
public class DatabaseMenu {
    public static void main( String[] args) {

         Student student1 = new Student();
        //Ask how many users to add
        student1.enroll();
        System.out.println();
        student1.payTuition();
        System.out.println();
        System.out.println(student1.acctInfo());
        //create x number of new users
      
    }


}