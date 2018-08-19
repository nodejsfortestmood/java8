package com.java8;

import java.util.ArrayList;
import java.util.List;

public class T4 {
    public static void main(String[] args) {
    	 List<Integer> list = new ArrayList<>();
         list.add(1);
         list.add(9);
         list.add(9);
         
         if(9==0){
        	 System.out.println("9==0");
         }

         Integer integer = list.stream().map((i) -> i = i * 3)
             .reduce((c, d) -> c =c+ d).get();
         
         System.out.println(integer);
	}
}
