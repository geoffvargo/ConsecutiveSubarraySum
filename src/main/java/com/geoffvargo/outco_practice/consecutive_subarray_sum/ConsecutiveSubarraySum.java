package com.geoffvargo.outco_practice.consecutive_subarray_sum;

import java.util.*;

/**
 * Given an array of positive integers and a target value, return true if there is a subarray of consecutive elements that sum up to this target value.
 * <pre>
 *      Input: Array of integers, target value
 *      Output: Boolean
 * </pre>
 * <h3>Example:</h3>
 * <pre>
 *      Input: [6,12,1,7,5,2,3], 14     =>    Output: true (7+5+2)
 *      Input: [8,3,7,9,10,1,13], 50    =>    Output: false
 * </pre>
 * <h3>Constraints:</h3>
 * <pre>
 *      Time Complexity: O(N)
 *      Auxiliary Space Complexity: O(1)
 *      All elements are positive
 * </pre>
 */
public class ConsecutiveSubarraySum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a positive integer sum: ");
		int target = input.nextInt();
		
		System.out.println("Enter a bunch of positive integers: ");
		String str = input.nextLine();
		
		int[]   arr = Arrays.stream(str.split("\\D+")).mapToInt(Integer::parseInt).toArray();
		boolean ans = consecSubarraySum(arr, target);
		
		System.out.println(ans);
	}
	
	/**
	 * Efficient Approach: There is an idea if all the elements of the array are positive. If a subarray has sum greater than the given sum then there is no possibility that adding elements to the current subarray the sum will be x (given sum). Idea is to use a similar approach to a sliding window. Start with an empty subarray, add elements to the subarray until the sum is less than x. If the sum is greater than x, remove elements from the start of the current subarray.
	 * Algorithm:
	 * <p>
	 * Create three variables, l=0, sum = 0
	 * Traverse the array from start to end.
	 * Update the variable sum by adding current element, sum = sum + array[i]
	 * If the sum is greater than the given sum, update the variable sum as sum = sum – array[l], and update l as, l++.
	 * If the sum is equal to given sum, print the subarray and break the loop.
	 */
	public static boolean consecSubarraySum(int[] arr, int target) {
		if (target == 0 && arr.length > 0) {
			return false;
		}
		
		int left = 0;
		int sum  = arr[0];
		
		int i;
		for (i = 1; i < arr.length; i++) {
			while (sum > target) {
				sum -= arr[left];
				left++;
			}
			if (sum == target) {
				return true;
			}
			sum += arr[i];
		}
		
		return false;
	}
}
