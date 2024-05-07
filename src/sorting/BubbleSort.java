package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {3,5,2,7,4,6,1};
		
		bubbleSort(arr);
		
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	private static void bubbleSort(int[] arr) {
		
		int n = arr.length;
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n-i-1; j++) {
				
				if (arr[j] > arr[j+1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}

}