package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class T2 {
	
	public static void main(String[] args) {
//		IntStream.range(1, 50).forEach(System.out::println);
		List<Integer> lst = Arrays.asList(3,2,5,6,2,7,8,9,10,20,13);
		lst.stream().sorted(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if(o1==o2){
					return 0;
				}
				if(o1-o2>0){
					return 1;
				}else {
					return -1;
				}
			}
		}).forEach(System.out::println);
	}

}
