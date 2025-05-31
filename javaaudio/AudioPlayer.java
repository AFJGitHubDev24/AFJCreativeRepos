// Import necessary libraries
import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class AudioPlayer {
    public static void main(String[] args){

        // Play audio with Java (.wav, .au, .aiff)
        System.out.println("🎵🎼🎵🎼🎵🎼🎵🎼");
        System.out.println("AFJ AUDIO PLAYER");
        System.out.println("🎵🎼🎵🎼🎵🎼🎵🎼");

        // The file to be used
        String filePath = "AFJJavaProject\\src\\City of the Wolf - The Mini Vandals.wav";
        File file = new File(filePath);

        // Play audio
        try(Scanner scanner = new Scanner(System.in);
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file)){
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);

            String response = "";

            // Play, pause and reset the audio until the user hits "Q"
            while(!response.equals("Q")){
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");

                System.out.print("Enter your choice: ");
                response = scanner.next().toUpperCase();

                switch(response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice!");
                }
            }
        }
        // Exceptions in case of any kind of failures
        catch (FileNotFoundException e){
            System.out.println("Could not locate the file!");
        }
        catch (LineUnavailableException e){
            System.out.println("Unable to access audio resource!");
        }
        catch (UnsupportedAudioFileException e){
            System.out.println("Audio file not supported!");
        }
        catch (IOException e){
            System.out.println("Something went wrong!");
        }
        finally {
            System.out.println("🎵🎼🎵🎼🎵🎼🎵🎼");
            System.out.println("Bye! Have a musical day!");
            System.out.println("🎵🎼🎵🎼🎵🎼🎵🎼");
        }

    }
}
