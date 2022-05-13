
/**
 * Write a description of class CENG217Midterm here.
 *
 * @author Utsav Sharma
 * @version 13 October 2020
 * project MidtermExam
 */
import java.util.Scanner;
import java.time.LocalDate; 
import java.util.*;
import java.text.*;

// Declaration of class named CENG217Midterm
public class CENG217Midterm
{
    // Declaration of variables
    int numberOfStudents;
    String getName;
    int getStudentID;
    String getCredits;
    String getLoginName;
    String value;
    CENG217Midterm ar [];
    
    //Empty constructor
    public CENG217Midterm() {
    
    }

    // constructors with parameters
    public CENG217Midterm(int numberOfStudents, String studentName,int studentId,String studentCredits,String studentLoginName) {
        this.numberOfStudents= numberOfStudents;
        this.getName= studentName;
        this.getStudentID= studentId;
        this.getCredits= studentCredits;
        this.getLoginName= studentLoginName;
    }
    //method to display the number of students
    public int numberOfStudents() {
        return this.numberOfStudents;
    }
    
    //method to get the name of student
    public String getName() {
        return this.getName;
    }
    
    //method to get the student ID
    public int getStudentID() {
        return this.getStudentID;
    }
    
    //method to get credit
    public String getCredit() {
        return this.getCredits;
    }
    
    //method to get login name
    public String getLoginName() {
        return this.getLoginName;
    }
    
    //method to get the current date and time
    public String getTime() {
       Date dNow = new Date( );
      SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd");
      return ft.format(dNow);
    }
    //method to get the value
    public CENG217Midterm getValue (int studentId,CENG217Midterm[] arr, int numberofstd)
    {
        for(int i = 0 ; i< numberofstd ; i++)
    {
        if(arr[i].getStudentID() == studentId)
        {
            return arr[i];            
        }
        
    }
    return new CENG217Midterm();
    }
    
    //method to display the value
    public String getDisplayValue(CENG217Midterm ob) {
        return "Name: " + ob.getName() + " " + "Id:"+ ob.getStudentID() + "  " + "Credits: " + ob.getCredit() + " " + "Login: "+ ob.getLoginName();
    }
    //method to get the sum 
    public int getSum() {
        int sum = 50+55;
        return sum;
    }
    //method to get the maximum number
        public int getMax() {
        int array[] = {5,10,15,20,25,45,60,85,180};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
             if (array[i] > max) 
                 max = array[i]; 
                }
         return max; 
        }
        
//main method
public static void main(String[] args)  {

    Scanner sc= new Scanner(System.in); 
    
    System.out.println("Enter Number of Students: ");
    int numberOfStudents =  sc.nextInt();
    CENG217Midterm arr[] = new CENG217Midterm[numberOfStudents];
    
    for(int cnt =0 ; cnt<numberOfStudents; cnt ++)
    {   
    System.out.println("Enter Name Of Student");
    String studentName = sc.next();
    System.out.println("Enter Student Id");
    int studentId = sc.nextInt();
    System.out.println("Enter Student Credits");
    String studentCredits =  sc.next();
    System.out.println("Enter Student Login Name");
    String studentLogin = sc.next();
    System.out.println("Here you go with all the details of the Student");
    CENG217Midterm obj = new CENG217Midterm(numberOfStudents, studentName, studentId, studentCredits, studentLogin);
    
    
         System.out.println("Name: " + obj.getName());
         
         System.out.println("Student ID: " + obj.getStudentID());
         
         System.out.println("Credit: " + obj.getCredit());
         
         System.out.println("Login name: " + obj.getLoginName());
         
         arr[cnt] = obj;
        
         System.out.print("The Current Time: " + obj.getTime());
         
         System.out.println("Sum is: " + obj.getSum());
         
         System.out.println("Maximum number is: " + obj.getMax());
 
    
    }
    
    System.out.println("Enter the Id of the Student For Details:");
    int inputStudentId = sc.nextInt();
    CENG217Midterm obj = new CENG217Midterm();
    
    CENG217Midterm obj1 = obj.getValue(inputStudentId, arr,numberOfStudents);
    System.out.println(obj.getDisplayValue(obj1));
}
}

   


/**
 * Class: class is a set of instructions to create a particular type of object.In java class can control how an object will behave and  what it contains. 
 * 
 * Method: The method is a set of code grouped together to perform a specific task of operation.it is used to achieve reusability and redability of program.
 * 
 * Constructors: A constructor is a special method that is used to initialize objects. it has a same name as class.
 * The constructor is called after class is created.
 * 
 * Overloading: Two or more methods within the same class and same name with the different parameteres list is called overloadig.
 * In overloading method,must have different argument list, may have different data type.
 * 
 * Throwing:  We can throw an expection using java throw keyword at any point of program where an error condition is detected.
 *            If an exception is thrown back from a method, then that method does not return a value as normal.          
 */

