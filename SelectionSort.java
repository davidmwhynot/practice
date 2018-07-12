public class SelectionSort {
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
			int key = inp[i];
			int min = i;
			for(int j = i+1; j < n; ++j) {
				if(inp[j] < inp[min]) {
					min = j;
				}
			}
			int temp = inp[i];
			inp[i] = inp[min];
			inp[min] = temp;
		}
		return inp;
	}
	public static void printArray(int[] inp) {
		int n = inp.length;
		for(int i = 1; i <= n; ++i) {
			System.out.println(i + ": " + inp[i-1]);
		}
	}
}
