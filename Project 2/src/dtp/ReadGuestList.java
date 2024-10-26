/* Name: Shaivan Bhagat
  This porject is all my own work
  I have not knowingly allowed others to copy my work */

package dtp;

// import java classes
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadGuestList {

	// data fields
	private String[] firstName;
	private int[] age;
	private char[] sex;
	private char[] relationshipStatus;
	private char[] isLookingStatus;
	private String[] partnerName;
	private int numberOfLines;

	// default no-args constructor
	public ReadGuestList() {

	}

	// methdo to run the number of the lines contained in the text files while catching an exception if file is not found
	public int getNumberOfLines(java.io.File guestList) {

		// try-catch loop to count the number of lines in the text file
		try {
			Scanner input = new Scanner (guestList);
			this.numberOfLines = 0;
			while (input.hasNext()) {
				input.nextLine();
				numberOfLines++;
			}
		}

		// catch the exception if a file is not found/present
		catch (FileNotFoundException ex) {
			//ex.printStackTrace();
			System.out.printf(ex + "%55s","Restart the program and enter a different file.");

			// terminate the program incase of a file not found exception
			System.exit(1);
		}
		return numberOfLines;
	}

	// read through the guest list file
	public void readIn (java.io.File guestList) {

		// try-catch loop to read through the text files
		try {
			Scanner input = new Scanner(guestList);
			this.firstName = new String[getNumberOfLines(guestList)];
			this.age = new int[getNumberOfLines(guestList)];
			this.sex = new char[getNumberOfLines(guestList)];
			this.relationshipStatus = new char[getNumberOfLines(guestList)];
			this.isLookingStatus = new char[getNumberOfLines(guestList)];
			this.partnerName = new String[getNumberOfLines(guestList)];

			for(int i = 0; i < getNumberOfLines(guestList); i++) {
				String s = input.nextLine();
				String[] guestData = s.split(" ");

				firstName[i] = guestData[0];
				age[i] = Integer.parseInt(guestData[1]);
				sex[i] = guestData[2].charAt(0);
				relationshipStatus[i] = guestData[3].charAt(0);
				if (guestData[4].equalsIgnoreCase("y") || guestData[4].equalsIgnoreCase("n")==true) {
					isLookingStatus[i] = guestData[4].charAt(0);
				}
				else {
					partnerName[i] = guestData[4];
				}	
			}
		}

		// catch the exception if the file does not exist
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}

	// getter (accessor) method to return the first name of the person
	public String[] getNameList() {
		return firstName;
	}

	// getter (accessor) method to return the age of the person
	public int[] getAgeList() {
		return age;
	}

	// getter (accessor) method to return the sex of the person
	public char[] getSexList() {
		return sex;
	}

	// getter (accessor) method to return the relationship status of the person
	public char[] getRelationshipStatusList() {
		return relationshipStatus;
	}

	// getter (accessor) method to return if the person is looking for a partner
	public char[] getIsLookingStatusList() {
		return isLookingStatus;
	}

	// getter (accessor) method to return the name of the partner
	public String[] getPartnerNameList() {
		return partnerName;
	}

}












