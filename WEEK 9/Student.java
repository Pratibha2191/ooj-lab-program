package CIE;
import java.util.Scanner;
public class Student
{
public String name;
public String usn; 
public int sem;
public void display()
{
Scanner s=new Scanner(System.in);
System.out.print("Name:-");
name=s.next();
System.out.print("USN:-");
usn=s.next();
System.out.print("Semester:-");
sem=s.nextInt();
}
}
