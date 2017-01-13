public class InsertionSort {

	public static void sort(int[] list) {
		int len = list.length;
		int val, i;
		
		for(int j = 1; j<len; j++) {
			val = list[j];
			i = j - 1;
			
			while(i >= 0 && list[i] > val)
				list[i+1] = list[i--];
			
			list[i+1] = val;
		}
	}

}
