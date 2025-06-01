import java.util.Scanner;

public class Banking {

    static Scanner scanner = new Scanner(System.in); // Scanner as a class variable

    public static void main(String[] args){

        // JAVA BANKING PROGRAM

        //Declare the variables
        double balance = 0; // Local variable to store the original balance
        boolean isRunning = true;
        int choice;

        while(isRunning){
            // Display menu
            System.out.println("$$$$$$$$$$$$$$$$$$$$");
            System.out.println("JAVA BANKING PROGRAM");
            System.out.println("$$$$$$$$$$$$$$$$$$$$");
            System.out.println("1. Balance inquiry");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            // Get and process user's choice
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE!");
            }
        }

        // Exit message
        System.out.println("**********************");
        System.out.println("Thank you for banking!");
        System.out.println("Have a nice day!");
        System.out.println("JAVA BANKING PROGRAM");
        System.out.println("**********************");

        scanner.close();

    }

    // showBalance() method
    static void showBalance(double balance){
        System.out.println("$$$$$$$$$$$$$$$$$$$$");
        System.out.printf("Current balance: $%.2f\n", balance);
        System.out.println();
    }

    // deposit() method
    static double deposit(){
        double amount; // Local variable for deposit

        System.out.print("Enter the amount to deposit: ");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Amount can't be negative!");
            System.out.println();
            return 0;
        }
        else{
            System.out.println("Amount deposit successful!");
            System.out.println("Deposited amount: $" + amount);
            System.out.println();
            return amount;
        }

    }

    // withdraw() method
    static double withdraw(double balance){

        double amount; // Local variable to withdraw

        System.out.print("Enter the amount to withdraw: ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("Insufficient balance!");
            System.out.println();
            return 0;
        }
        else if(amount < 0){
            System.out.println("Amount can't be negative!");
            System.out.println();
            return 0;
        }
        else{
            System.out.println("Amount withdrawal successful!");
            System.out.println("Amount withdrew: $" +amount);
            System.out.println();
            return amount;
        }

    }

}
