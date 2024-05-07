package sorting;

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = {3,5,2,7,4,6,1};
		
		selectionSort(arr);
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
	}

	private static void selectionSort(int[] arr) {

		/*
		 * selects the lowest element from the unsorted part of the array,
		 * swaps it with the 1st element of the unsorted array
		 * and now new unsorted part of the array is from i+1;
		 */
		
		int n = arr.length;
		
		for (int i=0; i<n; i++) {
			
			int minIndex = i;
			
			for (int j=i+1; j<n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			
			// swap
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			
		}
		
	}

}
