/* Name: Shaivan Bhagat
  This porject is all my own work
  I have not knowingly allowed others to copy my work */

package dtp;

// class SinglePerson inherits properties of constructors from Person class 
public class SinglePerson extends Person {

	// data field if the person is looking for a partner
	private String isLooking;

	// default no-args constructor
	public SinglePerson() {

	}

	// specified constructor 
	public SinglePerson (char input) {
		setIsLooking (input);
	}

	// specified constructor
	public SinglePerson (String firstName, int age, char sexInput, char relationshipStatusInput, char input) {
		setFirstName(firstName);
		setAge(age);
		setSex(sexInput);
		setRelationshipStatus(relationshipStatusInput);
		setIsLooking(input);
	}

	// getter (accessor) method to return if the person is looking for a partner
	public String getIsLooking() {
		return isLooking;
	}

	// setter (mutator) method to set the value based on user input
	public void setIsLooking (char input) {
		if (input == 'y')
			this.isLooking = "Y";
		else if (input == 'n')
			this.isLooking = "N";
		else
			this.isLooking = "N/A";
	}

	// override to string description which displays the data fields
	@Override
	public String toString() {
		return String.format("\n%4s%6s%8s%3d%7s%3s%25s%4s%25s%4s", "Name:", getFirstName(), "Age:",getAge(),"Sex:",getSex(),"Relationship Status:", getRelationshipStatus(),"Looking for a Partner?", getIsLooking());
	}

}
