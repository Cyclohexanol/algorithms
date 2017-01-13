import static org.junit.Assert.*;

import org.junit.Test;

public class MaximumSubarrayBruteForceTest {

	@Test
	public void findMaximumSubarrayTest() {
		int[] array = {-2,-4,3,-1,5,7,-7};
		int[] maxArray = MaximumSubarrayBruteForce.findMaximumSubarray(array);
		
		assertArrayEquals(new int[]{2,5,14},maxArray);
	}
}
