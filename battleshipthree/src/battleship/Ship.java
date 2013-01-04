package battleship;

/* Since we don't really care which end of our ship is the bow and which is the stern,
 * we will consider all ships to be facing up or left. Other parts of the ship are in
 * higher-numbered rows or columns. YOu don't need to write a constructor for this class - 
 * Java will automatically supply one for you (with no arguments)
 * 
 * The fleet: 
 * 1x Battleship 	- Length 4
 * 2x Cruisers 		- Length 3
 * 3x Destroyers	- Length 2
 * 2x Submarines	- Length 1
 */

public class Ship {
	private int bowRow; 			// the row (0-9) which contains the bow (front) of the ship 
	private int bowColumn; 			// the column (0 - 9) which contains the bow (front) of the ship
	int length; 			/* number of squares occupied by the ship. An 'empty sea' location 
							*  has length 1
							*/
	private boolean horizontal; 	// true id the ship occipeis a single row, false otherwise
	private boolean [] hit = new boolean[4]; /* an array of booleans telling whether that part of the
									* ship has been hit. Only battleships use all four 
									* locations; cruisers use the first 3;
									* destroyers 2; submarines 1; and *empty sea* one or none.
									*/ 
	
	/* no constructor required, is created by subclasses.
	* I think this means this is an Interface or an Abstract class?
	*/
	
	// getters - not instance methods
	public int getBowRow() {
		return bowRow;
	}
	
	public int getBowColumn() {
		return bowColumn;
	}
	
	public boolean isHorizontal() {
		return horizontal;
	}
	
	public String getShipType() {
	// this method exists only to be overridden. Doesn't matter what it returns
		return "x";
	}
	
	public int getLength() {
	/* this method exists only to be overridden. Doesn't matter what it returns. An abstract
	* ship doesn't have a fixed length
	*/
		return 0;
	}
	
	// setters - not instance methods
	public void setBowRow(int row) {
		bowRow = row; // not sure this is right
	}
	
	public void setBowColumn(int column) {
		bowColumn = column; // not sure this is right
	}
	
	public void setHorizontal(boolean horizontal) {
		// what goes here? Can't be horizontal = horizontal? 
	}
	
	// Instance Methods
	private boolean okToPlaceShipAt(int row, int column, boolean horizontal, Ocean ocean) {
		/* Returns true if it is okay to put a ship of this length with its bow
		 * in this location, with the given orientation, and returns false otherwise.
		 * The ship must not overlap another ship, or touch another ship (vertically, horizontally,
		 * or diagonally), and it must not *stick out* beyond the array. Does not actually 
		 * change either the ship or the Ocean, just says whether it is legal to do so
		 */
		return true;
	}
	
	private void placeShipAt(int row, int column, boolean horizontal, Ocean ocean) {
		/* *Puts* the ship in the ocean. This involves giving values to the bowRow, bowColumn, 
		 * and horizontal instance variables in the ship, and it also involves putting a reference
		 * to the ship in each of 1 or more locations (up to 4) in the ships array in the Ocean
		 * object. (Note: This will be as many as four identical references; you can't refer to a 
		 * *part* of a ship, only the whole ship.)
		 */
	}
	
	private boolean shootAt(int row, int column) {
		/* If a part of a ship occupies the given row and column, and the ship hasn't been sunk,
		 * mark that part of the ship as *hit* (in the hit array, 0 indicates the bow) and return
		 * true, otherwise return false.
		 */
		return true;
	}
	
	private boolean isSunk() {
		/* Return true if every part of the ship has been hit, false otherwise */
		return true;
	}
	
}
