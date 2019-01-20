package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncapsulateTheDataTest {
EncapsulateTheData t = new EncapsulateTheData();
		@Test
	void testSetItemsRecieved() {
		t.setItemsRecieved(4);
		assertEquals(4, t.getItemsReceived());
	}

	@Test
	void testSetDegreesTurned() {
		t.setDegreesTurned(20.7f);
		assertEquals(20.7f, t.getDegreesTurned());
	}

	@Test
	void testSetNomenclature() {
		t.setNomenclature("Nomen");
		assertEquals("Nomen", t.getNomenclature());
	}

	@Test
	void testSetMemberObj() {
		t.setMemberObj(new Integer(4));
		assertEquals(4, t.getMemberObj());
	}

}
