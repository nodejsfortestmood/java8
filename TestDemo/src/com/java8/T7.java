package com.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class T7 {
   public static void main(String[] args) {
	   String str = "abc";
       Optional.ofNullable(str).ifPresent(System.out::println);
       
       Map<String,Object> map = new HashMap<>();
       map.put("A", "a");
       map.put("B", "b");
       map.put("C", "c");
       map.put("D", "d");
       map.put("E", "e");
       
       map.forEach((String k,Object v)->{
    	   System.out.printf("k:%s,v:%s %n",k,v);
       });
}
}
