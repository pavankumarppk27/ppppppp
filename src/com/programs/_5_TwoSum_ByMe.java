package com.programs;

import java.util.Arrays;

public class _5_TwoSum_ByMe {

	public static void main(String[] args) {

		int numbers[] = { 2, 7, 11, 1 ,14 ,18 };
		int target = 32;
                String name="pavan kumar";
		int[] twoSum = twoSum(numbers, target);
		System.out.println(Arrays.toString(twoSum));
	}

	public static int[] twoSum(int numbers[], int target) {
      int count=0;
		for (int i = 0; i < numbers.length; i++) {
     
			for (int j = i + 1; j < numbers.length; j++) {
				count++;
				if (numbers[i] + numbers[j] == target) {
					System.out.println(count);
					return new int[] { i,j };
				}
			}
		}
		return new int[] {};
	}
}
