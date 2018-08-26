package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Compare  implements Comparable<Integer>{

	@Override
	public int compareTo(Integer o) {
		System.out.println("ok");
		System.out.println("ok");
		
		
		List<Integer> numbers = Arrays.asList(9, 10, 3, 8, 7, 3, 4,99);
		List<Integer> distinct = numbers.stream().map( i -> i*i*i).distinct().collect(Collectors.toList());
		System.out.printf("Original List : %s,  Square Without duplicates : %s %n", numbers, distinct);
		return 0;
	}

	

}
