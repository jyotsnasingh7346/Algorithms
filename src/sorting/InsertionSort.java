package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] arr = {3,5,2,7,4,6,1};
		
		insertionSort(arr);
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
	}

	private static void insertionSort(int[] arr) {
		
				// {3,5,2,4,1};
		
		// i=1, j=0, arr[j]=3, key=5
			// 1 -> {3,5,2,4,1}
		
		// i=2, j=0, arr[j]=5, key=2
			// {3,5,2,4,1}
			// 2 -> {3,5,5,4,1}; j=0
			// 2 -> {3,3,5,4,1}; j=-1;
			// 2 -> {2,3,5,4,1};
		
		// and so on...
		
		int n = arr.length;
		
		for (int i=1; i<n; ++i) {
			
			int j = i-1;
			int key = arr[i];
			
			/* Move elements of array[0..i-1], that are
            greater than key, to one position ahead
            of their current position */
			
			while (j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			
			arr[j+1] = key;
			
		}
		
	}

}
