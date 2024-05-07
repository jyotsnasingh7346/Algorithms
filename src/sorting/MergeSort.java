package sorting;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 3, 5, 2, 7, 4, 6, 1 };
		sort(arr, 0, arr.length - 1);

		System.out.println("Sorted array: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
	
	  public static void sort(int[] arr, int left, int right) {
	    if (left < right) {
	    	
	      // 1. Find the middle point of the sub-array
	      int mid = left + (right - left) / 2;

	      // 2. Sort first and second halves recursively
	      sort(arr, left, mid);
	      sort(arr, mid + 1, right);

	      // 3. Merge the sorted halves
	      merge(arr, left, mid, right);
	    }
	    
	  }

	  private static void merge(int[] arr, int left, int mid, int right) {
	    
		  // 1. Create temporary arrays to hold left and right sub-arrays
	    int n1 = mid - left + 1;
	    int n2 = right - mid;
	    int[] leftArr = new int[n1];
	    int[] rightArr = new int[n2];

	    System.arraycopy(arr, left, leftArr, 0, n1);
	    System.arraycopy(arr, mid + 1, rightArr, 0, n2);

	    // 2. Merge the temporary arrays back into the original array
	    int i = 0, j = 0, k = left;
	    while (i < n1 && j < n2) {
	      if (leftArr[i] <= rightArr[j]) {
	        arr[k] = leftArr[i];
	        i++;
	      } else {
	        arr[k] = rightArr[j];
	        j++;
	      }
	      k++;
	    }

	    // 3. Copy the remaining elements of leftArr, if there are any
	    while (i < n1) {
	      arr[k] = leftArr[i];
	      i++;
	      k++;
	    }

	    // 4. Copy the remaining elements of rightArr, if there are any
	    while (j < n2) {
	      arr[k] = rightArr[j];
	      j++;
	      k++;
	    }
	  }

	}
