package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda {
   public static void main(String[] args) {
	 //使用String默认的排序规则，比较的是Person的name字段
	   Comparator<Person> byName = Comparator.comparing(p->p.getLocation());
	   //不用写传入参数,传入的用Person来声明
	   Comparator<Person> byName2 = Comparator.comparing(Person::getName);
	   
	   List<Person> lst = Arrays.asList(new Person("李四", "777"),new Person("王五", "6666"));
	   lst.stream().sorted(byName).forEach(System.out::println);
	   System.out.println();
	   lst.stream().sorted(byName2).forEach(System.out::println);
}
}
