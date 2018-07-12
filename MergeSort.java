public class MergeSort {
	public static void main(String[] args) {
		int[] testArray = {51, 44, 23, 112, 1451};
		System.out.println("Array:");
		printArray(testArray);
		int[] sortedArray = sortArray(testArray);
		System.out.println("Sorted Array:");
		printArray(sortedArray);
	}
	public static int[] sortArray(int[] inp) {
		int n = inp.length;
		for(int i = 0; i < n; ++i) {

		}
		return merge(sortArray());
	}
	public static int[] merge(int[] a, int[] b) {
		int n = a.length;
		boolean flag = false;
		int[] temp = new int[2n];
		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < n; ++j) {
				if(a[i] > b[j]) {
					temp[i] = b[j];
					flag = true;
				}
			}
		}
	}
	public static void printArray(int[] inp) {
		int n = inp.length;
		for(int i = 1; i <= n; ++i) {
			System.out.println(i + ": " + inp[i-1]);
		}
	}
}
