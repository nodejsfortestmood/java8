package com.java8;

import java.util.ArrayList;
import java.util.List;

public class T4 {
    public static void main(String[] args) {
    	 List<Integer> list = new ArrayList<>();
         list.add(6);
         list.add(9);
         list.add(8);
         list.add(3);
         
         if(9==100){
        	 System.out.println("9==10");
         }
         if(9==100){
        	 System.out.println("9==10");
         }

         Integer integer = list.stream().map((i) -> i = i * 3)
             .reduce((c, d) -> c =c+ d).get();
         
         System.out.println(integer);
	}
}
