import java.util.Scanner;

class TemperatureConverter{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Declare the required variables
        double temp;
        double newTemp;
        String unit;

        // User prompts for entering temperature and unit
        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit ? (C or F): ");
        unit = scanner.next().toUpperCase();

        /*
            Calculate new temperature using the Celsius and Fahrenheit formulas enclosed in a ternary operator,
            setting the condition of units selected

            Formulas for Fahrenheit to Celsius and Celsius to Fahrenheit conversions:
            1. new temp = (temp - 32) * 5 / 9 (Fahrenheit to Celsius)
            2. new temp = (temp * 9 / 5) + 32 (Celsius to Fahrenheit)
        */
        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

        // Output the new temperature along with the selected unit
        System.out.printf("%.1f°%s", newTemp, unit);

        scanner.close();

    }
}
