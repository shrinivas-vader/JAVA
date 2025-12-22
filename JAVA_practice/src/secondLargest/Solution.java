package secondLargest;

import java.util.Arrays;

class Solution {
    public static int getSecondLargest(int[] arr) {
        // Code Here
        Arrays.sort(arr);
        int n =3;
        int secondLast = arr[arr.length-2];
        System.out.println("loop "+arr[arr.length -n]);
        while(secondLast != arr[arr.length -n]){
            secondLast = arr[arr.length -n];
            n++;
        }
        return secondLast;
    }
    
    public static void main(String[] args) {
		int[] arr =  {2,3,3,1};
		System.out.println(getSecondLargest(arr));
	}
}