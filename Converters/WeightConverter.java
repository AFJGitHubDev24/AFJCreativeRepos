import java.util.Scanner;

class WeightConverter {
    public static void main(String[] args){

        // WEIGHT CONVERSION PROGRAM IN JAVA

        // Declare variables
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        // Welcome message
        System.out.println("⚖️WEIGHT CONVERSION PROGRAM⚖️");
        System.out.println("1: Convert lbs to kgs.");
        System.out.println("2: Convert kgs to lbs.");

        // Prompt for user choice
        System.out.print("Enter choice: ");
        choice = scanner.nextInt();


        if(choice == 1){
            // Option 1: Convert lbs to kgs
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs: %.2f", newWeight);
        }
        else if(choice == 2){
            // Option 2: Convert kgs to lbs
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs: %.2f", newWeight);
        }
        else{
            // Else print "INVALID CHOICE!"
            System.out.println("INVALID CHOICE!");
        }

        scanner.close();

    }
}
