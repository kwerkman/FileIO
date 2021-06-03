package com.predicate;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class PredicateRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(3,4,5,12,6,76,8,9);
		Predicate<Integer> evenNumberPredicate = number -> number%2 ==0;
		numbers.stream().filter(evenNumberPredicate).forEach(System.out::println);
		
		//Collections.sort(numbers);
		System.out.println(numbers);
		numbers.forEach(System.out::println );
		
		numbers.stream().forEach(System.out::println);

	}

}
