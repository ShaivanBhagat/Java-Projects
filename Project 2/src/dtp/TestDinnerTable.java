// Name: Shaivan Bhagat
// This porject is all my own work
// I have not knowingly allowed others to copy my work 

package dtp;

// import several classes in java 
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TestDinnerTable {

	// main method which throws two exceptions
	public static void main (String[] args) throws DinnerTableException, FileNotFoundException{

		// run the graphical user interface (*need to close the gui windows manually for the rest of the program to proceed)
		ShowImages.main(args);

		// user input which reads the input of the user to see if the program continues or terminates
		char userInput = '0';

		// the program will continue to run as long as user input is not "N" 
		while (userInput != 'N') {
			Scanner input = new Scanner (System.in);
			System.out.println("Please enter the name of the guest data file");

			// object declaration 
			// creating a file object
			java.io.File guestList = new java.io.File(input.next());
			ReadGuestList listScanner = new ReadGuestList();

			// array declaration
			Person[] persons = new Person[listScanner.getNumberOfLines(guestList)];

			// read the guest list
			listScanner.readIn(guestList);

			String[] name = listScanner.getNameList();
			int[] age = listScanner.getAgeList();
			char[] sex = listScanner.getSexList();
			char[] relationshipStatus = listScanner.getRelationshipStatusList();
			char[] isLookingStatus = listScanner.getIsLookingStatusList();
			String[] partnerName = listScanner.getPartnerNameList();

			// create and assign Persons to the "Persons" array
			for (int i = 0; i < listScanner.getNumberOfLines(guestList); i++) {
				if (relationshipStatus[i] == 's')
					persons[i] = new SinglePerson(name[i],age[i],sex[i],relationshipStatus[i],isLookingStatus[i]);
				else if (relationshipStatus[i]=='p')
					persons[i] = new InRelationshipPerson(name[i],age[i],sex[i],partnerName[i]);
				else 
					System.out.print("Error assigning Person Class");
			}

			// create an ArrayList of people at Dinner Party
			ArrayList<Person> people = new ArrayList<>(Arrays.asList(persons));

			// constructs a DinnerTable object
			// use a try-catch loop to perform the function and catch the DinnerTable exception if it is thrown
			try {
				DinnerTable table = new DinnerTable(people);
				System.out.print(table.toString());
			}
			catch (DinnerTableException ex) {
				System.out.print(ex);
			}
			System.out.print("\n\nDo you want to try another file? [Y/N]:\n " );

			// read the user input and convert lowercase input to uppercase and read the input
			String s1 = input.next();
			s1 = s1.toUpperCase();
			userInput=s1.charAt(0);

			// handle an invalid input that it neither "Y" nor "N"
			if(userInput != 'Y' && userInput != 'N') {
				System.out.print("\nInvalid input. " + "\nDo you want to try another file? [Y/N]: ");
				String s2 = input.next();

				// convert the user input to upper case to remove case sensitivity errors
				s2 = s2.toUpperCase();
				userInput = s2.charAt(0);
				System.out.println();
			}
		}
		// program terminates when user input is "N" and displays the following
		System.out.println("\nBye!");
	}
}
