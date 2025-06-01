import java.util.Scanner;

class CompoundInterestCalculator {
    public static void main(String[] args) {

        // COMPOUND INTEREST CALCULATOR

        Scanner scanner = new Scanner(System.in);
        
        // Declare variables
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;
        
        // User prompts for principal amount, interest rate, compounded time and number of years
        System.out.print("Enter the principal amount (in Rs.): ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();
        
        // Calculate the amount
        amount = principal * Math.pow(1+(rate/years), years*timesCompounded);
        System.out.printf("The amount after %d years: Rs.%.2f", years, amount);

        scanner.close();

    }
}
