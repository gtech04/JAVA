import java.util.Scanner;
abstract class Bank
{
 abstract public void details();
}
class SBI extends Bank
{
 Scanner obj1=new Scanner(System.in);
 int rate;
 int amount;
 int time;
 int f_amount=0;
 int r_amount=0;
 String area;
 public void details()
 {
  System.out.print("\n Enter the Location of SBI Bank: ");
  area=obj1.nextLine();
  System.out.print("\n Enter the Initial Amount: ");
  amount=obj1.nextInt();
  System.out.print("\n Enter the Rate of Interest: ");
  rate=obj1.nextInt();
  System.out.print("\n Enter the Number of Years: ");
  time=obj1.nextInt();
  r_amount=(rate*amount*time)/100;
  f_amount=amount+r_amount;
  System.out.println("\n Amount after the time period: "+f_amount);
 }
 void display()
 {
  System.out.println("\n Location of the Bank : "+area);
  System.out.println("\n Initial Amount: "+amount);
  System.out.println("\n Rate of Interest : "+rate);
  System.out.println("\n Number of Years: "+time);
  System.out.println("\n Final Amount After the time period: "+f_amount);
 }
}
class ICICI extends Bank
{
 Scanner obj2=new Scanner(System.in);
 int rate;
 int amount;
 int time;
 int f_amount=0;
 int r_amount=0;
 String area;
 public void details()
 {
  System.out.print("\n Enter the Location of ICICI Bank: ");
  area=obj2.nextLine();
  System.out.print("\n Enter the Initial Amount: ");
  amount=obj2.nextInt();
  System.out.print("\n Enter the Rate of Interest: ");
  rate=obj2.nextInt();
  System.out.print("\n Enter the Number of Years: ");
  time=obj2.nextInt();
  r_amount=(rate*amount*time)/100;
  f_amount=amount+r_amount;
  System.out.println("\n Final Amount after the time period : "+f_amount);
 }
 void display()
 {
  System.out.println("\n Location of the Bank : "+area);
  System.out.println("\n Initial Amount: "+amount);
  System.out.println("\n Rate of Interest : "+rate);
  System.out.println("\n Number of Years: "+time);
  System.out.println("\n Final Amount After the time period: "+f_amount);
 }
}
public class Abstract
{
 public static void main(String[] args)
 {
  SBI sbi=new SBI();
  ICICI icici=new ICICI();
  sbi.details();
  sbi.display();
  icici.details();
  icici.display();
 }
}




 Enter the Location of SBI Bank: Adoor

 Enter the Initial Amount: 10000

 Enter the Rate of Interest: 5

 Enter the Number of Years: 5

 Amount after the time period: 12500

 Location of the Bank : Adoor

 Initial Amount: 10000

 Rate of Interest : 5

 Number of Years: 5

 Final Amount After the time period: 12500

 Enter the Location of ICICI Bank: Kadampanad

 Enter the Initial Amount: 10000

 Enter the Rate of Interest: 3

 Enter the Number of Years: 5

 Final Amount after the time period : 11500

 Location of the Bank : Kadampanad

 Initial Amount: 10000

 Rate of Interest : 3

 Number of Years: 5

 Final Amount After the time period: 11500

