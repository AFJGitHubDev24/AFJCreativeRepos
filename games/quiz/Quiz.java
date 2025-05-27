import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        // JAVA QUIZ GAME

        Scanner scanner = new Scanner(System.in);

        // Questions array[]
        String[] questions = {"The INSPIRE Scheme is a flagship initiative of which organization?",
                              "Which organization released the first State of the World's Animal Health report in May 2025?",
                              "What is the name of the scheme launched by the Indian government for providing equity support to MSMEs?",
                              "The ancient city of Nineveh, recently in the news, is located in which country?",
                              "National Anti-Terrorism Day is observed in India on which date?"};

        // Options array[][]
        String[][] options = {{"1. Council of Scientific and Industrial Research", "2. Ministry of Education", "3. Reserve Bank of India", "4. Department of Science and Technology"},
                              {"1. World Organisation for Animal Health (WOAH)", "2. Food and Agriculture Organization (FAO)", "3. International Union for Conservation of Nature (IUCN)", "4. World Wildlife Fund (WWF)"},
                              {"1. Atmanirbhar MSME Yojana", "2. SRI Fund Scheme", "3. Bharat MSME Capital Scheme", "4. Startup India Fund"},
                              {"1. China", "2. Russia", "3. Iraq", "4. Iran"},
                              {"1. May 19", "2. May 20", "3. May 21", "4. May 22"}};

        // Declare variables
        int[] answers = {4, 1, 2, 3, 3};
        int score = 0;
        int guess;

        // Welcome message
        System.out.println("*************************");
        System.out.println("WELCOME TO JAVA QUIZ GAME");
        System.out.println("*************************");

        // Question (loop)
        for(int i=0; i<questions.length; i++) {
            System.out.println(questions[i]);

            // Options
            for(String option : options[i]){
                System.out.println(option);
            }

            // Get guess from the user
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            // Check the guess
            if(guess == answers[i]){
                System.out.println("********");
                System.out.println("CORRECT!");
                System.out.println("********");
                score++;
            }
            else{
                System.out.println("********");
                System.out.println("WRONG!");
                System.out.println("********");
            }
        }
        // Display the final score
        System.out.println("Your final score is " + score + " out of " + questions.length);

        scanner.close();
        
    }
}
