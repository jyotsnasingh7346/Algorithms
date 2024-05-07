package searching;

public class BinarySerach {

	public static void main(String[] args) {
		// Used for sorted arrays
		
		int[] arr = {1,2,3,4,5};
		
		int target = 4;
		
		int index = binarySearch(arr, target);
		
		System.out.println("Element " + target + " found at index: " + index);

	}

	private static int binarySearch(int[] arr, int target) {
		
		int low = 0;
		int high = arr.length - 1;
		
		while (low <= high) {
			int mid = low + (high-low) / 2;
			
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		
		return -1;
	}

}
