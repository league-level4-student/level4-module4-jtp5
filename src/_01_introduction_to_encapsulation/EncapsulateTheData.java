package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.*;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private int itemsReceived; //must not be negative. All negative arguments get set to 0.
	
	int getItemsReceived() {
		return itemsReceived;
	}
	
	void setItemsRecieved(int x) {
		if(x < 0) {
			itemsReceived = 0;
		}
		else {
			itemsReceived = x;
		}
	}
	
	float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	
	float getDegreesTurned() {
		return degreesTurned;
	}
	
	void setDegreesTurned(float f) {
		if(f < 0) {
			degreesTurned = 0.0f;
		}
		else if (f > 360.0f) {
			degreesTurned = 360.0f;
		}
		else {
			degreesTurned = f;
		}
	}
	
	String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	
	String getNomenclature() {
		return nomenclature;
	}
	
	void setNomenclature(String s) {
		if(s.equals("")) {
			nomenclature = " ";
		}
		else {
			nomenclature = s;
		}
	}
	
	Object memberObj; //can be any object type except String. Strings get turned into objects.
	
	Object getMemberObj() {
		return memberObj;
	}
	
	void setMemberObj(Object o) {
		if(o instanceof String) {
			memberObj = new Object();
		}
		else {
			memberObj = o;
		}
	}
	
	public static void main(String[] args) {
		assertEquals(64, 64);
	}
}
