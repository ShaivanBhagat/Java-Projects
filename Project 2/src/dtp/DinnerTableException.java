/* Name: Shaivan Bhagat
  This porject is all my own work
  I have not knowingly allowed others to copy my work */

package dtp;

// class DinnerTableException inherits properties from the built-in superclass Exception
public class DinnerTableException extends Exception {

	// data field to store the number of active singles
	private int activeSingles;

	// declaring the exception constructor
	public DinnerTableException (int activeSingles) {

		// invoke super argument to get the active singles constructor
		super("Problems with dinner table" + "\nNumber of Singles Looking = " + activeSingles);
	}

	//  getter (accessor) method to return the number of active singles
	public int getActiveSingles() {
		return activeSingles;
	}

}
