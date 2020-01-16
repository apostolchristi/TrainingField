package in28minutes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class StringHelperParameterizedBooleanTest {

	StringHelper helper = new StringHelper();
	private String input;
	private boolean expectedOutput;

	public StringHelperParameterizedBooleanTest(String input, boolean expectedOutput) {
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> testConditions() {
		Object expectedOutput[][] = { { "ABCD", false}, {"ABAB", true}};
		return Arrays.asList(expectedOutput);
	}




	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		assertEquals(expectedOutput,helper.areFirstAndLastTwoCharactersTheSame(input));
	}



}
