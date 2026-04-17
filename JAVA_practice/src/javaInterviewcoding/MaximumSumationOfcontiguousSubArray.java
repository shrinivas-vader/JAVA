package javaInterviewcoding;

public class MaximumSumationOfcontiguousSubArray {

	public static void main(String[] args) {
		
		int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		
		int current=0;
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			 current = Math.max(arr[i], current + arr[i]);
			if(current>max) {
				max=current;
			}
		}
		System.out.println("Maximum summation of continugeous subarray is "+max);
	}
}
