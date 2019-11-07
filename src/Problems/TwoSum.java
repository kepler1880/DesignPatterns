package Problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 *
 */

public class TwoSum {
	// Approach 1
	public static int[] twoSum(int[] nums, int target) {
		int[] indices = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int k = i + 1; k < nums.length; k++) {
				if (nums[i] + nums[k] == target) {
					indices[0] = i;
					indices[1] = k;
				}
			}
		}
		return indices;

	}

	// Approach 2
	public static int[] twoSum1(int[] nums, int target) {
		Map<Integer, Integer> indicesMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (indicesMap.containsKey(complement)) {
				return new int[] { indicesMap.get(complement), i };
			}
			indicesMap.put(nums[i], i);
		}
		throw new IllegalArgumentException();
	}

	public static void main(String args[]) {
		int nums[] = { 2, 7, 11, 15 };
		int target = 18;
		int[] indices = twoSum1(nums, target);
		for (int x : indices) {
			System.out.println(x);
		}
	}
}
