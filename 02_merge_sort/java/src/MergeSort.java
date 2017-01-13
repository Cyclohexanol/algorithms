public class MergeSort {

	public static void sort(int[] list) {
		sort(list, 0, list.length-1);
	}

	private static void sort(int[] list, int p, int r) {
		if (p < r) {
			int q = (p + r) / 2;
			sort(list, p, q);
			sort(list, q + 1, r);
			merge(list, p, q, r);
		}
	}

	public static void merge(int[] list, int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;
		int[] l1 = new int[n1+1];
		int[] l2 = new int[n2+1];

		for (int i = 0; i < n1; ++i)
			l1[i] = list[p + i];

		for (int i = 0; i < n2; ++i)
			l2[i] = list[q + i + 1];
		
		l1[n1] = Integer.MAX_VALUE;
		l2[n2] = Integer.MAX_VALUE;

		int i = 0;
		int j = 0;

		for (int k = p; k < r + 1; ++k) {
			if (l1[i] <= l2[j])
				list[k] = l1[i++];
			else
				list[k] = l2[j++];
		}
	}
}
