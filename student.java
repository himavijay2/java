import java.util.Scanner;
public class student{
     public static void main(String  args[]) {
     String name;
     int roll;
     
    double mark;
    char grade;

    Scanner reader=new Scanner(System.in);
    System.out.print("Enter Name:");
    name=reader.nextLine();
    System.out.print("Enter Roll number:");
    roll=reader.nextInt();
    
    System.out.print("Enter mark:");
    mark=reader.nextDouble();
    System.out.print("Enter grade:");
    grade=reader.next().charAt(0);
    
     System.out.println("\n Student Details");
    System.out.println(" Name: "+name + "\n Roll.No: " + roll + "\n Mark: " + mark + "\n Grade: " + grade);
}
}