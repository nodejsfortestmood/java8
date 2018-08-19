package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class T6 {
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("abc", "eqwr", "bcd", "qb", "ehdc", "jk");
		List<String> filtered = strList.stream().filter(x -> x.length() > 2).collect(Collectors.toList());
		System.out.printf("Original List : %s, filtered list : %s %n", strList, filtered);
		System.out.printf("xxxx :%s ,double:%d","kkk",8);
	}
}
