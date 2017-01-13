public class MaximumSubarrayBruteForce {
	
	public static int[] findMaximumSubarray(int[] a) {
		int max = Integer.MIN_VALUE;
		int temp, si = 0, ei = a.length;
		
		for(int i = 0; i < a.length; ++i) {
			temp = 0;
			for(int j = i; j < a.length; ++j) {
				temp = temp + a[j];
				if(temp > max) {
					max = temp;
					si = i;
					ei = j;
				}
			}
		}
		
		int[] result = new int[]{si,ei,max};

		return result;
	}
}
