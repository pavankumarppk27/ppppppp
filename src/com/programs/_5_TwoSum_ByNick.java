package com.programs;

import java.util.Arrays;

public class _5_TwoSum_ByNick {

	public static void main(String[] args) {

		int numbers[] = { 2, 7, 11, 1 ,14 ,18 };
		int target = 12;
		int[] twoSum = twoSum(numbers, target);
		System.out.println(Arrays.toString(twoSum));
	}

	public static int[] twoSum(int numbers[], int target) {
		
		int a_pointer = 0;
		int b_pointer = numbers.length - 1;

		while (a_pointer <=b_pointer) {
			
			int sum = numbers[a_pointer] + numbers[b_pointer];
			if (sum > target) {
				b_pointer -= 1;
			} else if (sum < target) {
				a_pointer += 1;
			} else {
				
				return new int[] { a_pointer, b_pointer };
			}
		}
		return new int[] {};
	}
}
