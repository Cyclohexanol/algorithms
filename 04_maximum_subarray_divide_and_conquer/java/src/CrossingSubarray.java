public class CrossingSubarray {

	public static int[] findMaximumSubarray(int[] a) {
		return findMaximumSubarray(a, 0, a.length-1);
	}

	private static int[] findMaximumSubarray(int[] a, int low, int high) {
		
		if(low == high) 
			return new int[]{low,high,a[low]};
		else {
			int mid = (low + high)/2;
			int[] left = findMaximumSubarray(a, low, mid);
			int[] right = findMaximumSubarray(a, mid + 1 , high);
			int[] cross = findCrossingSubarray(a, low, mid, high);
			if(left[2] >= right[2] && left[2] >= cross[2])
				return left;
			else if(right[2] >= left[2] && right[2] >= cross[2])
				return right;
			else
				return cross;
		}
	}

	private static int[] findCrossingSubarray(int[] a, int low, int mid, int high) {
		int sum = 0;
		int leftSum = Integer.MIN_VALUE;
		int maxLeft = mid;
		for(int i = mid; i >= 0; --i){
			sum += a[i];
			if(sum > leftSum) {
				leftSum = sum;
				maxLeft = i;
			}
		}
		sum = 0;
		int rightSum = Integer.MIN_VALUE;
		int maxRight = mid + 1;
		for(int i = mid + 1; i <= high; ++i){
			sum += a[i];
			if(sum > rightSum) {
				rightSum = sum;
				maxRight = i;
			}
		}
		return new int[]{maxLeft,maxRight,leftSum + rightSum};
	}
}
