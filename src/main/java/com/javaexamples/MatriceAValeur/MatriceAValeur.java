package com.javaexamples.MatriceAValeur;


/**
 *   0 1 2  3  4  5
 * 0 1 
 * 1 1 1
 * 2 1 2 1
 * 3 1 3 3  1
 * 4 1 4 6  4  1
 * 5 1 5 10 10 5 1
 * 
 * c (5,3) = 10
 * 
 * @author Yahia AMMAR
 * **/

public class MatriceAValeur {

	public String calculateSomme(int l, int c) {
		System.out.println("call calculateSomme with l = " + l + " and c = " + c);
		if (c == 0)
			return "1";
		else if (c == 1 || c == (l - 1)) {
			// System.out.println(c);
			return String.valueOf(l);
		} else {
			// String sfirstName = calculateSomme(l - 1, c - 1);
			// String sSecondName = calculateSomme(l - 1, c);

			int firstNum = Integer.parseInt(calculateSomme(l - 1, c - 1));
			int secondNum = Integer.parseInt(calculateSomme(l - 1, c));
			return String.valueOf(firstNum + secondNum);

		}
	}

}
