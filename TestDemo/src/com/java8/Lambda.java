package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda {
   public static void main(String[] args) {
	 //ʹ��StringĬ�ϵ�������򣬱Ƚϵ���Person��name�ֶ�
	   Comparator<Person> byName = Comparator.comparing(p->p.getLocation());
	   //����д�������,�������Person������
	   Comparator<Person> byName2 = Comparator.comparing(Person::getName);
	   
	   List<Person> lst = Arrays.asList(new Person("����", "777"),new Person("����", "6666"));
	   lst.stream().sorted(byName).forEach(System.out::println);
	   System.out.println();
	   lst.stream().sorted(byName2).forEach(System.out::println);
}
}
