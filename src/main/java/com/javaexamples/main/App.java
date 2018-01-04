package com.javaexamples.main;

import java.util.Arrays;
import java.util.Optional;

import com.javaexamples.Arbre.Arbre;
import com.javaexamples.Arbre.ArbreBinaire;
import com.javaexamples.sort.BubbleSort;
import com.javaexamples.sort.QuickSort;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		int b = 12;
		//System.out.println(Integer.parseInt("0122", 5));
		int i = 012;
		
		//long l = 1241254545454545454545450d;
		//short y = 199,s2=100,s3=y+s2;
		String s = "yahia";
		Optional<String> ff = Optional.<String>ofNullable(null);
		//System.out.println(ff);
		
		
		int i2= 9;
		System.out.println(i2>>0);

		// test arbre binaire
		/*
		ArbreBinaire arbre6 = new ArbreBinaire(6, null, null);
		ArbreBinaire arbre9 = new ArbreBinaire(9, null, null);
		ArbreBinaire arbre8 = new ArbreBinaire(8, arbre6, arbre9);*/
		
		//end test arbre binaire

		// test arbre

		// Arbre arbre2 = new Arbre(2, null);
		// Arbre arbre3 = new Arbre(3, null);
		// Arbre arbre9 = new Arbre(9, Arrays.asList(arbre2, arbre3));
		// Arbre arbre7 = new Arbre(7, null);
		// Arbre arbre5 = new Arbre(5, null);
		// Arbre arbre8 = new Arbre(8, Arrays.asList(arbre5));
		// Arbre arbre6 = new Arbre(6, Arrays.asList(arbre8, arbre7));
		// Arbre arbre10 = new Arbre(10, Arrays.asList(arbre6, arbre9));
		// System.out.println("Tree display: ");
		// arbre10.displayTree(arbre10, " ");
		// System.out.println("Tree size: " + arbre10.getSize(arbre10));
		// System.out.println("Tree Height: "+arbre10.getHeight(arbre10));
		
		// end test arbre
		// Fibonacci fb = new Fibonacci();
		// System.out.println(fb.fibonacci(10));

		// QuickSort sorter = new QuickSort();
		/*
		 * BubbleSort sorter = new BubbleSort(); int[] input = { 24, 2, 45, 20,
		 * 56, 75, 2, 56, 99, 53, 12 }; sorter.sort(input); for (int i : input)
		 * { System.out.print(i); System.out.print(" "); }
		 */
	}
}
