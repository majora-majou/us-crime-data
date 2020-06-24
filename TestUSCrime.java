// Imports.
import java.util.*;
import java.io.*;

public class TestUSCrime {
    // Holds value for total elapsed time the program is running.
    private static long elapsedTime;
    // Main method.
    public static void main(String[] args) throws IOException {
        // Start time holds the current time in milliseconds that this program began running.
        long startTime = System.currentTimeMillis();
        long endTime;
        // Creates scanner class and variable to hold the user's input.
        Scanner sc = new Scanner(System.in);
        String userInput = null;
        // Main menu.
        String menu = "\n********** Welcome to the US Crime Statistical Application **************************\n\nEnter the number of the question you want answered. Enter ‘Q’ to quit the program :\n\n1. What were the percentages in population growth for each consecutive year from 1994 – 2013?\n2. What year was the Murder rate the highest?\n3. What year was the Murder rate the lowest?\n4. What year was the Robbery rate the highest?\n5. What year was the Robbery rate the lowest?\nQ. Quit the program\n";
        System.out.println(menu);
        // New object.
        USCrime crimeData = new USCrime();
        // Variables to check command line arguments.
    	String arg = "";
    	File csvFile;
    	Scanner csvFileIn = new Scanner(System.in);
        // Creates command line arguments.
        if (args.length > 0) {
        	try {
            	arg = args[0];
            	csvFile = new File(arg);
                csvFileIn = new Scanner(csvFile);
                csvFileIn.close();
            } catch (FileNotFoundException e) {
            	// Exit the program if no command line argument is used.
            	System.exit(1);
            	}
        	}
    	else {
    		System.out.println("Please supply a file to read.");
    	}
    	// Grabs file and recreates scanner class.
    	csvFile = new File(arg);
    	csvFileIn = new Scanner(csvFile);
        // Parse each line in the file after each comma.
    	while (csvFileIn.hasNextLine()) {
    		String fileLine = csvFileIn.nextLine();
            String[] splitLine = fileLine.split(",");
            // Calls setter.
            crimeData.setYear(splitLine);
        }
        csvFileIn.close();
        // End allows the do-while loop to reoccur until the user enters 'q'.
        int end = 0;
        do {
        userInput = sc.nextLine();
        // Quits the program and displays elapsed time.
        if (userInput.equalsIgnoreCase("q")) {
            endTime = System.currentTimeMillis();
            elapsedTime = ((endTime - startTime) / 1000);
            System.out.println("\nThank you for trying the US Crime Statistics program. The elapsed time in seconds was: " + elapsedTime);
            end++;
        }
        else if (userInput.equals("1")) {
            System.out.println("Enter the first year between 1994 and 2013: ");
            String firstYear = sc.nextLine();
            System.out.println("Enter the second year between 1994 and 2013: ");
            String secondYear = sc.nextLine();
            crimeData.populationGrowth(firstYear,secondYear);
        }
        else if (userInput.equals("2")) {
            crimeData.maxMurderRate();
        }
        else if (userInput.equals("3")) {
            crimeData.minMurderRate();
        }
        else if (userInput.equals("4")) {
            crimeData.maxRobberyRate();
        }
        else if (userInput.equals("5")) {
            crimeData.minRobberyRate();
        }
        else {
            System.out.println("Invalid option. Please enter a valid option.");
        }
    } while (end != 1);
    }
}
