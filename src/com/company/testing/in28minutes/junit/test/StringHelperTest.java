package in28minutes;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {

	StringHelper helper = new StringHelper();

	//AACD => CD ACD => CD CDEF => CDEF CDAA => CDAA
	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition3() {
		assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition4() {
		assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
	}


	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		assertFalse("Dummy String" , helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}

	// ABCD => false, ABAB => true, AB => true, A => false

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
		assertTrue("Dummy String" , helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}


}