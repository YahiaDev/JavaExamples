package com.javaexamples.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.javaexamples.Fibonacci.Fibonacci;
import com.javaexamples.Palindrome.Palindrome;

public class MyTests {

	@Test
	public void testIsPalindrome() {
		Palindrome pl = new Palindrome();
		assertFalse("45655 should not be palindrome", pl.isPalindrome(45655));
		assertTrue("45654 is palindrome", pl.isPalindrome(45654));
		assertTrue("22 is palindrome", pl.isPalindrome(22));
	}

	@Test
	public void testFibonacci() {
		Fibonacci fb = new Fibonacci();
		assertEquals("fibonacci of 10 is 55", 55, fb.fibonacci(10));
	}

}
