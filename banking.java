import java.util.*;
public class banking
{
 String name;
 int age,account;
 double amount;
 banking(String a,int b,int c,double d)
 { 
  name=a;
  age=b;
  account=c;
  amount=d;
 }
  public void withdraw(double x)
 {
  
   amount=amount-x;.0
   System.out.println("Balance="+amount);
 }
   public void deposit(double y)
 {
    amount=amount+y;
    System.out.println("Balance="+amount);
 }
    public void display()
 {
     System.out.println("customer name:"+name);
     System.out.println("age:"+age);
     System.out.println("account:"+account);
     System.out.println("amount:"+amount);
 }
     public static void main(String args[])
     {
      Scanner in=new Scanner(System.in);
      int p=1;
      System.out.println("enter name");      
      String n=in.nextLine();
      System.out.println("enter age");
      int ag=in.nextInt();
      System.out.println("enter accountnumber");
      int an=in.nextInt();
      System.out.println("enter amount");
      double amt=in.nextDouble();
      banking z=new banking(n,ag,an,amt);
      while(p==1)
      {
       System.out.println("enter 1:withdraw 2:deposit 3:display");
       int w=in.nextInt();
       switch(w)
       {
        case 1:System.out.println("enter the amount to withdraw");
               double x=in.nextDouble();
               z.withdraw(x);
               break;
        case 2:System.out.println("enter the amount to deposit");
               double y=in.nextDouble();
               z.deposit(y);
               break;
        case 3:z.display();
               break;
        default:System.out.println("wrong choice");;
       }
        System.out.println("enter 1 to continue 0 to exit");
        p=in.nextInt();
       }
      }
     }
     
    
