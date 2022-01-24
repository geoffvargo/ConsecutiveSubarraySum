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
}