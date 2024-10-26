/* Name: Shaivan Bhagat
  This porject is all my own work
  I have not knowingly allowed others to copy my work */

package dtp;

//class InRelationshipPerson inherits properties of constructors from Person class 
public class InRelationshipPerson extends Person {

	// data field for the name of the partner
	private String partnerName;

	// default no-args constructor
	public InRelationshipPerson() {

	}

	// specified constructor
	public InRelationshipPerson (String partnerName) {
		this.partnerName = partnerName;
	}

	// specified constructor which also has data fields from the Person class
	public InRelationshipPerson (String firstName, int age, char sexInput, String partnerName) {
		setFirstName(firstName);
		setAge(age);
		setSex(sexInput);
		setRelationshipStatus('p');
		this.partnerName = partnerName;
	}

	// setter (mutator) method to set the name of the partner
	public void setPartnerName (String partnerName) {
		this.partnerName = partnerName;
	}

	// gettter (accessor) method to return the name of the partner
	public String getPartnerName() {
		return partnerName;
	}

	// override to string description which displays the data fields
	@Override
	public String toString() {
		return String.format("\n%4s%6s%8s%3d%7s%3s%25s%4s%11s%19s","Name:",getFirstName(),"Age:",getAge(),"Sex:",getSex(),"Relationship Status:", getRelationshipStatus(),"Partner:", getPartnerName());
	}
}
