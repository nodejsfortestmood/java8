package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class T3 {

	public static void main(String[] args) {
		Stream<List<Integer>> inputStream = Stream.of(Arrays.asList(1), Arrays.asList(2, 3), Arrays.asList(4, 5, 6));
		Stream<Integer> outputStream = inputStream.flatMap((childList) -> childList.stream());
		outputStream.forEach(a->{System.out.println(a);});
	}

}
