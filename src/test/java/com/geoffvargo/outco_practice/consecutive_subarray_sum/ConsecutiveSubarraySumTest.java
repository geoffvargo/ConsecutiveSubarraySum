package com.geoffvargo.outco_practice.consecutive_subarray_sum;

import static org.junit.jupiter.api.Assertions.*;

class ConsecutiveSubarraySumTest {
	
	@org.junit.jupiter.api.Test
	void consecSubarraySum_TEST1() {
		int   target = 14;
		int[] arr    = {6, 12, 1, 7, 5, 2, 3};
		assertEquals(true, ConsecutiveSubarraySum.consecSubarraySum(arr, target));
	}
	
	@org.junit.jupiter.api.Test
	void consecSubarraySum_TEST2() {
		int   target = 50;
		int[] arr    = {8, 3, 7, 9, 10, 1, 13};
		assertEquals(false, ConsecutiveSubarraySum.consecSubarraySum(arr, target));
	}
	
	@org.junit.jupiter.api.Test
	void consecSubarraySum_TEST3() {
		int   target = 33;
		int[] arr    = {1, 4, 20, 3, 10, 5};
		assertEquals(true, ConsecutiveSubarraySum.consecSubarraySum(arr, target));
	}
	
	@org.junit.jupiter.api.Test
	void consecSubarraySum_TEST4() {
		int   target = 7;
		int[] arr    = {1, 4, 0, 0, 3, 10, 5};
		assertEquals(true, ConsecutiveSubarraySum.consecSubarraySum(arr, target));
	}
	
	@org.junit.jupiter.api.Test
	void consecSubarraySum_TEST5() {
		int   target = 0;
		int[] arr    = {1, 4};
		boolean actual = ConsecutiveSubarraySum.consecSubarraySum(arr, target);
		System.out.println(actual);
		assertEquals(false, actual);
	}
}