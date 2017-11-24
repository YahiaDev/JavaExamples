package com.javaexamples.Fibonacci;

/**
 * 1 1 2 3 5 8 13 21 ... 
 * 
 * f(0) = 1
 * f(1) = 1
 * f(5) = 8
 * 
 * @author Yahia AMMAR
 * */

public class Fibonacci { 
	public int fibonacci(int f) {
		if (f == 0)
			return 0;
		else if (f == 1 || f == 2)
			return 1;
		else
			return fibonacci(f - 1) + fibonacci(f - 2);
	}

}
