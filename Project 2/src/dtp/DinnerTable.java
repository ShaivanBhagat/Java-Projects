/* Name: Shaivan Bhagat
  This porject is all my own work
  I have not knowingly allowed others to copy my work */

package dtp;

// import ArrayList class
import java.util.ArrayList;

public class DinnerTable {

	// default no-args constructor
	public DinnerTable() {
	}

	// create an array list which contains the names of the guests at the dinner party
	private ArrayList<Person> guestList = new ArrayList<>();
	private int activeSingles;

	// if the number of singleperson objects looking for a partner is <=1, dinner table exception will be thrown
	// constructor with exception thrown
	public DinnerTable (ArrayList<Person>guestList) throws DinnerTableException {
		this.guestList = guestList;
		checkActiveSingles(guestList);
	}

	// method to check the number of singles in the guest list
	public void checkActiveSingles (ArrayList<Person>guestList) throws DinnerTableException{
		this.activeSingles = 0;
		for (int i = 0; i < guestList.size(); i++) {

			// determine whether the object is an instance of an interface/class
			if (guestList.get(i) instanceof SinglePerson && ((SinglePerson)guestList.get(i)).getIsLooking()=="Y") {
				activeSingles++;
			}
		}
		if (activeSingles <=1) {
			throw new DinnerTableException (activeSingles);
		}
	}
	// getter (accessor) method to return the number of active singles
	public int getActiveSingles() {
		return activeSingles;
	}

	// toString description to dislpay the guest lists
	@Override
	public String toString() {
		return guestList.get(0).toString() +
				guestList.get(1).toString() +
				guestList.get(2).toString() +
				guestList.get(3).toString();
	}

}
