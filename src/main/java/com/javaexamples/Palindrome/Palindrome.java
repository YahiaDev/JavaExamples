package com.javaexamples.Palindrome;

/**
 * 
 * 45654 is Palindrome
 * 
 * @author Yahia AMMAR
 * **/

public class Palindrome {

	public boolean isPalindrome(int myNum) {
		char[] sMyNum = String.valueOf(myNum).toCharArray();
		int toIndex;
		if (sMyNum.length % 2 == 0) {
			toIndex = sMyNum.length / 2;
		} else {
			toIndex = sMyNum.length - 1 / 2;
		}
		int index2 = sMyNum.length - 1;
		//System.out.println("index is " + index2 + "index2" + sMyNum[index2]);
		for (int index1 = 0; index1 < toIndex; index1++) {
			if (sMyNum[index1] != sMyNum[index2]) {
				return false;
			} else {
				index2--;
			}
		}
		return true;

	}

}
