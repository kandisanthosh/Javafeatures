package com.java8.streams.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
//1) Given a list of integers, separate odd and even numbers
public class OddEvenNnumbersExample {

	public static void main(String[] args) {

		List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

		Map<Boolean, List<Integer>> offEvenIntegerMap = listOfIntegers.stream()
				.collect(Collectors.partitioningBy(i -> i % 2 == 0));

		System.out.println("offEvenIntegerMap");

		Set<Entry<Boolean, List<Integer>>> entrySet = offEvenIntegerMap.entrySet();

		entrySet.stream().forEach(e -> {

			System.out.println("--------------");

			if (e.getKey()) {

				System.out.print("even numbers");

			} else {
				System.out.print("odd numbers");
			}

			System.out.println("--------------");

			e.getValue().forEach(i -> System.out.println(i));

		});
	}

}
