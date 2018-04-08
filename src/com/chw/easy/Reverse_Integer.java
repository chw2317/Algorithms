package com.chw.easy;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * 
 * Example 1:
 *
 *	Input: 123
 *	Output:  321
 *
 * Example 2:
 *
 *	Input: -123
 *	Output: -321
 *
 * Example 3:
 *
 *	Input: 120
 *	Output: 21
 *
 * Note:
 *	Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range.
 *	For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 *
 * @author 陈汉文
 * @time 2018年4月2日
 * 描述：给你一个整型数，求它的逆序整型数，当它的逆序整型数溢出的话，那么就返回0
 */
public class Reverse_Integer {

	public static void main(String[] args) {
		int x = -150; 
//		x = reverse0(x);
		x = reverse1(x);
		System.out.println(x);
		
		
		System.out.println(32 % 10);
	}
	
	/**
	 * 思路0
	 * 
	 * @param x
	 * @return
	 */
	public static int reverse0(int x) {
		String str = String.valueOf(x);
		StringBuilder sb = new StringBuilder(str);
		sb = sb.reverse();
		if (x < 0) {
			if (Long.valueOf("-" + sb.toString().replace("-", "")) < Integer.MIN_VALUE) {
				x = 0;
			} else {
				x = Integer.valueOf("-" + sb.toString().replace("-", ""));
			}
		} else {
			if (Long.valueOf(sb.toString()) > Integer.MAX_VALUE) {
				x = 0;
			} else {
				x = Integer.valueOf(sb.toString());
			}
		}
        return x;
    }
	
	/**
	 * 思路1
	 * 
	 * @param x
	 * @return
	 */
	public static int reverse1(int x) {
		long res = 0;
        for (; x != 0; x /= 10)
            res = res * 10 + x % 10;
        return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0 : (int) res;
    }
}



























