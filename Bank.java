import java.util.*;

public class Bank {
    String name;
    int accno;
    int age;
    int balance;

    // Constructor to initialize the bank account details
    Bank(String n, int ac, int a, int b) {
        name = n;
        accno = ac;
        age = a;
        balance = b;
    }

    // Method to display the account details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Account No.: " + accno);
        System.out.println("Age: " + age);
        System.out.println("Balance: " + balance);
    }

    // Method to deposit money into the account
    void deposit(int m) {
        balance += m;
        System.out.println("Current balance: " + balance);
    }

    // Method to withdraw money from the account
    void withdraw(int n) {
        if (n > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= n;
            System.out.println("Current balance: " + balance);
        }
    }

    // Main method
    public static void main (String[] args, Object newParam, Object newParam2) 
    {
        Scanner obj = new Scanner(System.in);

        // Getting user input for account details
        System.out.print("Enter name: ");
        String name = obj.nextLine();

        System.out.print("Enter account number: ");
        int accno = obj.nextInt();

        System.out.print("Enter age: ");
        int age = obj.nextInt();

        System.out.print("Enter balance: ");
        int balance = obj.nextInt();

        // Creating a Bank object with the given details
        Bank b = new Bank(name, accno, age, balance);
        b.display();

        char c = 'y';
        while (c == 'y') {
            // Menu for deposit/withdraw options
            System.out.print("\n1. Deposit\n2. Withdraw\n3. Exit\nChoice: ");
            int ch = obj.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter amount to be deposited: ");
                    int d = obj.nextInt();
                    b.deposit(d);
                    break;
                case 2:
                    System.out.print("Enter amount to be withdrawn: ");
                    int w = obj.nextInt();
                    b.withdraw(w);
                    break;
                case 3:
                    c = 'n'; // Exit the loop
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice, please choose again.");
            }
        }
        // Closing the Scanner to prevent resource leaks
        obj.close();
    }
}
