import java.util.*;
class Employee
{
 int emp_no;
 String emp_name;
 Scanner s1= new Scanner (System.in);
void getvalues ()
{
 System.out.println ("<<ENTER THE EMPLOYEE DETAILS>>");
 System.out.println ("Enter the Name of The Employee : ");
 emp_name =s1.nextLine();
 System.out.println ("Enter the Id of the Employee : ");
 emp_no = s1.nextInt();
}
void display ()
{
 System.out.println ("<<EMPLOYEE DETAILS>>\t");
 System.out.println ("Name of the Employee : "+emp_name);
 System.out.println (" ID of the Employee : "+emp_no);
}
}
class Manager extends Employee
{
 String dept_name;
 int dept_no;
 Scanner s2 = new Scanner (System.in);
void getvalues ()
{
 super.getvalues();
 System.out.println ("Enter the Department of Manager : ");
 dept_name = s2.nextLine();
 System.out.println ("Enter the Manager's Department Id :  ");
 dept_no = s2.nextInt();
}
void display ()
{
 super.display();
 System.out.println ("Manager's Department : "+dept_name);
 System.out.println ("Manager's Department ID : "+dept_no);
}
}
class Officer extends Employee
{
 String dept_name;
 int dept_no;
 Scanner s3 = new Scanner (System.in);
 void getvalues()
{
 System.out.println ("Enter the Department of Officer : ");
 dept_name = s3.nextLine();
 System.out.println ("Enter the Officer's Department Id : ");
 dept_no = s3.nextInt();
}
 void display ()
{
 System.out.println ("Officer's Department : "+dept_name);
 System.out.println ("Officer's Department ID : "+dept_no);
}
}
public class Inherit
{
 public static void main(String [] args)
 {
  Manager M = new Manager();
  Officer O = new Officer();
  M.getvalues();
  M.display();
  O.getvalues();
  O.display();
 }
}

<<ENTER THE EMPLOYEE DETAILS>>
Enter the Name of The Employee : 
Amal
Enter the Id of the Employee : 
12
Enter the Department of Manager : 
AI
Enter the Manager's Department Id :  
74
<<EMPLOYEE DETAILS>>	
Name of the Employee : Amal
 ID of the Employee : 12
Manager's Department : AI
Manager's Department ID : 74
Enter the Department of Officer : 
MECH
Enter the Officer's Department Id : 
54
Officer's Department : MECH
Officer's Department ID : 54

