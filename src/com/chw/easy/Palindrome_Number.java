package com.chw.easy;

/**
 * 
 * @author 陈汉文
 * @time 2018年4月2日
 * 描述：
 */
public class Palindrome_Number {

	public static void main(String[] args) {
		
	}
	
	public static boolean isPalindrome(int x) {
		boolean isPalindrome = false;
		int y = x;
		long res = 0;
		if (x < 0) {
			return isPalindrome;
		}
		for (; x != 0; x /= 10) {
			res = res * 10 + x % 10;
		}
		if (res == y) {
			isPalindrome = true;
		}
		return isPalindrome;
	}
}



























