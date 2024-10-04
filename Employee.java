import java.util.*;
class Employee 
{
    String emp_id;
    Scanner s1= new Scanner (system.in);
    void getvalues()
    {
        System.out.println ("<<Enter the Employee Details>>");
        System.out.print ("Enter the name of the Employee : ");
        emp_name = s1.nextLine();
        System.out.print ("Enter the Employee ID");
        emp_id = s1.nextInt();
    }
    void Display
    {
        System.out.println ("\n EMPLOYEE DETAILS");
        System.out.print ("Employee Name : "+emp_name);
        System.out.println ("Employee ID : "+emp_id);
    }
}
class Manager extends Employee 
{
    String dept_name;
    int dept_no;
    Scanner s2=new Scanner (System.in);
    void getvalues ()
    {
        super.getvalues();
        System.out.print ("Enter the Department");
        dept_name = s2.nextLine();
        System.out.print ("Enter the Department Number");
        dept_no=s2.nextInt();
    }
     void Display
    {
        Super.display();
        System.out.print ("Department Name : "+dept_name);
        System.out.println ("Department Number : "+dept_no;
    }
}
class Officer extends Employee{
    String dept_name;
    int dept_no;
    Scanner s3= new Scanner (system.in);
    void getvalues();
    System.out.print ("Enter the Department");
    dep_name =s3.nextLine();
    System.out.println ("Enter the Department Number");
    dept_no =s3.nextInt();
}
void display ();
{
    Super.display()
    System.out.println ("Department Name : "+dept_name);
    System.out.println ("Department Number : "+dept_no);
}
public class Inherit 
{
    Public static void main (String args[])
    {
        Manager M = new Manager();
        Officer O = new Officer ();
        M.getvalues();
        M.display():
        O.getvalues();
        O.display();
    }
}