import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        
        // A SIMPLE CALCULATOR USING JAVA WITH ENHANCED SWITCHES

        Scanner scanner = new Scanner(System.in);
        
        // Declare variables
        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperation = true;
        
        //User prompts for getting the numbers and the operator 
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();
        
        // Enhanced switch along with exceptional cases
        switch(operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2 == 0){
                    System.out.println("ZeroDivisionError!");
                    validOperation = false;
                }
                else{
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operator!");
                validOperation = false;
            }
        }

        // If operator or number is valid (in case of division, then print the result
        if(validOperation){
            System.out.printf("%.2f", result);
        }

        scanner.close();

    }
}
