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
	
	public static boolean consecSubarraySum(int[] arr, int target) {
		int currSum = arr[0];
		int start   = 0;
		
		for (int i = 1; i < arr.length && currSum != target; ++i) {
			currSum += arr[i];
			if (currSum > target) {
				while (currSum > target) {
					currSum -= arr[start];
					start++;
				}
			}
			if (currSum == target) {
				return true;
			}
		}
		return false;
	}
}
