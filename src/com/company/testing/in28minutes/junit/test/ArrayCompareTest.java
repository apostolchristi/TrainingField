package in28minutes;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArrayCompareTest {

	//Arrays.sort

	@Test
	public void  testArraySort_RandomArray() {
		int[] numbers = {12,3,4,1};
		int[] expected = {1,3,4,12};

		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);

	}

	@Test(expected = NullPointerException.class)
	public void  testArraySort_NullArray() {
		int[] numbers = null;
		Arrays.sort(numbers);

	}


	@Test(timeout = 100)
	public void testArraySort_PerformanceOfArray() {
		int array[] = {12, 23, 4};
		for(int i=1; i<100000; i++) {
			array[0] = i;
			Arrays.sort(array);
		}

	}
}
