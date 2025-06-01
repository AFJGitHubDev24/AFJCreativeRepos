package alarmclock;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class JavaAlarm {
    public static void main(String[] args){

        // JAVA ALARM CLOCK
        System.out.println("⏰JAVA ALARM CLOCK!⏰");
        System.out.println("**********************");

        // Import necessary resources
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath = "C:\\Users\\alan1\\IdeaProjects\\AFJJavaProject\\AFJJavaProject\\src\\alarmclock\\Digital Watch Alarm Long.wav";

        while(alarmTime == null){
            try{
                // Accept user input
                System.out.print("Enter alarm time (HH:MM:SS): ");
                String inputTime = scanner.nextLine();

                // Parse the time and output the alarm time that is set by the user
                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("The alarm set for " + alarmTime);
            }
            // Print exception if the user inputs in an invalid format
            catch(DateTimeParseException e){
                System.out.println("Invalid format! Please use HH:MM:SS format!");
            }

            System.out.println();
        }

        // Instantiate the AlarmClock object and run the Thread object in the background
        AlarmClock alarmClock = new AlarmClock(alarmTime, filePath, scanner);
        Thread alarmThread = new Thread(alarmClock);

        alarmThread.start();

    }
}
