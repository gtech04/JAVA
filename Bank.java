import java.util.*;
public class Bank{
String name;
int accno;
int age;
int balance;
Bank(String n,int ac,int a,int b){
name=n;
accno=ac;
age=a;
balance=b;
}
void display(){
System.out.println("Name:"+name+"\nAccount No.:"+accno+"\nAge:"+age+"\nBalance"+balance); }
void deposit(int m){
balance+=m;
System.out.println("Current balance:"+balance); }
void withdraw(int n){
balance-=n;
System.out.println("Current balance:"+balance); }
public static void main(String args[]){ Scanner obj=new Scanner(System.in);
System.out.print("Enter name:");
String name=obj.nextLine();
System.out.print("Enter account number:");
int accno=obj.nextInt();
System.out.print("Enter age:");
int age=obj.nextInt();
System.out.print("Enter balance:");
int balance=obj.nextInt();
Bank b=new Bank(name,accno,age,balance);
b.display();
char c='y';
while(c=='y'){
System.out.print("\n1.Deposit\n2.Withdraw\n3.Exit\nChoice:"); int ch=obj.nextInt();
switch(ch){
case 1:System.out.print("Enter amount to be deposited:"); int d=obj.nextInt();
b.deposit(d);
break;
case 2:System.out.print("Enter amount to be withdrawn:"); int w=obj.nextInt();
b.withdraw(w); break;
case 3: c='n'; break; }}}}
