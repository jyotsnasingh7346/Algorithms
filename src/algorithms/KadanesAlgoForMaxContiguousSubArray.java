package algorithms;

public class KadanesAlgoForMaxContiguousSubArray {

	public static void main(String[] args) {
		/*
		 * Given an array arr[] of N integers. 
		 * Find the contiguous sub-array(containing at least one number) 
		 * which has the maximum sum and return its sum.
		 */
		
		int[] arr = {1,2,3,-2,5};
		int N = arr.length;
		
		int maxSubArraySum = getMaxSubArraySum(arr, N);
		System.out.println("Kadanes Algorithm gives Max Sub Array Sum as : " + maxSubArraySum);
		
	}

	private static int getMaxSubArraySum(int[] arr, int N) {
		// TODO Auto-generated method stub
		
		int maxEndingHere = 0;
		int maxSoFar = Integer.MIN_VALUE;
		
		if (arr == null || arr.length == 0)
			return 0;
		
		for (int i : arr) {
			maxEndingHere = Math.max(i, maxEndingHere + i);
			maxSoFar = Math.max(maxEndingHere, maxSoFar);
		}
		
		
		return maxSoFar;
	}
	
}