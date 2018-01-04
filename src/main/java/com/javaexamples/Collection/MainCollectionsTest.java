package com.javaexamples.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.javaexamples.thread.CompteBancaire;

public class MainCollectionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		list.add("yahia");
		list.add("ammmaar");
		list.add("yahia");
		list.add("hahahha");
		list.add("yahia");

		/*
		 * Iterator<String> iterator = list.iterator();
		 * while(iterator.hasNext()){ System.out.println(iterator.next()); }
		 */
		// list.removeIf(string -> string == "yahia");

		/*
		 * for (String string2 : list) { System.out.println(string2); }
		 */

		List<Integer> integers = Arrays.asList(5, 2, 6, 9);
		//integers.sort((i1,i2) -> i2.compareTo(i1));
		integers.stream().sorted(Comparator.comparing(Integer::intValue)).forEach(System.out::println);
		//integers.forEach(System.out::println);

		//list.stream().filter(s -> s != "yahia").map(String::toUpperCase).forEach(System.out::println);

	}

}
