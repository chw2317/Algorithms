package com.chw.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * 
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 
 * Example:
 * 	Given nums = [2, 7, 11, 15], target = 9,
 *
 *	Because nums[0] + nums[1] = 2 + 7 = 9,
 *	return [0, 1].
 * 
 * @author 陈汉文
 * @time 2018年4月2日
 * 描述：
 */
public class Two_Sum {

	public static void main(String[] args) {
		int[] nums = new int[]{2, 7, 11, 15};
		int target = 9;
		
		long start = System.currentTimeMillis();
//		int[] result = twoSum0(nums, target);
//		int[] result = twoSum1(nums, target);
		int[] result = twoSum2(nums, target);
		System.out.println("耗时：" + (System.currentTimeMillis() - start) + "ms");
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	/**
	 * 思路0
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum0(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[]{i, j};
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
    }
	
	/**
	 * 思路1
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum1(int[] nums, int target) {
		int len = nums.length;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < len; i++) {
			if (map.containsKey(nums[i])) {
				return new int[]{map.get(nums[i]), i};
			}
			map.put(target - nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	
	/**
	 * 思路2
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum2(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement) && map.get(complement) != i) {
				return new int[]{i, map.get(complement)};
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}



