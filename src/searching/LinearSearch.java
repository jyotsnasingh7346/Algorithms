package searching;

public class LinearSearch {

	
	public static void main(String[] args) {
		
		int[] arr = {3,5,2,7,4,6,1};
		
		int target = 6;
		
		int index = linearSearch(arr, target);
		
		System.out.println("Element " + target + " found at index: " + index);
		
	}

	private static int linearSearch(int[] arr, int n) {
		
		int index = -1;
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] == n) {
				index = i;
				return index;
			}
		}
		
		return index;
	}
}
