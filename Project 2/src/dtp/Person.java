/* Name: Shaivan Bhagat
  This porject is all my own work
  I have not knowingly allowed others to copy my work */

package dtp;

public class Person {

	// data fields
	private String firstName;
	private int age;
	private String sex;
	private String relationshipStatus;

	// default no-args constructor
	public Person() {

	}

	// specified constructor with arguments passed
	public Person (String firstName, int age, char sexInput, char relationshipStatusInput) {
		this.firstName = firstName;
		this.age = age;
		setSex (sexInput);
		setRelationshipStatus (relationshipStatusInput);
	}

	// create the getter (accessor) and setter (mutator) methods for the data fields to set and return them
	//Create a getter (accessor method) to return the first name	
	String getFirstName() {
		return firstName;
	}

	//Create a setter (mutator method) to update the first name
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}

	//Create a getter (accessor method) to return the age
	public int getAge(){
		return age;
	}

	//Create a setter (mutator method) to update the age of the person
	public void setAge (int newAge) {
		age = newAge;
	}

	//Create a getter (accessor method) to return the sex of the person
	public String getSex() {
		return sex;
	}

	//Create a setter (mutator method) to update the sex of the person
	public void setSex (char sexInput) {
		if (sexInput == 'm')
			this.sex = "M";
		else if (sexInput == 'f')
			this.sex = "F";
		else
			this.sex = "N/A";
	}

	//Create a getter (accessor method) to return the relationship status of the person
	public String getRelationshipStatus() {
		return relationshipStatus;
	}

	//Create a setter (mutator method) to update the relationship status of the person
	public void setRelationshipStatus (char relationshipStatusInput) {
		if (relationshipStatusInput == 's')
			this.relationshipStatus = "S";
		else if (relationshipStatusInput == 'p')
			this.relationshipStatus = "P";
		else
			this.relationshipStatus = "N/A";
	}

	// toString description method to display the data fields
	public String toString() {
		return String.format("\n%5s%5s%5s%5d%5s%5s%5s%5s", "Name:", getFirstName(),"Age:", getAge(), "Sex:", getSex(), "Relationship Status: ",getRelationshipStatus()); 
	}

}











