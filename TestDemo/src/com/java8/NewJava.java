package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewJava {

	public static void main(String[] args) {
		  List<Integer> list = new ArrayList<>();
	        list.add(1);
	        list.add(2);
	        list.add(3);

	        // 可改变对象
	        list.stream().map((i) -> i * 3).forEach(System.out::println);
             System.out.println();
	        // 不可改变原有对象
	        list.forEach(i -> i = i * 3);
	        list.forEach(System.out::println);
	        
	        List<String> lst2 = Arrays.asList("A","B","C");
	        List<String> lst3 = new ArrayList<>();
	        lst2.stream().map(String::toLowerCase).forEach(a->lst3.add(a));
	        lst3.stream().forEach(a->System.out.println(a));
	        lst2.stream().forEach(a->System.out.println(a));
	}

}
