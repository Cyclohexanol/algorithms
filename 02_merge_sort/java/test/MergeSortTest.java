import static org.junit.Assert.*;

import org.junit.Test;

public class MergeSortTest {

	@Test
	public void sorting() {
		int[] list = {3,2,7,-2,9,6};
		MergeSort.sort(list);
		
		assertArrayEquals(new int[]{-2,2,3,6,7,9},list);
	}
}
